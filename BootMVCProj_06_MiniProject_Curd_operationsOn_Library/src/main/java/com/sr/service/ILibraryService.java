package com.sr.service;

import com.sr.entity.LibraryManagment;

public interface ILibraryService {

	public Iterable<LibraryManagment> showAllActors();
    public String addNewBook(LibraryManagment lib);
}
