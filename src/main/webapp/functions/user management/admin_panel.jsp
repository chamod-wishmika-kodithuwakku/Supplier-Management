<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Admin Panel</title>
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap-grid.css">

	<!-- Custom CSS -->
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_custom.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_media_query.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_body.css">
</head>


<body>
	<!-- Header -->
	<div class="p-2 container-fluid theme-bg-color">
		<div class="container">
			<div class="row">
			

			<div class="col-12 col-sm-3 d-flex align-items-center justify-content-center home-btn-parent">
			
			<div class="col admin-title">C_construction</div>
			 &nbsp &nbsp &nbsp &nbsp
				<button type="button" class="nav-home-btn theme-bg-color" >Home</button>
			</div>
			
			<div class="col-12 col-sm-3 d-flex align-items-center justify-content-center home-btn-parent">
			
				<button type="button" class="nav-home-btn theme-bg-color" onclick="location.href='admin.jsp'">Login</button>
				
			</div>

			<div class="col-12 col-sm-3 d-flex align-items-center media-flex hide">
				<div class="row">
					<div class="col d-flex flex-row-reverse align-items-center">
						<div class="p-2 online-icon"></div>
					</div>
					<div class="col admin-title">Admin</div>
				</div>
				
			</div>

		</div>
		</div>
	</div>

	<!-- Body -->
	<div class="p-2 container-fluid parent-body">
		<div class="container children-body">
			<div class="body-title text-center">
				Admin Panel
			</div>
			
			<div class="col-md-12 bg-light text-right">
			
				<button type="button" class="nav-home-btn theme-bg-color" onclick="location.href='add_admin.jsp'">Add Admin</button>
				
			</div>

			<div class="container body-panel-option">

				<div class="row">
					<div class="col-12 col-sm-4 func-body">
						<div class="col func-body-frame" onclick="location.href='#User Management'">
							<div class="row func-body-img">
								<img src="../../resources/body_images/user_management.png"  onclick="location.href='um_dashboard.jsp'">
							</div>
							<div class="row func-body-title">
								<div class="text-center">
									 Supplier
								</div>
								
							</div>
						</div>
					</div>

					<div class="col-12 col-sm-4 func-body">
						<div class="col func-body-frame" onclick="location.href='../inventory-management/inventory-dashboard'">
							<div class="row func-body-img">
								<img src="../../resources/body_images/inventory_management.png">
							</div>
							<div class="row func-body-title">
								<div class="text-center">
									Order
								</div>
								
							</div>
						</div>
					</div>

					<div class="col-12 col-sm-4 func-body">
						<div class="col func-body-frame" onclick="location.href='../supplier%20management/Dashboard.jsp'">
							<div class="row func-body-img">
								<img src="../../resources/body_images/supplier_management.png">
							</div>
							<div class="row func-body-title">
								<div class="text-center">
									Products
								</div>
								
							</div>
						</div>
					</div>
						
				</div>
				
				

			</div>
		</div>
		
	</div>

	<!-- Footer -->
	<div class="p-4 container-fluid theme-bg-color d-flex justify-content-center align-items-center">
		<div class="footer-title text-center">
			
		</div>
	</div>

</body>
</html>