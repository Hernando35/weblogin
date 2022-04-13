package com.hernando.weblogin;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class CategoryUtility extends Category {
	private static final Logger logger = Logger.getLogger(CategoryUtility.class);
	private List<Film> films;

	public CategoryUtility() {
		this.films = new ArrayList<Film>();
	}

	protected boolean addFilm(Film film) {
		if (film != null && isAvailableCategory(film)) {
			films.add(film);
			logger.info("film : " + film + "found");
			return true;
		}
		logger.info("film : " + film + "not found");
		return false;
	}

	protected boolean isAvailableCategory(Film film) {
		if (film != null) {
			return true;
		}
		return false;
	}

	protected boolean isSuscribedCategory(Film film) {
		if (film != null) {
			return true;
		}
		return false;
	}
}
