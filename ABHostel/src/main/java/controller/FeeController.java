package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Fee;
import model.Student;

import java.io.IOException;
import java.sql.*;
import java.util.List;

import dao.StudentDAO;
import database.DBConnection;


public class FeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection db;
       
   
    public FeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isLogin = login(username,password);
		HttpSession session = request.getSession();
		
		if(isLogin) {		
			session.setAttribute("username",username);
			session.setAttribute("password",password);
			List<Fee> lstFee = getAllfee();
			
			if(lstFee.size()>0) {
				request.setAttribute("lstFee", lstFee);
			}else {
				request.setAttribute("lstFee", null);
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("/view/viewfee.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("status", "failed");
			// Call the same page and display error message
			RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
			rd.forward(request, response);
		}
	}
	private List<Fee> getAllfee(){
		StudentDAO studentdao = new StudentDAO();
		List<Fee> lstFee= studentdao.getAllfee();
		return lstFee;	
	}
	
//	private List<Customer> getAllCustomer(){
//		Customerdao customerdao = new Customerdao();
//		List<Customer> lstCustomer = customerdao.getAllCustomers();
//		return lstCustomer;	
//	}

	private boolean login(String username,String password)   {
		boolean flag = false;
		db= new DBConnection();
		String query = "select * from admin where username=? and password=?;";
		try {
			PreparedStatement st = db.con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
			st.setString(1,username);
			st.setString(2,password);
			
			ResultSet rows = db.retrieve(st);
			rows.last();
			int rs = rows.getRow();
			if(rs>0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
	
}