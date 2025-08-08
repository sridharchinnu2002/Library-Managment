package com.sr.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class LibraryVo {

    private Integer id;
	
	@NonNull
	private String bname;
	
	@NonNull
	private String author;
	
	@NonNull
	private Integer qnty;
	
	@NonNull
	private String btype;
}
