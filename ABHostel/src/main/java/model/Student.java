package model;

public class Student {
private int student_id;
 private String student_name ;
 private String	student_father_name;
 private String address;
 private String	cell_no ;
 private String	student_age;
 private String	student_DOB ;
 private String	room_id;
 public Student() {
	 
 }
 //public Student(String student_name,String	student_father_name, String address, String	cell_no , String	student_age, String	student_DOB , String room_id){
	 
// }
public Student(String student_name,String	student_father_name, String address, String	cell_no , String	student_age, String	student_DOB , String room_id){
	this.student_name=student_name; 
	this.student_father_name=student_father_name; 
	this.address=address; 
	this.cell_no=cell_no; 
	this.student_age=student_age; 
	this.student_DOB=student_DOB; 
	this.room_id=room_id;
	
 }

 /**
  * @return int return the student_id
  */
 public int getStudent_id() {
     return student_id;
 }

 /**
  * @param student_id the student_id to set
  */
 public void setStudent_id(int student_id) {
     this.student_id = student_id;
 }

 /**
  * @return String return the student_name
  */
 public String getStudent_name() {
     return student_name;
 }

 /**
  * @param student_name the student_name to set
  */
 public void setStudent_name(String student_name) {
     this.student_name = student_name;
 }

 /**
  * @return String return the student_father_name
  */
 public String getStudent_father_name() {
     return student_father_name;
 }

 /**
  * @param student_father_name the student_father_name to set
  */
 public void setStudent_father_name(String student_father_name) {
     this.student_father_name = student_father_name;
 }

 /**
  * @return String return the address
  */
 public String getAddress() {
     return address;
 }

 /**
  * @param address the address to set
  */
 public void setAddress(String address) {
     this.address = address;
 }

 /**
  * @return String return the cell_no
  */
 public String getCell_no() {
     return cell_no;
 }

 /**
  * @param cell_no the cell_no to set
  */
 public void setCell_no(String cell_no) {
     this.cell_no = cell_no;
 }

 /**
  * @return int return the student_age
  */
 public String getStudent_age() {
     return student_age;
 }

 /**
  * @param student_age the student_age to set
  */
 public void setStudent_age(String student_age) {
     this.student_age = student_age;
 }

 /**
  * @return String return the student_DOB
  */
 public String getStudent_DOB() {
     return student_DOB;
 }

 /**
  * @param student_DOB the student_DOB to set
  */
 public void setStudent_DOB(String student_DOB) {
     this.student_DOB = student_DOB;
 }
 public String getRoom_id() {
     return room_id;
 }

 /**
  * @param student_DOB the student_DOB to set
  */
 public void setRoom_id(String room_id) {
     this.room_id = room_id;
 }

}