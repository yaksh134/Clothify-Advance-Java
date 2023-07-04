package com.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		int price = 0;
    		int count = 0;
    		
    		HttpSession hs = req.getSession(false);
    		String phone = (String) hs.getAttribute("phone");
    		
//    		String url = "https://www.fast2sms.com/dev/bulk";
//    	    String apiKey = "sThGNWAJ7eXYbyQDgImz6k3Mt08Cu9warFvU21K4xBEZnOfqpPhDJ4ptv7oni5QjaV6ZEHKMPruzmXy9";
//    	    String senderId = "FSTSMS";
//    	    String messageEncoded = URLEncoder.encode(message, "UTF-8");
//    	    String parameters = "authorization=" + apiKey + "&sender_id=" + senderId + "&message=" + messageEncoded + "&language=english&route=p&numbers=" + phone;
//    		
//    		
    		ProductDao productDao = new ProductDao();
    		
    		ArrayList<Integer> pids = (ArrayList<Integer>) productDao.getCart();
        	
        	ArrayList<ProductBean> productInCart = new ArrayList<ProductBean>();
        	for(Integer i:pids) {
        		productInCart.add(productDao.getProductById(i));
        		price += productDao.getProductById(i).getPrice();
        		count++;
        	}
        	
        	req.setAttribute("price", price);
        	req.setAttribute("count", count);
        	req.setAttribute("Products", productInCart);
        	productDao.clearCart();
        	req.getRequestDispatcher("order.jsp").forward(req, resp);
        	
        	
        	
        	
    	}
}
