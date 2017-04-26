package com.xsnail.controller;

import com.xsnail.dto.ReaderResult;
import com.xsnail.entity.Book;
import com.xsnail.entity.BookShelf;
import com.xsnail.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2017/3/27.
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "/{userName}/download")
    public ReaderResult<BookShelf> findBookByUserId(@PathVariable("userName")String userName){
        List<Book> bookList = bookService.findBookByUserName(userName);
        List<String> bookIdList = new ArrayList<String>();
        if(bookList != null && bookList.size() > 0) {
            for (Book book : bookList) {
                bookIdList.add(book.getBookId());
            }
            BookShelf bookShelf = new BookShelf();
            bookShelf.setBookIdList(bookIdList);
            bookShelf.setUserName(userName);
            return new ReaderResult<BookShelf>(true,bookShelf,"同步成功");
        }else if(bookList != null && bookList.size() == 0){
            return new ReaderResult<BookShelf>(true,"云端无书籍");
        } else {
            return new ReaderResult<BookShelf>(false);
        }

    }


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public ReaderResult<BookShelf> uploadBookShelf(@RequestBody BookShelf bookShelf){
        Integer rowAll = bookService.deleteAllBook();
        int i = 0;
        Book book = new Book();
        book.setUserName(bookShelf.getUserName());
        for(String bookId : bookShelf.getBookIdList()) {
            book.setBookId(bookId);
            Integer row = bookService.uploadBookShelf(book);
            if(row == 1){
                i++;
            }
        }
        if(i > 0) {
            return new ReaderResult(true);
        }else {
            return new ReaderResult(false);
        }
    }
}
