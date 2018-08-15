//package com.web.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class RightFilter implements Filter {
//
//	
//	public void destroy() {
//		
//	}
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletRequest req=(HttpServletRequest) request;
//		HttpSession session=req.getSession();
//		HttpServletResponse resp=(HttpServletResponse) response;
//		if(session.getAttribute("user")==null){
//			resp.sendRedirect("index.action");
//		}else{
//			chain.doFilter(request, response);
//		}
//	}
//
//	
//	public void init(FilterConfig fConfig) throws ServletException {
//	}
//
//}
