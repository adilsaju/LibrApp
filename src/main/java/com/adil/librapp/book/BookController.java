package com.adil.librapp.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BookController {

  @Autowired
  BookRepo repo;
  // Book book1 = new Book(1,"adil","shakespeare");
  
  @GetMapping("/")
  public ModelAndView welcome(){
    ModelAndView mv=new ModelAndView();
    mv.addObject("title", "library");
    mv.setViewName("index");
    return mv;
  }
  
  @GetMapping("/addBookPage")
  public ModelAndView addBookPage() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("addBookPage");
    return mv;
  }
  
  @PostMapping("/addBook")
  @ResponseBody
  public String addBook(Book b){
    repo.save(b);
    // ModelAndView mv=new ModelAndView();
    // mv.setViewName("addSuccess");
    // mv.addObject("book", b);
    return b.toString();
  }

  @GetMapping("/getBookPage")
  public ModelAndView getBookPage() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("getBookPage");
    return mv;
  }

  @GetMapping("/getBooks")
  @ResponseBody
  public String getBooks(){
    // ModelAndView mv=new ModelAndView();
    // mv.setViewName("viewBooks");
    List<Book> books=repo.findAll();
    return books.toString();
  }

  @GetMapping("/getBook")
  @ResponseBody
  public String getBook(@RequestParam int bid){
    // ModelAndView mv=new ModelAndView();
    // mv.setViewName("viewBooks");
    Book book=repo.getOne(bid);
    return book.toString();
  }

  @GetMapping("/deleteBookPage")
  public ModelAndView deleteBookPage() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("deleteBookPage");
    return mv;
  }

  // @GetMapping("/deleteBook")
  // @ResponseBody
  // public String deleteBook(@RequestParam int bid){
  //   // ModelAndView mv=new ModelAndView();
  //   // mv.setViewName("viewBooks");
  //   String aww="aww";
  //   // char[] bookNamear=repo.getOne(bid).bname;
  //   String bookName=aww;

  //   repo.deleteById(bid);
  //   return String.format("%s deleted successfully", bookName);
  // }

  @GetMapping("/updateBookPage")
  public ModelAndView updateBookPage() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("updateBookPage");
    return mv;
  }

  @PostMapping("/updateBook")
  @ResponseBody
  public String updateBook(Book b){
    repo.save(b);
    // ModelAndView mv=new ModelAndView();
    // mv.setViewName("addSuccess");
    // mv.addObject("book", b);
    return b.toString();
  }

}