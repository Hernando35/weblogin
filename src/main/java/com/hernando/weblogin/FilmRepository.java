package com.hernando.weblogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
