package com.study.listener;

import java.util.HashMap;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.study.vo.Book;

public class SessionListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		
		HashMap<String, Book> books = new HashMap<>();
		session.setAttribute("books",books);
		
		session.setAttribute("money",0F);
	}
	public void sessionDestroyed(HttpSessionEvent arg0) {}	
}
