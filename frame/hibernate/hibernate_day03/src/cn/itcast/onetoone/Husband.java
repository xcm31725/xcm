package cn.itcast.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="t_husband")
public class Husband {
	@Id
	@GenericGenerator(name="myWife", strategy="foreign", //使用hibernate的外键策略
			parameters = {@Parameter(name="property", value="w")})//指定成员属性中的w所在类的主键为本类的主键,这里的参数属性name必须为"property"
	@GeneratedValue(generator="myWife")
	private int id;
	private String name;
	
	@OneToOne
	@PrimaryKeyJoinColumn 	
	private Wife w;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wife getW() {
		return w;
	}

	public void setW(Wife w) {
		this.w = w;
	}
}	
