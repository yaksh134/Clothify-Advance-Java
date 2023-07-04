package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/ProductController")
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	
		HttpServletResponse httpResp = (HttpServletResponse) resp;
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpSession hs = httpReq.getSession();
		String user = (String) hs.getAttribute("user");
		if(user!=null) {
			//System.out.println("user not null");
			chain.doFilter(req, resp);
		}else {
			//System.out.println("user null");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
