package com.javalab.collection.pkg11;

public class Board {
	
	private int id;
	private String title;
	private String writer;
	private String date;
	private int hitCount;
	
	public Board() {
		super();
	}

	public Board(int id, String title, String writer, String date, int hitCount) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.hitCount = hitCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", date=" + date + ", hitCount="
				+ hitCount + "]";
	}

}

