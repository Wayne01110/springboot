package com.wayne.dao;

import com.wayne.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
// TODO 添加@Mapper
@Mapper
public interface BookDao {

    @Insert("insert into tb1_book(type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tb1_book set type = #{type},name = #{name},description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from tb1_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tb1_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tb1_book")
    public List<Book> getAll();

}
