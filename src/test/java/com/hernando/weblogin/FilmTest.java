package com.hernando.weblogin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmTest {

	@Test
	void test() {
		Film film = new Film("", 32, 56.0, null);
		Film film2 = new Film();
		film2.setCategoryName("Dutch film");
		film2.setFilmsInStock(4);
		film2.setPrice(89.0);
		film2.setStartDate(null);
		assertEquals("Film [ name= , filmsInStock=32, price=56.0, startDate=null]", film.toString());
	    assertEquals("Film [ name= Dutch film, filmsInStock=4, price=89.0, startDate=null]", film2.toString());
	}

}
