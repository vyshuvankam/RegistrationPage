package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import com.tap.daoimpl.EmployeeDAOImpl;
import com.tap.model.Employee;
import com.tap.dao.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		String address = req.getParameter("address");
		int age = Integer.parseInt(req.getParameter("age"));
		
		Employee result = new Employee(name, email, contact, address, age);
		
		EmployeeDAO empl = new EmployeeDAOImpl();
		
		int re = empl.addEmployee(result);
		
		PrintWriter out = res.getWriter();
		
		if(re==1)
		{
			out.println("Hi "+name+". Your registration is successfull");
		}
		else
		{
			out.println("Hi "+name+". Sorry your registration is Unsuccessfull");
		}
	}

}
