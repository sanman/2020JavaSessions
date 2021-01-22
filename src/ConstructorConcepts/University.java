// Design a University class template with the following features: 
// variables: name, country, stablishedDate ,List of course provided in Array List<String>
// Design the constructor of this class with different parameters and all parameters.
// Write the get method of each variable with return keyword. 

package ConstructorConcepts;

import java.util.ArrayList;

public class University {

	String name;
	String country;
	String establishDate;
	ArrayList<String> courseList;
	
		
	public University(String name) {
		this.name = name;
	}	
	
	public University(ArrayList<String> courseList) {
		this.courseList = courseList;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, String country, String establishDate) {
		this.name = name;
		this.country = country;
		this.establishDate = establishDate;
	}
	
	public University(String name, ArrayList<String> courseList) {
		this.name = name;
		this.courseList = courseList;
	}
	

	public University(String name, String country, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.courseList = courseList;
	}

	public University(String name, String country, String establishDate, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.establishDate = establishDate;
		this.courseList = courseList;
	}
	
	
	
}
