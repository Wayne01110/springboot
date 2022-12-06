package com.wayne;

import com.wayne.dao.BookDao;
import com.wayne.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybaitsApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

}
