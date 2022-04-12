package com.hernando.weblogin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
	public Film findByName(String name);
}
