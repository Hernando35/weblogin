package com.hernando.weblogin;

import java.util.Date;

public class Film {
	private double price;
	private Date startDate;
	private String filmName;
	private int filmsInStock;

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

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getFilmsInStock() {
		return filmsInStock;
	}

	public void setFilmsInStock(int filmsInStock) {
		this.filmsInStock = filmsInStock;
	}

	@Override
	public String toString() {
		return "Film [price=" + price + ", startDate=" + startDate + ", filmName=" + filmName
				+ ", filmsInStock=" + filmsInStock + "]";
	}
    
	
}
