package com.hernando.weblogin;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class Film {

	private String categoryName;
	private int filmsInStock;
	private double price;
	private Date startDate;

	public Film() {
	}

	public Film(String categoryName, int filmsInStock, double price, Date startDate) {
		this.price = price;
		this.startDate = startDate;
		this.categoryName = categoryName;
		this.filmsInStock = filmsInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getCategoryName() {
		if (StringUtils.isEmpty(categoryName)) {
			return "Not category found";
		}
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getFilmsInStock() {
		if (this.filmsInStock <= 0) {
			return 0;
		} else {
			return this.filmsInStock;
		}
	}

	public void setFilmsInStock(int filmsInStock) {
		this.filmsInStock = filmsInStock;
	}

	@Override
	public String toString() {
		return "Film [ categoryName= " + categoryName + ", filmsInStock=" + filmsInStock + ", price=" + price
				+ ", startDate=" + startDate + "]";
	}

}
