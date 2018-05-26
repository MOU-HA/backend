package com.youtube.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)

public class User extends ParentEntity {

	private static final long serialVersionUID = 8435405591663518471L;
	
	 @Column(name = "first_name", nullable = false, length = 250)
	 private String firstName;	 
	 @Column(name = "second_name", nullable = false, length = 250)
	 private String secondName;	 
	 @Column(name = "first_surname", nullable = false, length = 250)
	 private String firstSurname;	 
	 @Column(name = "second_surname", nullable = false, length = 250)
	 private String secondSurname;	 
	 @Column(name = "phone", nullable = true, length = 30)
	 private String phone;	 
	 @Column(name = "address", nullable = true, length = 150)
	 private String address;
}
