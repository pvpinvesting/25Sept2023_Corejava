package com.grats.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(":AdditionServletaasdfasdf:=======================>:Start");
		String number1=request.getParameter("num1");
		System.out.println(":number1:"+number1);
		String number2=request.getParameter("num2");
		System.out.println(":number2:"+number2);
		int n1=Integer.parseInt(number1);
		int n2=Integer.parseInt(number2);
		System.out.println(":n1:"+n1);
		System.out.println(":n2:"+n2);
		int sum=n1+n2;
		System.out.println(":sum:"+sum);	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='blue'>");
		out.println("<h1>Sum of two numbers is: "+sum+"</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		System.out.println(":AdditionServlet:=======================>:End");
	}

}
