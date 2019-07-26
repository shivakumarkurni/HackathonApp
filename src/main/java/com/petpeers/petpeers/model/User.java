package com.petpeers.petpeers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "pet_users")
public class User{
	
	
	//best stratedgy for generating id random unique id
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	@NotNull
	private String userName;
	@NotNull
	private String userPassword;
	public void setUserName(String userName2) {
			
		this.userName = userName2;
	}
	public void setUserPassword(String userPassword2) {
		// TODO Auto-generated method stub
		this.userPassword = userPassword2;
		
	}
}
