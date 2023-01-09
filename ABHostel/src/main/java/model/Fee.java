package model;

public class Fee {

	    private String fee_status;
	    private int student_id;
	    private String student_name;
	    public Fee() {
			
		}
	    public Fee(String fee_status,  int student_id, String student_name){
			 this.fee_status=fee_status;
			 this.student_id=student_id;
			 this.student_name=student_name;
			// TODO Auto-generated constructor stub
		}

	    /**
	     * @return String return the fee_status
	     */ 
	    public String getFee_status() {
	        return fee_status;
	    }

	    /**
	     * @param fee_status the fee_status to set
	     */
	    public void setFee_status(String fee_status) {
	        this.fee_status = fee_status;
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

	}
