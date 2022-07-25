package com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name="userTable")
public class UserEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;

	String name;

	String mobNumber;

	String emailId;

	String address;

	String password;


}
