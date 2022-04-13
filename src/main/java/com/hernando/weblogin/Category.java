package com.hernando.weblogin;

public abstract class Category {
	protected abstract boolean isAvailableCategory(Film film);
	protected abstract boolean isSuscribedCategory(Film film);
}
