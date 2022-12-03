package com.webla.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany(mappedBy = "projects")
	private Set<Programmer> programmer;

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

	public Set<Programmer> getProgrammer() {
		return programmer;
	}

	public void setProgrammer(Set<Programmer> programmer) {
		this.programmer = programmer;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", programmer=" + programmer + "]";
	}

	
	
	
}
