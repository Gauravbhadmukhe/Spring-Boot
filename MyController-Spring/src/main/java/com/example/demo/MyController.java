package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	
  @RequestMapping("/citylist")
	
	public List<String> show()
{
	List<String>list=new ArrayList<String>();

	list.add("Pune");
	list.add("Mumbai");
	list.add("Nashik");
	list.add("Nagpur");
	return list;
  }

}
