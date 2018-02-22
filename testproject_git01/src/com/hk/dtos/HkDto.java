package com.hk.dtos;

import java.util.Date;

public class HkDto {

	private int seq;
	private String id;
	private String name;
	private String title;
	private String content;
	private Date regDate;
	public HkDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HkDto(int seq, String id, String name, String title, String content, Date regDate) {
		super();
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
	}
	
	
}
