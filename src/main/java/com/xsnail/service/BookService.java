package com.xsnail.service;

import com.xsnail.entity.Book;
import com.xsnail.entity.BookShelf;

import java.util.List;

/**
 * Created by Admin on 2017/3/27.
 */
public interface BookService {
    List<Book> findBookByUserName(String userName);

    Integer uploadBookShelf(Book book);

    Integer deleteAllBook();
//    int syncBookShelf(List<String> bookIdList);
}
