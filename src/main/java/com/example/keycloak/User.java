package com.example.keycloak;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "keycloak_demo")
@Data
public class User {
	@Id
	private int id;
	private String name;
	private int ph;

}
