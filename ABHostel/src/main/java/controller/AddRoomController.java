package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Room;
import model.Student;

import java.io.IOException;
import java.io.PrintWriter;


import dao.StudentDAO;

/**
 * Servlet implementation class RegisterController
 */
public class AddRoomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoomController() {
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
		int room_id= Integer.parseInt(request.getParameter("room_id"));
		int capacity= Integer.parseInt(request.getParameter("capacity"));
        String name_of_student= request.getParameter("name_of_student");
		String room_status= request.getParameter("room_status");


		
		

		
		Room room= new Room(room_id,capacity,name_of_student,room_status);
		try {
			int insert= studentdao.registerRoomPrepaedStatement(room);
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
