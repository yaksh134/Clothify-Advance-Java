package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.ProductBean;

/**
 * Servlet implementation class ProfileController
 */
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		
//    		HttpSession session = req.getSession();
//    		String user = (String) session.getAttribute("user");
//    		if(user!=null) {
//    			resp.sendRedirect("ProductController");
//    		}
//    		String username = req.getParameter("uname");
//    		if(username==null && user==null) {
//    			resp.sendRedirect("login.jsp");
//    		}else {
//    			//String username = req.getParameter("uname");
//    			session.setAttribute("user", username);
//    			//resp.sendRedirect("Home.jsp");
//    		}
    	
    	String user = req.getParameter("uname");
    	String phone = req.getParameter("phone");
    	HttpSession hs = req.getSession();
    	hs.setAttribute("user", user);
    	hs.setAttribute("phone", phone);    
    	ArrayList<ProductBean> cart = new ArrayList<ProductBean>();
    	hs.setAttribute("cart", cart);
    	String[] data = {};
    	Cookie cookie = new Cookie("data", Arrays.toString(data));
    	resp.addCookie(cookie); 
    	resp.sendRedirect("ProductController");
    	System.out.println("user : "+user);
    	
    
    }

}
