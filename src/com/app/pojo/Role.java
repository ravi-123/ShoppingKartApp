package com.app.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Role implements Serializable {
	private static final long serialVersionUID = -5958526038829843574L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	@Column(nullable=false,unique=true)
	private String roleName;

}
