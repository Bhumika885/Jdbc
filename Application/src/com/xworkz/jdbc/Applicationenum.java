package com.xworkz.jdbc;

public enum Applicationenum {
	
	
	 URL("jdbc:mysql://localhost:3306/pg"),
	    USERNAME("root"),
	    PASSWORD("Xworkzodc@123");

	    private final String value;

	    Applicationenum(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}



