package com.qa.person;

import java.util.Objects;

public class Person {

	String name;
	String age;
	String jobTitle;

	public String getAge() {
		return age;
	}

	public void setDetails(String name, String age, String jobTitle) {
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, jobTitle, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(jobTitle, other.jobTitle)
				&& Objects.equals(name, other.name);
	}

}
