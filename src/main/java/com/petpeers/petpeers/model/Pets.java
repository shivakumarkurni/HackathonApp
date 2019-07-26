package com.petpeers.petpeers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Pets{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int petId;
	@NotNull
	private String petName;
	@NotNull
	@Size(max=14)
	private int petAge;
	@NotNull
	private String petPlace;
	@NotNull
	private int petOwnerId;

}
