package com.podio.app;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationField extends ApplicationFieldCreate {

	/**
	 * The id of the field
	 */
	private int id;

	@XmlElement(name = "field_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}