package model;

public class Room {
	private int room_id;
	private String name_of_student;
	private int capacity;
	private String room_status;
	public Room() {
		
	}
	 public Room(int room_id,  int capacity, String name_of_student, String room_status){
		 this.room_id=room_id;
		 this.capacity=capacity;
		 this.name_of_student=name_of_student;
		 this.room_status=room_status;
		// TODO Auto-generated constructor stub
	}

    public int getRoom_id() {
        return room_id;
    }

    /**
     * @param room_id the room_id to set
     */
    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    /**
     * @return String return the student_name
     */
    public String getname_of_student() {
        return name_of_student;
    }

    /**
     * @param student_name the student_name to set
     */
  

    /**
     * @return int return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return String return the room_status
     */
    public String getRoom_status() {
        return room_status;
    }

    /**
     * @param room_status the room_status to set
     */
    public void setRoom_status(String room_status) {
        this.room_status = room_status;
    }
	public void setName_of_student(String name_of_student) {
		// TODO Auto-generated method stub
		this.name_of_student=name_of_student;
	}

}


