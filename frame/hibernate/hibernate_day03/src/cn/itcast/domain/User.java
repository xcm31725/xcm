package cn.itcast.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="t_user")
@NamedQuery(name="myHQL", query="from Order where user=:user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToMany(targetEntity=Order.class, mappedBy="user")
	@Cascade(CascadeType.ALL)
	private Set<Order> set = new HashSet<Order>();
	
	public User() {
	}
	
	
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getSet() {
		return set;
	}
	public void setSet(Set<Order> set) {
		this.set = set;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", set=" + set + "]";
	}
	
}	
