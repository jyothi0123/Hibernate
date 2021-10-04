package com.te.hibernatedemo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "student")
public class Student implements Serializable {
	@Id
	private int id;
	private String name;
	private long phoneno;
	private String standard;

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", standard=" + standard + "]";
	}

}
