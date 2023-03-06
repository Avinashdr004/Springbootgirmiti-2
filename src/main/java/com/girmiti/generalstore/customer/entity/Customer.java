package com.girmiti.generalstore.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int cid;
	
	 @Column(nullable=false)
	 private String cname;
	 
	 @Column(nullable=false)
	 private long cmob;

	public Customer(int cid, String cname, long cmob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCmob() {
		return cmob;
	}

	public void setCmob(long cmob) {
		this.cmob = cmob;
	}
	 
	 
}
