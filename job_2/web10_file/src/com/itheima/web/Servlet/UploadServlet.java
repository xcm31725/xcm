package com.itheima.web.Servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.itheima.utils.UUIDUtils;
import com.itheima.utils.UploadUtils;

/**
 * 文件上传的Servlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收普通数据
		request.setCharacterEncoding("utf-8");
		String filedesc = request.getParameter("filedesc");
		System.out.println("文件描述: "+filedesc);
		
		//接收文件
		Part part = request.getPart("upload");
		
		long size = part.getSize();//获得文件大小
		System.out.println("文件大小："+size);
		String name = part.getName();
		System.out.println("文件表单中的name属性的名称："+name);
		//获得文件名
		String header = part.getHeader("Content-Disposition");
		int idx = header.lastIndexOf("filename=\"");
		String fileName = header.substring(idx+10, header.length()-1);
		System.out.println("文件名："+fileName);
		
		//获得文件的内容：
		InputStream is = part.getInputStream();
		//获得upload路径
		String path = this.getServletContext().getRealPath("/upload");
		//获得文件的唯一文件名
		String uuidFileName = UUIDUtils.getUUIDFileName(fileName);
		String realPath = path+UploadUtils.getPath(uuidFileName);
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		OutputStream os = new FileOutputStream(realPath+"/"+uuidFileName);
		byte[] b = new byte[1024];
		int len = 0;
		while((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		
		is.close();
		os.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
