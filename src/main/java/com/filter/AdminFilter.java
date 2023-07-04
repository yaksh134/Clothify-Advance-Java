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

@WebFilter("/AddProductController")
public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse httpResp = (HttpServletResponse) response;
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpSession hs = httpReq.getSession(false);
		String user = (String) hs.getAttribute("user");
		if(user.equalsIgnoreCase("yaksh")) {
			chain.doFilter(httpReq, httpResp);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
