package com.deep.filim.model;

public class TheatreWrapper {

	private Long id;
	private String name;
	private String email;
	private String mobile;
	
	
	private TheatreAddressWrapper theatreAddressWrapper;


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getMobile() {
		return mobile;
	}


	public TheatreAddressWrapper getTheatreAddressWrapper() {
		return theatreAddressWrapper;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public void setTheatreAddressWrapper(TheatreAddressWrapper theatreAddressWrapper) {
		this.theatreAddressWrapper = theatreAddressWrapper;
	}
	
	
}
