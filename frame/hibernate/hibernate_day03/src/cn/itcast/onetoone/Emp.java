package cn.itcast.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_emp")
public class Emp {
	@Id
	@GenericGenerator(strategy="uuid", name="myuuid")
	@GeneratedValue(generator="myuuid")
	private String id;
	private String name;
	
	@OneToOne(targetEntity=IDCard.class, mappedBy="emp")
	private IDCard idCard;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IDCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IDCard idCard) {
		this.idCard = idCard;
	}
}
