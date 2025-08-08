package com.sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.entity.LibraryManagment;

public interface ILibraryRepo extends JpaRepository<LibraryManagment, Integer>{

}
