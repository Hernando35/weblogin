package com.hernando.weblogin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(name = "films")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int filmsInStock;
	private double price;
	private Date startDate;

	public Film() {
	}

	public Film(String name, int filmsInStock, double price, Date startDate) {
		this.name = name;
		this.filmsInStock = filmsInStock;
		this.price = price;
		this.startDate = startDate;
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
		if (StringUtils.isEmpty(name)) {
			return "Not category found";
		}
		return this.name;
	}

	public void setCategoryName(String name) {
		this.name = name;
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
		return "Film [ name= " + name + ", filmsInStock=" + filmsInStock + ", price=" + price
				+ ", startDate=" + startDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
