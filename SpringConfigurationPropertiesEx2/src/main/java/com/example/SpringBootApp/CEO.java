package com.example.SpringBootApp;

public class CEO {
	
	private String name;
	
	private int age;
	
	private int experince;

	public CEO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	@Override
	public String toString() {
		return "CEO [name=" + name + ", age=" + age + ", experince=" + experince + "]";
	}
	
	
	
	

}
