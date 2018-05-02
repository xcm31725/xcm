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

import com.itheima.utils.DownloadUtils;

/**
 * �����ļ����صĴ���ʵ��
 */
public class DownloadListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ղ���
		String path = request.getParameter("filename");
		if(path != null) {
			path = new String(path.getBytes("ISO-8859-1"),"UTF-8");
		}
		File file = new File(path);
		//ʵ���ļ����أ���������ͷ��һ������
		//����ļ���
		String filename = file.getName();
		response.setContentType(getServletContext().getMimeType(filename));
		//������һ��ͷ��
		String agent = request.getHeader("User-Agent");
		if(agent.contains("Firefox")) {
			filename = DownloadUtils.base64EncodeFileName(filename);
		}else {
			filename = URLEncoder.encode(filename, "UTF-8");
			filename = filename.replace("+", " ");
		}
		response.setHeader("Context-Disposition", "attachment;filaname+"+filename);
		//������������
		InputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
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
