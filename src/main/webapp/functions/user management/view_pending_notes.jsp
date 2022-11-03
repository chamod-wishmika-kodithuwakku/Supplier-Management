<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link href="resource/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<link href="resource/style.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap-grid.css">

	<!-- Custom CSS -->
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_custom.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_media_query.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_body.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap-grid.css">

	<!-- Custom CSS -->
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_panel_custom.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/admin_media_query.css">
	<link rel="stylesheet" type="text/css" href="../../resources/css/inventory_dashboard.css">
<style>
.dataTables_wrapper   .dataTables_filter {
	float: right;
}

dataTables_wrapper   .dataTables_pagination {
	float: right;
}
</style>

</head>
<body>
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
		
		
		<div class="container-fluid">
		<div class="row inventory-dash">
			<div class="col-12 col-sm-12 col-md-2 admin-option-column">
				<div class="sticky-top">
					<div class="admin-logo d-flex align-items-center justify-content-center">
						<img src="../../resources/body_images/admin_logo.png" class="img-fluid">
					</div>
					
					<div class="admin-option">
						<div onclick="location.href='um_dashboard.jsp'">
							<i class="bi bi-speedometer"></i>
								Supplier Management Dashboard
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
				View Pending Delivery Notes
				</div>

				<div class="dashboard-body-content">
					
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 style="text-align: center; text-decoration: underline;">Pending 
					Delivery Notes</h3>
				<br />
				<table id="example" class="table table-striped table-bordered"
					style="width: 100%">
					<thead>
						<tr>
							<th></th>
							<th>Product ID</th>
							<th>Supplier Name</th>
							<th>Quantity</th>
							<th>Total Price</th>
							<th>Date</th>
							<th>Location</th>
						
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="viewPendingNotes" items="${viewPendingNotes}">
							<form action="ApproveNote" method="post">
								<tr>
									<td>${viewPendingNotes.idsupplier}</td>
									<td>${viewPendingNotes.productId}</td>
									<td>${viewPendingNotes.description}</td>
									<td>${viewPendingNotes.quantity}</td>
									<td>${viewPendingNotes.price}</td>
									<td>${viewPendingNotes.date}</td>
									<td>${viewPendingNotes.location}</td>
									<td><input type="text"
										value="${viewPendingNotes.idsupplier}" name="idsupplier"
										hidden="true"></td>
										<td><input type="text"
										value="${viewPendingNotes.productId}" name="productId"
										hidden="true"></td>
										<td><input type="text"
										value="${viewPendingNotes.description}" name="description"
										hidden="true"></td><td><input type="text"
										value="${viewPendingNotes.quantity}" name="quantity"
										hidden="true"></td><td><input type="text"
										value="${viewPendingNotes.price}" name="price"
										hidden="true"></td><td><input type="text"
										value="${viewPendingNotes.date}" name="date"
										hidden="true"></td><td><input type="text"
										value="${viewPendingNotes.location}" name="location"
										hidden="true"></td>
									<td><button type="submit" class="btn btn-success" id="btn2"
											name="btn2" value="btn2">Approve</button></td>
											
												<td><button type="submit" class="btn btn-danger" id="btn3"
											name="btn3" value="btn3">Reject</button></td>
								</tr>
							</form>
						</c:forEach>
					</tbody>
				</table>

				
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