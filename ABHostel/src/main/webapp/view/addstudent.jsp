<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Student</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="js/register.js"></script>
<script src="js/bootstrap.min.js"></script>

<style>
<%@
include file ="/css/addstudent.css"%>
</style>


</head>
<body>
	<div class="container">
		<center>
			<h1>Add Students Details</h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/AddStudentController"
					method="post">

					<div class="form-group row">
						<label for="student_name" class="col-sm-2 col-form-label">Student
							Name</label>
						<div class="col-sm-7">
							<input type="text" name="student_name" class="form-control"
								name="student_name" placeholder="Enter student name">
						</div>
					</div>

					<div class="form-group row">
						<label for="student_father_name" class="col-sm-2 col-form-label">Father
							Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="student_father_name" placeholder="Enter Father name">
						</div>
					</div>
					<div class="form-group row">
						<label for="address" class="col-sm-2 col-form-label">Address
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="address" placeholder="Enter address">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="cell_no" class="col-sm-2 col-form-label">Phone No</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="cell_no"
								placeholder="Enter Contact Number">
						</div>
						</div>
						
					<div class="form-group row">
						<label for="student_age" class="col-sm-2 col-form-label">Student_age</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="student_age"
								placeholder="Enter student age">
						</div>
						</div>
						
						<div class="form-group row">
						<label for="student_DOB" class="col-sm-2 col-form-label">Student_DOB</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="student_DOB"
								placeholder="Enter student DOB">
						</div>
						</div>
						
						<div class="form-group row">
						<label for="room_id" class="col-sm-2 col-form-label">Room_id</label>
						<div class="col-sm-7">
							<input type="number" class="form-control" name="room_id"
								placeholder="Enter room ID">
						</div>
						</div>
						
					</div>
				
					<button type="submit" id="addstudent"class="btn btn-primary">Add student</button>
					<script type="text/javascript">
				
				document.getElementById("addstudent").addEventListener("click", function() {
				  alert("Student Added");
				});
				</script>
				</form>
			</div>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>