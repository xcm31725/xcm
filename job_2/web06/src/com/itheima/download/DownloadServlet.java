package com.itheima.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBindingFeature;

import com.itheima.utils.DownloadUtils;

/**
 * �ļ����ص�Servlet
 */
public class DownloadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.���ղ�����
		String filename = new String(request.getParameter("filename").getBytes("ISO-8859-1"),"UTF-8");
		//2.���أ���������ͷ��һ����
		//����Content-Type
		String type = getServletContext().getMimeType(filename);
		response.setContentType(type);
		//����һ��������ļ���·����
		String path = getServletContext().getRealPath("/download");
		File file = new File(path+"/"+filename);
		//�ж�����������ͣ�
		String agent = request.getHeader("User-Agent");
		if(agent.contains("Firefox")) {
			//ʹ�õ���Firefox
			filename = DownloadUtils.base64EncodeFileName(filename);
		}else{
			//IE�������������
			filename = URLEncoder.encode(filename, "UTF-8");
		}
		
		//����Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filaname="+filename);
		//����һ���������ļ���������
		InputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		//�������Խӣ�
		int len = 0;
		byte[] b = new byte[1024];
		while((len = is.read()) != -1) {
			os.write(b, 0, len);
		}
		is.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
