package com.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.entity.LibraryManagment;
import com.sr.repository.ILibraryRepo;
@Service
public class ILibraryServiceMGMT implements ILibraryService {

	@Autowired
	private ILibraryRepo libraryrepo;
	
	@Override
	public Iterable<LibraryManagment> showAllActors() {
		List<LibraryManagment> list=libraryrepo.findAll();
		return list;
	}
	
	@Override
	public String addNewBook(LibraryManagment lib) {
		LibraryManagment l=libraryrepo.save(lib);
		return "Book added to library with id :"+l.getBookid();
	}
	
}
