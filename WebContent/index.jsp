<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='css/formlayout.css' rel='stylesheet' type='text/css'>
<title>File Layout :: </title>
</head>
<body>
		<div id="page-container">
			<div id="man-nav"><span><h1>Sample File Layout</h1></span></div>
			<div id="content">
				<div class="padding">	
				  <form method="post" action="GenerateFIleLayout">
				  <table>
				  	<tr>
				  		<td><span>Number of Fields:</span></td>
				  		<td><span><input type="text" value="" name="no_of_fields" id="no_of_fields"></span></td>
				  	</tr>
				  	<tr>
				  		<td><span>Interface Name:</span></td>
				  		<td><span><input type="text" value="" name="interface_name" id="interface_name"></span></td>
				  	</tr>
				  	<tr>
				  		<td colspan="2">
							<div class='col-md-offset-4 col-md-3'>
								<button class='btn-lg btn-primary' type='submit'>Generate Columns</button>
							</div>
						</td>
				  	</tr>
				  </table>
					  					 
				</form>
 
				</div>
			</div>
			<!-- <div id="footer"></div> -->
		</div>
</body>
</html>
