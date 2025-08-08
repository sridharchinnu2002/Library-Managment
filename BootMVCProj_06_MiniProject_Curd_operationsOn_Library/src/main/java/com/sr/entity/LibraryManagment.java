package com.sr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="library")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class LibraryManagment {

	@Id
	@SequenceGenerator(name="seq1",sequenceName = "lib_id_seq",initialValue = 120,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	private Integer bookid;
	
	@NonNull
	@Column(length = 30,name = "bookname")
	private String bookName;
	
	@NonNull
	@Column(length = 30,name = "Author")
	private String author;
	
	@NonNull
	@Column(name = "Quantity")
	private Integer qnty;
	
	@NonNull
	@Column(length = 30,name = "booktype")
	private String bookType;
	
	
}
