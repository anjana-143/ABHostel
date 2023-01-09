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
			<h1>Add visitor Details</h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/AddVisitorController"
					method="post">

		

					<div class="form-group row">
						<label for="studen_id" class="col-sm-2 col-form-label">student_id
					</label>
						<div class="col-sm-7">
							<input type="number" class="form-control"
								name="student_id" placeholder="Enter student_id">
						</div>
					</div>
					<div class="form-group row">
						<label for="visitor_name" class="col-sm-2 col-form-label">visitor_name
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="visitor_name" placeholder="Enter visitor Name">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="time_in" class="col-sm-2 col-form-label">time_out</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="time_in"
								placeholder="Enter time_in">
						</div>
						</div>
						
						<div class="form-group row">
						<label for="time_in" class="col-sm-2 col-form-label">time_in</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="time_out"
								placeholder="Enter time_out">
						</div>
						</div>
						
					
						
						<div class="form-group row">
						<label for="student_name" class="col-sm-2 col-form-label">Student_name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="student_name"
								placeholder="Enter student name">
						</div>
						</div>
						
						<div class="form-group row">
						<label for="data_entring" class="col-sm-2 col-form-label">data_entring</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="date_entring"
								placeholder="Enter data_entring">
						</div>
						</div>
						
					</div>
				
					<button type="submit"  id="addvit"class="btn btn-primary">Add Visitor</button>
					<script type="text/javascript">
				
				document.getElementById("addvit").addEventListener("click", function() {
				  alert("Visitor Detail Added");
				});
				</script>
				</form>
			</div>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>