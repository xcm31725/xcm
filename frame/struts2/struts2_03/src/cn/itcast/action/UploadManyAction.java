package cn.itcast.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UploadManyAction extends ActionSupport{
	private File[] file; // 上传的文件
	private String[] fileContentType; //上传文件的Type类型
	private String[] fileFileName; // 上传文件的名称

	public File[] getFile() {
		return file;
	}

	public void setFile(File[] file) {
		this.file = file;
	}

	public String[] getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String[] fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String[] getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String[] fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void uploadFile() {
		// 获得file目录在Tomcat的绝对路径
		String path = ServletActionContext.getServletContext().getRealPath("/file");
		try {
			for(int i=0; i<file.length; i++){
				// 创建一个服务器端文件
				File dest = new File(path,fileFileName[i]);
				FileUtils.copyFile(file[i], dest);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	
}
