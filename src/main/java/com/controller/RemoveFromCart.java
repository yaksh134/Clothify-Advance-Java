package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

/**
 * Servlet implementation class RemoveFromCart
 */
public class RemoveFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			int productId = Integer.parseInt(req.getParameter("productId"));
			ProductDao productDao = new ProductDao();
			productDao.deleteCart(productId);
			resp.sendRedirect("ProductController");
			
		}
    

}
