package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tap.dao.EmployeeDAO;
import com.tap.model.Employee;


//to implement interface we need to create child class to gave body for abstract methods
public class EmployeeDAOImpl implements EmployeeDAO
{
	
		private static final String URL="jdbc:mysql://localhost:3306/register";
		private static final String USERNAME="root";
		private static final String PASSWORD ="Vyshu@5143";
		private static final String INSERT_EMPLOYEE="Insert into employee(name,email,contact,address,age) values(?,?,?,?,?)";
		
		@Override
		public int addEmployee(Employee employee) 
		{
			int res=0;
			
			try
			{
				// Load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the conection
				
				Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				
				// Create a sql statement
				
				PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE);
				
				statement.setString(1, employee.getName());
				statement.setString(2, employee.getEmail());
				statement.setString(3, employee.getContact());
				statement.setString(4, employee.getAddress());
				statement.setInt(5, employee.getAge());
				
				
				res = statement.executeUpdate();
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			return res;
			
			
		}
}
