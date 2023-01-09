<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD Fee</title>
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
			<h1> Fee Status</h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/AddFeeController"
					method="post">

		
					<div class="form-group row">
						<label for="fee_status" class="col-sm-2 col-form-label">fee_status(this month)
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="fee_status" placeholder="Enter fee status(paid/ not paid/ due) ">
						</div>
					</div>
					<div class="form-group row">
						<label for="student_id" class="col-sm-2 col-form-label">student id
							</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="student_id" placeholder="Enter student id">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="student_name" class="col-sm-2 col-form-label">student_name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="student_name"
								placeholder="Enter student_name">
						</div>
						</div>
						
				
					</div>
				
					<button type="submit" id="addfee" class="btn btn-primary">Add Fee Detail</button>
					<script type="text/javascript">
				
				document.getElementById("addfee").addEventListener("click", function() {
				  alert("Fee Added");
				});
				</script>
				</form>
			</div>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>