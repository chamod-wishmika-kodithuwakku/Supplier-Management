<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Inventory Dashboard</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap-grid.css">

	<!-- Custom CSS -->
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_custom.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_media_query.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/inventory_dashboard.css">
</head>

<body>
	<!-- Header -->
	<div class="p-2 container-fluid theme-bg-color">
		<div class="container">
			<div class="row">
			
			<div class="col-12 col-sm-3 d-flex align-items-center justify-content-center home-btn-parent">
			
			<div class="col admin-title">C_construction</div>
			 &nbsp &nbsp &nbsp &nbsp
			
				<button type="button" class="nav-home-btn theme-bg-color" onclick="location.href='admin_panel.jsp'">Home</button>
				
			</div>

			<div class="col-12 col-sm-7 d-flex align-items-center media-flex hide">
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
	<div class="container-fluid">
		<div class="row inventory-dash">
			<div class="col-12 col-sm-12 col-md-2 admin-option-column">
				<div class="sticky-top">
					<div class="admin-logo d-flex align-items-center justify-content-center">
						<img src="../../resources/body_images/admin_logo.png" class="img-fluid">
					</div>
					
					<div class="admin-option">
						
						
						<div onclick="location.href='/Uptrend/functions/user%20management/viewPendingDeliveryNotes'">
							<i class="bi bi-file-earmark-spreadsheet-fill"></i>
							View Pending Delevery Notes
						</div>
						
						<div onclick="location.href='/Uptrend/functions/user%20management/view_Approved_Notes'">
							<i class="bi bi-pie-chart-fill"></i>
							View Approved Delivery Notes
						</div>
						
						<div onclick="location.href='/Uptrend/functions/user%20management/view_Rejected_Notes'">
							<i class="bi bi-pie-chart-fill"></i>
							View Rejected Notes
						</div>
						
						<div onclick="location.href='/Uptrend/functions/user%20management/reports2'">
							<i class="bi bi-file-earmark-spreadsheet-fill"></i>
							Today Registered Suppliers
						</div>  
						<div onclick="location.href='/Uptrend/functions/user%20management/viewDeletedUser'">
							<i class="bi bi-trash-fill"></i>
							Deleted Suppliers
						</div>	
						
						<div onclick="location.href='/Uptrend/functions/user%20management/user-search.jsp'">
							<i class="bi bi-pie-chart-fill"></i>
							View Suppliers
						</div>	
					</div>
				</div>
				
			</div>

			<div class="col-12 col-sm-12 col-md-10">
				<div class="dashboard-body-title">
					SUPPLIER MANAGEMENT DASHBOARD
				</div>

				<div class="dashboard-body-content">
					<img src="../../resources/body_images/user_management.png" width="500" height="500">
				</div>
			</div>	
		</div>
	</div>

	



</body>
</html>