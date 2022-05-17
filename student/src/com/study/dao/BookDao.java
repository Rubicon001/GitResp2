package com.study.dao;

import com.study.vo.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class BookDao {
	private Connection conn = null;

	public void update(Integer bookno, String bookName, float bookPrice) throws Exception {
		this.initConnection();
		Statement  statement = conn.createStatement();
		String sql = "UPDATE t_book SET bookname='" + bookName + "', bookprice = " + bookPrice + " WHERE bookno = " + bookno;
		statement.executeUpdate(sql);
	}

	public void insert(String bookName, float bookPrice) throws Exception {
		this.initConnection();
		Statement  statement = conn.createStatement();
		String sql = "INSERT INTO t_book(bookname, bookprice) VALUES('" + bookName + "'," + bookPrice + ")";
		statement.executeUpdate(sql);
	}

	public void remove(Integer id) throws Exception {
		this.initConnection();
		Statement stat = conn.createStatement();
		String sql = "DELETE FROM t_book WHERE BOOKNO = " + id;
		stat.executeUpdate(sql);
		this.closeConnection();

	}
	public HashMap<String, Book> getAllBook() throws Exception{
		HashMap<String, Book> hm = new HashMap<>();
		this.initConnection();
		Statement stat = conn.createStatement();
		String sql = "SELECT BOOKNO,BOOKNAME,BOOKPRICE FROM t_book";
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			Book book = new Book();
			book = new Book();
			book.setBookno(rs.getString("bookno"));
			book.setBookname(rs.getString("bookname"));
			book.setBookprice(rs.getFloat("bookprice"));
			hm.put(book.getBookno(),book);
		}
		this.closeConnection();
		return hm;		
	}
	public void initConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books?characterEncoding=utf-8", "root", "root");
	}
	public void closeConnection() throws Exception{
		conn.close();
	}
	
}
