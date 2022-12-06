package com.wayne;

import com.wayne.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07TextApplicationTests {
	@Autowired
	private BookService bookService;
	@Test
	public void save() {
		bookService.save();
	}

}
