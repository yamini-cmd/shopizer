package com.salesmanager.shop.model.catalog.catalog;

import com.salesmanager.shop.model.catalog.NamedEntity;

public class ReadableCatalog extends NamedEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String creationDate;
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

}
