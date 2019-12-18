package com.test;

public class Student {
	
	private String id;
	private String Name;
	public Student() {
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof Student))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getId().equals(((Student) obj).getId());
	}
	
	@Override
	public int hashCode() {
	    return Integer.parseInt(id);
	}

}
