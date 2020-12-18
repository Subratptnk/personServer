package com.example.demo.model;

public class person {
	private long id;
    private String name;
    private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
    
	
    

}
