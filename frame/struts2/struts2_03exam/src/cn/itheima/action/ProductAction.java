package cn.itheima.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionSupport;

import cn.itheima.domain.Product;
import cn.itheima.service.IProductService;
import cn.itheima.service.ProductServiceImpl;

@Namespace("/")
@ParentPackage("base")
public class ProductAction extends ActionSupport {

	@Action(value = "showProduct", interceptorRefs = { @InterceptorRef("myStack") })
	public void showProduct() {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		// 调用service查询所有商品
		IProductService productService = new ProductServiceImpl();
		List<Product> ps = productService.findAll();

		// 将ps转换成json
		cn.itheima.domain.Result<Product> result = new cn.itheima.domain.Result<>();
		result.setContent(ps);
		result.setType(1);
		String json = JSONArray.toJSONString(result);
		// 通过response将json写回到浏览器
		try {
			ServletActionContext.getResponse().getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
