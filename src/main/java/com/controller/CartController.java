package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ShoppingCart;
import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class CartController
 */
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    	int productid = Integer.parseInt(req.getParameter("productId"));
    	
    	ProductDao productDao = new ProductDao();
    	ProductBean product = productDao.getProductById(productid);
    	
    	if(productid!=0) {
    		productDao.insertCart(product);
    	}
    	
    	ArrayList<Integer> pids = (ArrayList<Integer>) productDao.getCart();
    	
    	ArrayList<ProductBean> productInCart = new ArrayList<ProductBean>();
    	for(Integer i:pids) {
    		productInCart.add(productDao.getProductById(i));
    	}
    	
    	req.setAttribute("Products", productInCart);
    	req.getRequestDispatcher("cart.jsp").forward(req, resp);
    	
      
    	
    	
    	

    	
    	
    	
   	
    	
    	
    	
    	  


      
   	}
}
