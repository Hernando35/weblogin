package com.hernando.weblogin;

public class CustomerUtility {
  
	protected boolean isAvailableCategory(MovieCategory movieCategory) {
		if (movieCategory != null) {
			return true;
		}
		return false;
	}
}
