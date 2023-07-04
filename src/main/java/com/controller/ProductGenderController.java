package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class ProductGenderController
 */
public class ProductGenderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String gender = req.getParameter("gender");
		System.out.println(gender);
		ProductDao productDao = new ProductDao();
		
		
		ArrayList<ProductBean> products = (ArrayList<ProductBean>) productDao.getProductByGender(gender);
		
		req.setAttribute("products", products);
		
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
	}

}
