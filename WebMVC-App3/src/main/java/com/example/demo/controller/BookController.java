package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {

		// setting data to binding object
		Book book1 = new Book(101, "Spring", 9.99);
		Book book2 = new Book(102, "Hibernate", 7.99);
		Book book3 = new Book(103, "Devops", 5.66);
		List<Book> booksList = new ArrayList<>();
		booksList.add(book1);
		booksList.add(book2);
		booksList.add(book3);

		// adding data to model object to send to UI
		model.addAttribute("book", booksList);

		// return view name
		return "book";
	}

}
