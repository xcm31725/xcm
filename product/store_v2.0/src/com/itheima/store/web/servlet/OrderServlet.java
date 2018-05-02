package com.itheima.store.web.servlet;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.store.domain.Cart;
import com.itheima.store.domain.CartItem;
import com.itheima.store.domain.Order;
import com.itheima.store.domain.OrderItem;
import com.itheima.store.domain.PageBean;
import com.itheima.store.domain.User;
import com.itheima.store.service.OrderService;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.BeanServlet;
import com.itheima.store.utils.PaymentUtil;
import com.itheima.store.utils.UUIDUtils;

/**
 * 订单模块的Servict
 * @author sudong
 *
 */
public class OrderServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * 生成订单的执行的方法：saveOrder
	 * @param req
	 * @param resp
	 * @return
	 */
	public String saveOrder(HttpServletRequest req, HttpServletResponse resp) {
		//封装Order对象
		Order order = new Order();
		order.setOid(UUIDUtils.getUUID());
		order.setOrdertime(new Date());
		order.setState(1);//1为未付款
		//设置总金额：              从购物车中获得订单的总金额
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		if(cart == null) {
			req.setAttribute("msg", "购物车是空的哦！");
			return "/jsp/msg.jsp";
		}
		order.setTotal(cart.getTotal());
		//设置订单所属的用户：        从登陆的信息中获得用户的信息
		User existUser = (User) req.getSession().getAttribute("existUser");
		if(existUser == null) {
			req.setAttribute("msg", "您还没有登陆，请先去登陆！");
			return "/jsp/login.jsp";
		}
		order.setUser(existUser);
		//设置订单项
		for (CartItem cartItem : cart.getMap().values()) {
			OrderItem orderItem = new OrderItem(); 
			orderItem.setItemid(UUIDUtils.getUUID());
			orderItem.setCount(cartItem.getCount());
			orderItem.setSubtotal(cartItem.getSubtotal());
			orderItem.setProduct(cartItem.getProduct());
			orderItem.setOrder(order);
			
			order.getOrderItems().add(orderItem);
		}
		
		//调用业务层完成保存
		OrderService orderService = (OrderService) BeanFactory.getBean("orderService");
		orderService.save(order);
		
		//清除购物车
		cart.clearCart();
		
		//页面跳转
		req.setAttribute("order", order);
		return "/jsp/order_info.jsp";
		
	}

	/**
	 * 根据用户的ID查询订单：findByUid
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findByUid(HttpServletRequest req,HttpServletResponse resp){
		try {
			//接收参数
			Integer currPage = Integer.parseInt(req.getParameter("currPage"));
			//获得登陆中的用户名
			User user = (User) req.getSession().getAttribute("existUser");
			
			//调用业务层
			OrderService orderService = (OrderService) BeanFactory.getBean("orderService");
			PageBean<Order> pageBean = orderService.findByUid(user.getUid(),currPage);
			
			req.setAttribute("pageBean", pageBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/jsp/order_list.jsp";
	}
	
	/**
	 * 根据订单id查询订单的方法：findByOid
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findByOid(HttpServletRequest req,HttpServletResponse resp){
		try {
			String oid = req.getParameter("oid");
			
			OrderService orderService = (OrderService) BeanFactory.getBean("orderService");
			Order order = orderService.findByOid(oid);
			
			req.setAttribute("order", order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/jsp/order_info.jsp";
	}
	
	/**
	 * 为订单付款的方法
	 * @param req
	 * @param resp
	 * @return
	 */
	public String payOrder(HttpServletRequest req,HttpServletResponse resp){
		try {
			//接收参数
			String oid = req.getParameter("oid");
			String name = req.getParameter("name");
			String address = req.getParameter("address");
			String telephone = req.getParameter("telephone");
			String pd_FrpId = req.getParameter("pd_FrpId");
			
			// 修改数据库 姓名，地址，电话.
			OrderService orderService = (OrderService) BeanFactory.getBean("orderService");
			Order order = orderService.findByOid(oid);
			
			order.setName(name);
			order.setAddress(address);
			order.setTelephone(telephone);
			
			orderService.update(order);
			
			// 付款:跳转到网银的界面:
			// 准备参数:
			String p0_Cmd = "Buy";
			String p1_MerId = "10001126856";
			String p2_Order = oid;
			String p3_Amt = "0.01";
			String p4_Cur = "CNY";
			String p5_Pid = "";
			String p6_Pcat = "";
			String p7_Pdesc = "";
			String p8_Url = "http://localhost:8080/store_v2.0/OrderServlet?method=callBack";
			String p9_SAF = "";
			String pa_MP = "";
			String pr_NeedResponse = "1";
			String keyValue = "69cl522AV6q613Ii4W6u8K6XuW8vM1N6bFgyv769220IuYe9u37N4y7rI4Pl";
			String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, keyValue);
			
			// 将所有参数 发送给 易宝指定URL
			req.setCharacterEncoding("utf-8");
			req.setAttribute("pd_FrpId", pd_FrpId);
			req.setAttribute("p0_Cmd", p0_Cmd);
			req.setAttribute("p1_MerId", p1_MerId);
			req.setAttribute("p2_Order", p2_Order);
			req.setAttribute("p3_Amt", p3_Amt);
			req.setAttribute("p4_Cur", p4_Cur);
			req.setAttribute("p5_Pid", p5_Pid);
			req.setAttribute("p6_Pcat", p6_Pcat);
			req.setAttribute("p7_Pdesc", p7_Pdesc);
			req.setAttribute("p8_Url", p8_Url);
			req.setAttribute("p9_SAF", p9_SAF);
			req.setAttribute("pa_MP", pa_MP);
			req.setAttribute("pr_NeedResponse", pr_NeedResponse);
			req.setAttribute("hmac", hmac);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/jsp/confirm.jsp";
	}
	
	/**
	 * 付款成功后执行的方法：callBack
	 * @param req
	 * @param resp
	 * @return
	 */
	public String callBack(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		try {
			//接收参数
			String oid = req.getParameter("r6_Order");
			String money = req.getParameter("r3_Amt");

			//修改订单参数
			OrderService orderService = (OrderService) BeanFactory.getBean("orderService");
			Order order = orderService.findByOid(oid);
			order.setState(2);
			orderService.update(order);
			
			req.setAttribute("msg", "您的订单"+oid+"付款成功，付款金额为："+money);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "/jsp/msg.jsp";
		
		
	}
}















