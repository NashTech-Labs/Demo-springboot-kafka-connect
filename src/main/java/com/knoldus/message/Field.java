package com.knoldus.message;

public class Field {
	private String field;
	private String type;
	private boolean optional;

	public Field() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Field(String field, String type, boolean optional) {
		super();
		this.field = field;
		this.type = type;
		this.optional = optional;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

}
