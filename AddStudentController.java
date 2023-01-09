package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDAO;

/**
 * Servlet implementation class RegisterController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		studentdao = new StudentDAO();
		PrintWriter out=response.getWriter();
		String student_name= request.getParameter("student_name");
		String student_father_name= request.getParameter("student_father_name");
		String address= request.getParameter("address");
		String cell_no= request.getParameter("cell_no");
		String student_age= request.getParameter("student_age");
		String student_DOB= request.getParameter("student_DOB");
		String room_id= request.getParameter("room_id");
		
		

		
		Student student= new Student(student_name,student_father_name,address,cell_no,student_age,student_DOB,room_id);
		try {
			int insert= studentdao.registerstudentPrepaedStatement(student);
			if(insert==1) {
				RequestDispatcher rd=request.getRequestDispatcher("/view/dashboard.jsp");
				rd.forward(request, response);
			}else {
				out.print("Error registring customer");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		

	}

}
