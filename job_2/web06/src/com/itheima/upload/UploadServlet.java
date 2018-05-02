package com.itheima.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.itheima.utils.UploadUtils;

/**
 * �ļ��ϴ���Servlet
 */
public class UploadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//�жϱ���enctype����
			boolean flag = ServletFileUpload.isMultipartContent(request);
			if(!flag) {
				//enctype���Բ���multipart/form-data
				request.setAttribute("msg", "���ĸ�ʽ����ȷ��");
				request.getRequestDispatcher("jsp/upload.jsp").forward(request, response);
				return;
			}
			//1.���������ļ����
			DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
			//1.1���û������Ĵ�С
			diskFileItemFactory.setSizeThreshold(3 * 1024 * 1024);//���û�������СΪ3M
			//1.2������ʱ�ļ���ŵ�·����
			//�����ʱ�ļ���ŵ�·��
			String tempPath = getServletContext().getRealPath("/temp");
			diskFileItemFactory.setRepository(new File(tempPath));
			//2.����һ�����ĵĽ�����
			ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
			//�����ļ��ϴ����ļ��Ĵ�С
//			fileUpload.setFileSizeMax(5 * 1024 * 1024);
			//3.���ú��������Request���������õ�������֡�����һ��List���ϡ�LIst����װ����ÿ�����ֵ����ݣ�FileItem�ļ����
			List<FileItem> list = fileUpload.parseRequest(request);
			//4.����List���ϣ���õ�����ÿ�����ֵ��ļ���Ķ��󡣸����ļ����ж��Ƿ����ļ��ϴ���
			for (FileItem fileItem : list) {
				//�ж�����ļ����Ƿ�����ͨ��Ķ��󡣸����ļ����ж��Ƿ����ļ��ϴ��
				if(fileItem.isFormField()) {
					//��ͨ�
					//������ͨ���ֵ��(����ֵ������ʹ��request.getParameter())
					String name = fileItem.getFieldName();//�����ͨ�������
					//�����ͨ���ֵ
					String value = fileItem.getString("utf-8");
					System.out.println(name + "   " + value);
				}else {
					//�ļ��ϴ��
					//����ļ��ϴ�����ļ������ƣ�
					String filename = fileItem.getName();
//					System.out.println("�ļ�����"+filename);
					int idx = filename.lastIndexOf("\\");
					if(idx != -1) {
						//ʹ���ϰ汾�������
						filename = filename.substring(idx+1);
					}
					//�õ�Ψһ�ļ�����
					String uuidFilename = UploadUtils.getUuidFilename(filename);
					//����ļ��ϴ����ļ�������
					InputStream is = fileItem.getInputStream();
					//����ļ��ϴ���·�������̵ľ���·����
					String realPath = getServletContext().getRealPath("/updoad");
					//����Ŀ¼���룺
					String path = UploadUtils.getRealPath(uuidFilename);
					String newPath = realPath + path;
					File file = new File(newPath);
					if(!file.exists()) {
						file.mkdirs();
					}
					//����һ���������д�뵽���õ�·���С�
					OutputStream os = new FileOutputStream(realPath+"/"+filename);
					//����������
					int len = 0;
					byte[] b = new byte[1024];
					while((len = is.read(b))!=-1) {
						os.write(b, 0, len);
					}
					is.close();
					os.close();
				}
				//ɾ����ʱ�ļ�
				fileItem.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
