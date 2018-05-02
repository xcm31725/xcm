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
 * �ļ��ϴ���Servlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ͨ����
		request.setCharacterEncoding("utf-8");
		String filedesc = request.getParameter("filedesc");
		System.out.println("�ļ�����: "+filedesc);
		
		//�����ļ�
		Part part = request.getPart("upload");
		
		long size = part.getSize();//����ļ���С
		System.out.println("�ļ���С��"+size);
		String name = part.getName();
		System.out.println("�ļ����е�name���Ե����ƣ�"+name);
		//����ļ���
		String header = part.getHeader("Content-Disposition");
		int idx = header.lastIndexOf("filename=\"");
		String fileName = header.substring(idx+10, header.length()-1);
		System.out.println("�ļ�����"+fileName);
		
		//����ļ������ݣ�
		InputStream is = part.getInputStream();
		//���upload·��
		String path = this.getServletContext().getRealPath("/upload");
		//����ļ���Ψһ�ļ���
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
