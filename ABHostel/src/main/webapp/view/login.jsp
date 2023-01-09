
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<style><%@include file="/css/login.css"%></style>
<title>Login</title>
</head>
<body>
	<input type="hidden" id="status" value="<%=request.getAttribute("status") %>"/>
	<div class="login-wrapper">
		<form action="<%=request.getContextPath()%>/LoginController"
			method="post" class="form">

			<div class="container" onclick="onclick">
  <div class="top"></div>
  <div class="bottom"> </div>

  <div class="center">
    <h2>Please Log in</h2>
    <input type="text" name="username" placeholder="user name"/>
    <input type="password" name="password" placeholder="password"/>
    
    <input type="submit" value="Login" class="submit-btn"/>
    <h2>&nbsp;</h2>
  </div>
</div>
			
			<!-- <input type="submit" value="Register" class="submit-btn" onclick="goToRegisterPage()"/> -->
		<!-- <input type="submit" value="Register" class="submit-btn" onclick="window.location.href='<%= request.getContextPath() %>/view/dashboard.jsp'"/> -->	
			
		</form>
	</div>
</body>
<script src="js/jquery-3.6.1.min.js"></script>
<script src="js/main.js"></script>
<script type="text/javascript">
	var status = document.getElementById("status").value;
	if(status=="failed"){
		 alert("Either username or password is incorrect !!");
	}
</script>

<script>
	function goToRegisterPage(){
		window.location = "dashboard.jsp";
	 }
</script>
</html>




