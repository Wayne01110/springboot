package com.wayne.dao;

import com.wayne.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface BookDao {
    @Select("select * from tb1_book where id = #{id}")
    public Book getById(Integer id);
}
