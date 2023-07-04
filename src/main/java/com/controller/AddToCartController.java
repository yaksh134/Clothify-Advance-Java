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
 * Servlet implementation class AddToCartController
 */
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		int productId = Integer.parseInt(req.getParameter("productId"));
    		ArrayList<ProductBean> cart = new ArrayList<ProductBean>();
    		ProductDao productDao = new ProductDao();
    		cart.add(productDao.getProductById(productId));
    		System.out.println("Product added");
    		req.setAttribute("cart", cart);
	    	req.getRequestDispatcher("cart.jsp").forward(req, resp);
    		
    	}
}
