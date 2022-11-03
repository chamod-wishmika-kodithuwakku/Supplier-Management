<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">



	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap-grid.css">
    <link href="bootstrap/css/Footer.css" rel="stylesheet">
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
	
</head>
<body>
	<div class="container">
		<div class="row">

			<!-- Left side -->
			<div class="col-md-12">
				<div>
					<%
									if (request.getAttribute("msgReg") == "true") {
								%>
								
									<div class="alert alert-success" role="alert">Delivery Note Added
									</div>
								<%
									}else if(request.getAttribute("msgReg") == "false"){
								%>
									
									<div class="alert alert-danger" role="alert">Delivery Note Not Added
									</div>
								<%
									}
								%>
								
								
								
							<div class="col-12 col-sm-3 d-flex align-items-center justify-content-center home-btn-parent">
			
				<button type="button" class="nav-home-btn theme-bg-color" onclick="location.href='login.jsp'">Login</button>
				
			</div>
					
						
					
					<div
						style="width: 100%; margin-top: 50px; padding: 20px 50px 50px 50px">
						<div align="center">
						<h2>Add delivery notes</h2>
							<img src="../../resources/image/user_login.jpg" width="400px" height="400px">
						</div>
						<form action="addnote" method="post">
							<div class="form-group">
								<label for="proid">Enter product id</label> <input
									type="text" class="form-control" id="pid"
									placeholder="INSEEC01" name="pid"
									required="required">
							</div>
							
							<div class="form-group">
								<label for="prodis"> Supplier name</label> <input
									type="text" class="form-control" id="pdis"
									value="${param.userId}" readonly name="pdis"
									required="required">
							</div>
							
							<div class="form-group">
								<label for="quantity">Enter quantity</label> <input
									type="text" class="form-control" id="qty"
									placeholder="54" name="qty"
									required="required">
							</div>
								<div class="form-group">
								<label for="totprice">Enter total price</label> <input
									type="text" class="form-control" id="tp"
									placeholder="12000.23" name="tp"
									required="required">
							</div>
							
							
								<div class="form-group">
								<label for="location">Enter location</label> <input
									type="text" class="form-control" id="loc"
									placeholder="72/2 senarathgaam katugastota" name="loc"
									required="required">
							</div>
							<br />
							
							<div align="center">
								<button type="submit" class="button "
									style="width: 100%" name="btn" value="btn1">Add delivery note</button>
							</div>
						</form>
					</div>
				</div>
			</div>
</body>
</html>