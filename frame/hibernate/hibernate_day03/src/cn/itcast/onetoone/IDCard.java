package cn.itcast.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_idcard")
public class IDCard {
	@Id
	@GenericGenerator(strategy="uuid", name="myuuid")
	@GeneratedValue(generator="myuuid")
	private String id;
	private String cardNum;
	
	@OneToOne(targetEntity=Emp.class)
	@JoinColumn(name="eid")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Emp emp;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
}
