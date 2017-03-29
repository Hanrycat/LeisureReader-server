package com.xsnail.service.impl;

import com.xsnail.dao.BookDao;
import com.xsnail.entity.Book;
import com.xsnail.entity.BookShelf;
import com.xsnail.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Admin on 2017/3/27.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
   @Resource
   private BookDao bookDao;

    public List<Book> findBookByUserName(String userName) {
        return bookDao.findBookByUserName(userName);
    }

    public Integer uploadBookShelf(Book book) {
        return bookDao.uploadBookShelf(book);
    }

    public Integer deleteAllBook() {
        return bookDao.deleteAllBook();
    }

//    public int syncBookShelf(List<String> bookIdList) {
//        return bookDao.syncBookShelf(bookIdList);
//    }
}
