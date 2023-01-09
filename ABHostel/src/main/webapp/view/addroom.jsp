<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD Room</title>
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
			<h1>Add Room Details</h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/AddRoomController"
					method="post">

					<div class="form-group row">
						<label for="room_id" class="col-sm-2 col-form-label">Room
							id</label>
						<div class="col-sm-7">
							<input type="text" name="room_id" class="form-control"
								name="room_id" placeholder="Enter room id">
						</div>
					</div>

					<div class="form-group row">
						<label for="capacity" class="col-sm-2 col-form-label">capacity
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="capacity" placeholder="Enter capacity">
						</div>
					</div>
					<div class="form-group row">
						<label for="address" class="col-sm-2 col-form-label">student name
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="name_of_student" placeholder="Enter name">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="cell_no" class="col-sm-2 col-form-label">Room Status</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="room_status"
								placeholder="Enter room status">
						</div>
						</div>
						
				
					</div>


				
					<button type="submit" id="addroom" class="btn btn-primary">Add student</button>
						
				<script type="text/javascript">
				
				document.getElementById("addroom").addEventListener("click", function() {
				  alert("Room added");
				});
				</script>
				</form>
			</div>
		</div>
	</div>
</body>
</html>