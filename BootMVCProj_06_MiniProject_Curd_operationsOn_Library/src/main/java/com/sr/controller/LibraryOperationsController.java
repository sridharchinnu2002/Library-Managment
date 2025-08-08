package com.sr.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sr.entity.LibraryManagment;
import com.sr.service.ILibraryService;

@Controller
public class LibraryOperationsController {
	@Autowired
	private ILibraryService service;
	@GetMapping("/")
	public String showHomePage()
	{
		return "welcome";
	}
	@GetMapping("/show_books")
	public String show_All_Books(Map<String,Object> map)
	{
		Iterable<LibraryManagment> list=service.showAllActors();
		System.out.println(list);
		map.put("list", list);
       return "show_books";
	}
	@GetMapping("addbookform")
	public String addBookform(@ModelAttribute("libmgmt") LibraryManagment lib)
	{
		System.out.println("LibraryOperationsController.addBook()");
		return "addbookform";
	}
	@PostMapping("addbookform")
	public String addbook(
			@ModelAttribute("libmgmt") LibraryManagment lib,Map<String,Object> map)
	{
		String msg=service.addNewBook(lib);
		map.put("msg", msg);
		return "redirect:show_books";
	}
}
