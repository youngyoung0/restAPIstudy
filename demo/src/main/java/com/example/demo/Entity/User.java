package com.example.demo.Entity;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class User {

	private Integer user_id;
	private String name;
	private Date joinDate;
}