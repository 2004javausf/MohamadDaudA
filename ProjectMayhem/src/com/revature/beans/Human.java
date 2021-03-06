package com.revature.beans;
 // Packages are just very fancy folders. Namespace (Tue, 4/14/20)

/*
 * Naming Convention
 * Classes & Projects: Pascal casing, capitalize the 1st letter
 * of each word. Ex: ProjectMayhem
 * 
 * Method and variables: Camel casing, start with lower-case
 * Ex: firstSecondThird  
 * 
 * Packages: lowercase & delimited by periods
 * 
 * Constants: ALL_CAPS, typically delimited by underscores
 */

public class Human {
	/*
	 * Members of a class - couple of forms
	 * Instance variables - property of a specific object (humans name)
	 * Static variable - property of the class shared by all of its instances
	 * Instance methods - behavior relative to a specific object
	 * Static methods - behavior relative to entire class
	 * Constructor - instantiates the class using the keyword "new"
	 */
	
		private String name;
		private int age;
		private int weight;
	
	// Getter method for name	
	public String getName() {
		return name;
	}
	
	// Setter method for name
	public void setName (String name) {
		this.name = name;
	}

	// Getter method for age
	public int getAge() {
		return age;
	}
	
	// Setter method for age
	public void setAge(int age) {
		this.age = age;
	}
	
	// Getter method for weight
	public int getWeight() {
		return weight;
	}

	// Setter method for weight
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
