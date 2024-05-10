package com.example.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
	@Autowired
	BookRespo repo;
	
	@RequestMapping("/bookapp")
	
	public String show() {
		return"BookApp";
	}
	
	@RequestMapping("/insert")
	
	public String show(Book book)
	{
		boolean r=repo.insertBook(book);
			if (r)	{
				return "Success";
			
				}
			else
				return "Fail";
	}
	
	@RequestMapping("/update")
	
	public String show1()
	{
		return "upadateBook";
	}
	
	@RequestMapping("/updbook")
	public String show1(Book b)
	{
		boolean r=repo.updateBook(b);
			if (r)	{
				return "Success";
			
				}
			else
				return "Fail";
	}
	
@RequestMapping("/delete")
	
	public String show4()
	{
		return "DeleteBook";
	}
	
	@RequestMapping("/delbook")
	public String show4(Book b)
	{
		boolean r=repo.deleteBook(b);
			if (r)	{
				return "Success";
			
				}
			else
				return "Fail";
	}
	
@RequestMapping("/select")
	
	public String show2()
	{
		return "selectBook";
	}
	
	@RequestMapping("/selbook")
	@ResponseBody
	public String show2(Book b)
	{
		Book b1=repo.selectBook(b);
		return b1.toString();
		
	}
	@RequestMapping("/showall")
	@ResponseBody
	public List<Book>show3(){
		return repo.showall();
	}
	
}
