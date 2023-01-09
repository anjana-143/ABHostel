package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import model.Admin;
import model.Fee;
import model.Room;
import model.Student;
import model.Visitor;

public class StudentDAO {
 DBConnection db = new DBConnection();

 public int registerstudentPrepaedStatement(Student student) {
	 try {
		 String query="insert into student(student_name,student_father_name,address,cell_no,student_age,student_DOB,room_id) values (?,?,?,?,?,?,?)";
	     PreparedStatement st = db.con.prepareStatement(query);
	     
	     st.setString(1, student.getStudent_name());
	     st.setString(2, student.getStudent_father_name());
	     st.setString(3, student.getAddress());
	     st.setString(4,student.getCell_no());
	     st.setString(5, student.getStudent_age());
	     st.setString(6,student.getStudent_DOB());
	     st.setString(7,student.getRoom_id());

	     
	     return db.manipulate(st);
	     
	 }catch(SQLException e) {
		 e.printStackTrace();
		 return 0;
		 
	 }
 }
 public int registerRoomPrepaedStatement(Room room) {
	 try {
		 String query="insert into room( room_id,capacity,name_of_student,room_status) values (?,?,?,?)";
	     PreparedStatement st = db.con.prepareStatement(query);
	     st.setInt(1,room.getRoom_id());
	     st.setInt(2,room.getCapacity());
	     st.setString(3, room.getname_of_student());
	     st.setString(4, room.getRoom_status());
	   
	     
	     return db.manipulate(st);
	     
	 }catch(SQLException e) {
		 e.printStackTrace();
		 return 0;
		 
	 }
 }
 
 public int registervisitorPrepaedStatement(Visitor visitor) {
	 try {
		 String query="insert into visitor(student_id,visitor_name,time_in,time_out,student_name,date_entring) values (?,?,?,?,?,?)";
	     PreparedStatement st = db.con.prepareStatement(query);
	    // st.setInt(1,visitor.getVisitor_id());
	     st.setInt(1,visitor.getStudent_id());
	     st.setString(2,visitor.getVisitor_name());
	     st.setString(3,visitor.getTime_in());
	     st.setString(4,visitor.getTime_out());
	     st.setString(5,visitor.getStudent_name());
	     st.setString(6,visitor.getDate_entring());
	     
	   
	     
	     return db.manipulate(st);
	     
	 }catch(SQLException e) {
		 e.printStackTrace();
		 return 0;
		 
	 }
 }
 
 public int registerfeePrepaedStatement(Fee fee) {
	 try {
		 String query="insert into fee(fee_status,student_id,student_name) values (?,?,?)";
	     PreparedStatement st = db.con.prepareStatement(query);
	     
	     st.setString(1, fee.getFee_status());
	     st.setInt(2, fee.getStudent_id());
	     st.setString(3, fee.getStudent_name());

	     
	     return db.manipulate(st);
	     
	 }catch(SQLException e) {
		 e.printStackTrace();
		 return 0;
		 
	 }
 }
  public Admin loginAdmin(String username,String password) {
	  String query;
	   
	  query ="select* from admin where username='"+ username +"'and password='"+ password+"';";
	  ResultSet rs =db.retrieve(query);
	  Admin admin =null;
	  try {
		  while(rs.next()) {
			  admin  =new Admin();
			  admin.setUsername(rs.getString("username"));
			  admin.setPassword(rs.getString("password"));
			 
			
		  }
			

		 }catch(Exception ex) {
			System.out.println("Error"+ ex);
			 
  }
	return admin;
  }
  public List<Student> getAllstudent(){
	  String query;
	  query ="select * from student";
	  db= new DBConnection();
	  
	  ResultSet rs= db.retrieve(query);
	  List<Student>lststudent =new ArrayList<Student>();
	  
	  try {
		  while(rs.next()) {
			  Student student =new Student();
			  student.setStudent_id(rs.getInt("student_id"));
			  student.setStudent_name(rs.getString("student_name"));
			  student.setStudent_father_name(rs.getString("student_father_name"));
			  student.setAddress(rs.getString("address"));
			  student.setCell_no(rs.getString("cell_no"));
			  student.setStudent_age(rs.getString("student_age"));
			  student.setStudent_DOB(rs.getString("student_DOB"));
			  student.setRoom_id(rs.getString("room_id"));
			  
			  lststudent.add(student);
			  
	  }
	  }catch (Exception ex) {
		  System.out.println("Error"+ ex);
	  }
	  return lststudent;
	  
  }
 
  public List<Visitor> getAllvisitor(){
	  String query;
	  query ="select * from visitor";
	  db= new DBConnection();
	  
	  ResultSet rs= db.retrieve(query);
	  List<Visitor>lstvisitor =new ArrayList<Visitor>();
	  
	  try {
		  while(rs.next()) {
			  Visitor visitor =new Visitor();
			  visitor.setVisitor_name(rs.getString("visitor_name"));
			  visitor.setTime_in(rs.getString("time_in"));
			  visitor.setTime_out(rs.getString("time_out"));
			  visitor.setStudent_name(rs.getString("student_name"));
			  visitor.setDate_entring(rs.getString("date_entring"));
			 
			  
			  lstvisitor.add(visitor);
			  
	  }
	  }catch (Exception ex) {
		  System.out.println("Error"+ ex);
	  }
	  return lstvisitor;
	  
  }
  public List<Fee> getAllfee(){
	  String query;
	  query ="select * from fee";
	  db= new DBConnection();
	  
	  ResultSet rs= db.retrieve(query);
	  List<Fee>lstfee =new ArrayList<Fee>();
	  
	  try {
		  while(rs.next()) {
			  Fee fee =new Fee();
			  fee.setFee_status(rs.getString("fee_status"));
			  fee.setStudent_name(rs.getString("student_name"));
			 
			  
			  lstfee.add(fee);
			  
	  }
	  }catch (Exception ex) {
		  System.out.println("Error"+ ex);
	  }
	  return lstfee;
	  
  }
  public List<Room> getAllroom(){
	  String query;
	  query ="select * from room";
	  db= new DBConnection();
	  
	  ResultSet rs= db.retrieve(query);
	  List<Room>lstRoom =new ArrayList<Room>();
	  
	  try {
		  while(rs.next()) {
			  Room room =new Room();
			  room.setRoom_id(rs.getInt("room_id"));
			  room.setCapacity(rs.getInt("capacity"));
			  room.setName_of_student(rs.getString("name_of_student"));
			  room.setRoom_status(rs.getString("room_status"));
			 
			  
			  lstRoom.add(room);
			  
	  }
	  }catch (Exception ex) {
		  System.out.println("Error"+ ex);
	  }
	  return lstRoom;
	  
  }
//    
//  public List<Student> getAllstudent(){
//	  String query;
//	  query ="select * from student";
//	  db= new DBConnection();
//	  
//	  ResultSet rs= db.retrieve(query);
//	  List<Student>lststudent =new ArrayList<Student>();
//	  
//	  try {
//		  while(rs.next()) {
//			  Student student =new Student();
//			  student.setStudent(rs.getString(""));
//			  student.setCustLname(rs.getString("custLname"));
//			  student.setGender(rs.getString("gender").charAt(0));
//			  student.setAddress(rs.getString("address"));
//			  student.setUsername(rs.getString("username"));
//			  
//			  lststudent.add(student);
//			  
//	  }
//	  }catch (Exception ex) {
//		  System.out.println("Error"+ ex);
//	  }
//	  return lststudent;
//	  
//  }
 }