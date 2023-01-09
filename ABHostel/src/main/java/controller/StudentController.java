package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.Student;

import java.io.IOException;
import java.sql.*;
import java.util.List;

import dao.StudentDAO;
import database.DBConnection;


public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection db;
       
   
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String student_id = request.getParameter("student_id");
		String student_name = request.getParameter("student_name");
		
		boolean isLogin = login(student_id,student_name);
		HttpSession session = request.getSession();
		
		if(isLogin) {		
			session.setAttribute("student_name",student_name);
			List<Student> lstStudent = getAllStudent();
			
			if(lstStudent.size()>0) {
				request.setAttribute("lstStudent", lstStudent);
			}else {
				request.setAttribute("lstStudent", null);
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("/view/viewtable.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("status", "failed");
			// Call the same page and display error message
			RequestDispatcher rd = request.getRequestDispatcher("/view/studenttable.jsp");
			rd.forward(request, response);
		}
	}
	
	private List<Student> getAllStudent(){
		StudentDAO studentdao = new StudentDAO();
		List<Student> lstStudent = studentdao.getAllstudent();
		return lstStudent;	
	}

//	private List<Student> getAllStudent() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	private boolean login(String student_id,String student_name)   {
		boolean flag = false;
		db= new DBConnection();
		String query = "select * from student where student_id=? and student_name=?;";
		try {
			PreparedStatement st = db.con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
			st.setString(1,student_id);
			st.setString(2,student_name);
			
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