package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Room;
import model.Visitor;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDAO;

/**
 * Servlet implementation class AddVisitorController
 */
public class AddVisitorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private StudentDAO studentdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVisitorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		studentdao = new StudentDAO();
		PrintWriter out=response.getWriter();
		//int visitor_id= Integer.parseInt(request.getParameter("visitor_id"));
		int student_id= Integer.parseInt(request.getParameter("student_id"));
        String visitor_name= request.getParameter("visitor_name");
		String time_in= request.getParameter("time_in");
		String time_out= request.getParameter("time_out");
		String student_name= request.getParameter("student_name");
		String date_entring= request.getParameter("date_entring");
		
		

		
		Visitor visitor= new  Visitor(student_id,visitor_name,time_in,time_out,student_name,date_entring);
			
		try {
			int insert= studentdao.registervisitorPrepaedStatement(visitor);
			if(insert==1) {
				RequestDispatcher rd=request.getRequestDispatcher("/view/dashboard.jsp");
				rd.forward(request, response);
			}else {
				out.print("Error adding visitor");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	}

}
