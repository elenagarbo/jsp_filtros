package com.filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//en carpeta
//url paterns que zona voy a poner rpivada, lo suyo es hacer carpeta secure y poner: /secure/*
@WebFilter(filterName="/FiltroLogin",urlPatterns= {"/loginExito.jsp"} )
public class FiltroLogin implements Filter {

	private ServletContext context;
    public FiltroLogin() {
    }


	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("entra en el filtro");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		if(session.getAttribute("usuario") == null){
			res.sendRedirect("login.jsp");
		}else{
			chain.doFilter(request, response);
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
	}

}
