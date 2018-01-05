package com.home;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

import java.math.BigDecimal;
import java.util.List;

public class Staff {

	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;

 public void setName( String a ) {
   name = a ;
}
 public void setAge( int a ) {
   age = a ;
}
 public void setPosition( String a ) {
   position = a ;
}
 public void setSalary( BigDecimal a ) {
   salary = a ;
}
 public void setSkills( List<String> a ) {
   skills = a ;
}


	//getters and setters
}
