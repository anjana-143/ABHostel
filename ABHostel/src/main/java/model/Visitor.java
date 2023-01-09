package model;

public class Visitor {
	
	//private int visitor_id;
	private int student_id;
	private String visitor_name;
	private String time_in;
	private String time_out;
	private String student_name;
	private String date_entring;
	public Visitor() {
		
	}
	public Visitor(int student_id, String visitor_name,String time_in,String time_out,String student_name,String date_entring) {
		//this.visitor_id = visitor_id;
		this.student_id= student_id;
		this.visitor_name= visitor_name;
		this.time_in= time_in;
		this.time_out=time_out;
		this.student_name=student_name;
		this.date_entring= date_entring;
		
	}
	
	 /**
     * @return int return the visitor_id
     * 
     */
   // public int getVisitor_id() {
   //     return visitor_id;
//    }

    /**
     * @param visitor_id the visitor_id to set
     */
//    public void setVisitor_id(int visitor_id) {
//        this.visitor_id = visitor_id;
    //}

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
     * @return String return the visitor_name
     */
    public String getVisitor_name() {
        return visitor_name;
    }

    /**
     * @param visitor_name the visitor_name to set
     */
    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    /**
     * @return String return the time_in
     */
    public String getTime_in() {
        return time_in;
    }

    /**
     * @param time_in the time_in to set
     */
    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    /**
     * @return String return the time_out
     */
    public String getTime_out() {
        return time_out;
    }

    /**
     * @param time_out the time_out to set
     */
    public void setTime_out(String time_out) {
        this.time_out = time_out;
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
     * @return String return the date_entring
     */
    public String getDate_entring() {
        return date_entring;
    }

    /**
     * @param date_entring the date_entring to set
     */
    public void setDate_entring(String date_entring) {
        this.date_entring = date_entring;
    }
}
