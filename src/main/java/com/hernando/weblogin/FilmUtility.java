package com.hernando.weblogin;

public class FilmUtility {
  
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
