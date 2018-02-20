package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "acceso con sesiones", urlPatterns = { "/Login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Peticion get");
		//getpathinfo info de ruta de donde viene la sesion
		String action=(request.getPathInfo()!=null?request.getPathInfo():"/out");
        HttpSession sesion = request.getSession();
        if(action.equals("/out")){
            sesion.invalidate();
            response.sendRedirect("login.jsp");
//            System.out.println("borrar sesion");
        }else{
           
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//doGet(request, response);
					
		 HttpSession sesion = request.getSession();
	        String usu, pass;
	        usu = request.getParameter("user");
	        pass = request.getParameter("password");
	        //deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
	        
	        if(usu.equals("admin") && pass.equals("admin") && sesion.getAttribute("usuario") == null){
	            //si coincide usuario y password y además no hay sesión iniciada. Crea sesion con atributo usuario
	            sesion.setAttribute("usuario", usu);
	            //redirijo a página con información de login exitoso
	            response.sendRedirect("loginExito.jsp");
	        }else{
	        	response.sendRedirect("login.jsp");
	        	System.out.println("Error de login");
	            //lógica para login inválido
	        }
	}

}
