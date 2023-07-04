package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class AddProductController
 */
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		String name = req.getParameter("name");
    		String description = req.getParameter("description");
    		String type= req.getParameter("type");
    		String gender = req.getParameter("gender");
    		String image = req.getParameter("image");
    		int price = Integer.parseInt(req.getParameter("price"));
    		int quantity = Integer.parseInt(req.getParameter("quantity"));
    		
    		
    		ProductBean product = new ProductBean();
    		Random random = new Random();  
    		int pid = random.nextInt(1000);  
    		product.setProductId(pid);
    		product.setName(name);
			product.setDescription(description);
			product.setQty(quantity);
			product.setPrice(price);
			product.setType(type);
			product.setGender(gender);
			product.setImage(image);
			
			ProductDao productDao = new ProductDao();
			productDao.insertProduct(product);
			
			resp.sendRedirect("ProductController");
    		
    	}
   

}
