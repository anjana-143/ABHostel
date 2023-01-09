package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Fee;
import model.Room;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDAO;

/**
 * Servlet implementation class AddFeeController
 */
public class AddFeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		studentdao = new StudentDAO();
		PrintWriter out=response.getWriter();
		String fee_status= request.getParameter("fee_status");
		int student_id= Integer.parseInt(request.getParameter("student_id"));
        String student_name= request.getParameter("student_name");


		
		

		
		Fee fee= new Fee(fee_status,student_id,student_name);
		try {
			int insert= studentdao.registerfeePrepaedStatement(fee);
			if(insert==1) {
				RequestDispatcher rd=request.getRequestDispatcher("/view/dashboard.jsp");
				rd.forward(request, response);
			}else {
				out.print("Error added fee Detail");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		
	}

}
