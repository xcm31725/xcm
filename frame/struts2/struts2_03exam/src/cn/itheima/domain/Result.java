package cn.itheima.domain;

import java.util.List;

public class Result<T> {

	private int type; // 信息状态 0错误 1正常
	private List<T> content; // 内容
	private String message; // 错误信息

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
