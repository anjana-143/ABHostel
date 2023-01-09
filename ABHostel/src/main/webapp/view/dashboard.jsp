<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsiive Admin  </title>
  <style><%@include file="/css/dashboard.css"%></style>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="sidebar">
    <div class="logo-details">
      
      <span class="logo_name"> AB Hostel</span>
    </div>
      <ul class="nav-links">
        <li>
          <a href="#" class="active">
            
              <span class="links_name" onclick="window.location.href='<%= request.getContextPath() %>/view/dashboard.jsp'">Dashboard</span>
          </a>
        </li>
        <li>

          <a href="#">  
            <span class="links_name" onclick="window.location.href='<%= request.getContextPath() %>/view/addroom.jsp'">Add Room</span>
          </a>
        </li>
        
        <li>
              <a href="#">
              
              <span class="links_name" onclick="window.location.href='<%= request.getContextPath() %>/view/addstudent.jsp'">Add Student</span>
      
          </a>
        </li>
        
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/addfee.jsp'">Add Fee</span>
          </a>
        </li>
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/addvisitor.jsp'">Add Visitor</span>
          </a>
        </li>
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/roomlogin.jsp'">View Room</span>
          </a>
        </li>
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/viewstudent.jsp'">View Student</span>
          </a>
        </li>
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/feelogin.jsp'">View Fee</span>
          </a>
        </li>
        <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/visitorlogin.jsp'">View Visitor</span>
          </a>
        </li>
       
       <li>
          <a href="#">
            
            <span class="links_name"onclick="window.location.href='<%= request.getContextPath() %>/view/login.jsp'">Log out</span>
          </a>
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Dashboard</span>
      </div>
      <div class="search-box">
        <input type="text" placeholder="Search...">
        <i class='bx bx-search' ></i>
      </div>
      <div class="profile-details">
        <img src="images/profile.jpg" alt="">
        <span class="admin_name">Admin</span>
        <i class='bx bx-chevron-down' ></i>
      </div>
    </nav>

    <div class="home-content">
      <div class="overview-boxes">
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Total Student</div>
            <div class="number">53</div>
            <div class="indicator">
             
              <span class="text">Up from yesterday</span>
            </div>
          </div>
       
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Total Rooms</div>
            <div class="number">30</div>
            <div class="indicator">
             
              <span class="text">Comfortable Rooms</span>
            </div>
          </div>
         
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Total Fee</div>
            <div class="number">20%</div>
            <div class="indicator">
              
              <span class="text">Special Discount</span>
            </div>
          </div>
          
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Total Staffs</div>
            <div class="number">10</div>
            <div class="indicator">
              
              <span class="text">Friendly and cooperative</span>
            </div>
          </div>
        
        </div>
      </div>

      <div class="sales-boxes">
        <div class="recent-sales box">
        <h1><font color="red"> AB Hostel, Home away from home</h1></font color>
          <div class="title">Quotes</div>
           <h3>Remembered the golden rule: if you live in a hostel, never throw away food. #Chetan Bhagat</h3>
           <br>
           
          </div>
          <div class="button">
          </div>
        </div>
        
      </div>
  </section>

  <script>
   let sidebar = document.querySelector(".sidebar");
let sidebarBtn = document.querySelector(".sidebarBtn");
sidebarBtn.onclick = function() {
  sidebar.classList.toggle("active");
  if(sidebar.classList.contains("active")){
  sidebarBtn.classList.replace("bx-menu" ,"bx-menu-alt-right");
}else
  sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
}
 </script>

</body>
</html>