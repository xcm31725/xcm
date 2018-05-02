package cn.itcast.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="t_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@ManyToMany(targetEntity=Teacher.class)
	@JoinTable(name="s_t",
		joinColumns = {@JoinColumn(name="sid")},
		inverseJoinColumns = {@JoinColumn(name="tid")})
	@Cascade(CascadeType.ALL)
	private Set<Teacher> t = new HashSet<Teacher>();
	
	
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
	public Set<Teacher> getT() {
		return t;
	}
	public void setT(Set<Teacher> t) {
		this.t = t;
	}
	
	
}
