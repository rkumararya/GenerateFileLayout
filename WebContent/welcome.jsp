<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='css/formlayout.css' rel='stylesheet' type='text/css'>
<script>
function fillSelectedValue(v)
{
	var id = "field_justified_checked" + v.value ;
	if(v.checked)
	{
		document.getElementById(id).value = "on";	
	}
	else
	{
		document.getElementById(id).value = "";
	}
	
}
</script>
<title>Generate Sample File Layout</title>
</head>
<body>
		<div id="page-container">
			<div id="man-nav"><span><h1>Welcome:: Sample File Layout</h1></span></div>			
			<div id="content">
				<div class="padding">
					<div>
					    <% int no_of_columns = (Integer)request.getAttribute("noOfFields"); %>
						Number of Columns : <%= no_of_columns %>
				 	</div>
					<div>
						<%String interfaceName = (String)request.getAttribute("interfaceName"); %>
						interfaceName : <%= interfaceName %>
					</div>
						  <form method="post" action="CreateFileLayout">
							<table align="center">
								<tr>
									<td align="center">Field Name</td>
									<td align="center">Field Value</td>
									<td align="center">Field Length</td>
									<td align="center">Text justified</td>
								</tr>
							<% for(int i = 0; i < no_of_columns; i++) { %>
								<tr>
									<td><input type="text" name="field_name" /></td>
									<td><input type="text" name="field_value" /></td>
									<td><input type="text" name="field_length" /></td>
									<td align="center">
									<input type="checkbox" name="field_justified" value="<%= i%>" onchange="fillSelectedValue(this)"/>
									<input type="hidden" name="field_justified_checked" id="field_justified_checked<%= i%>" value="" />
									</td>
								</tr>
							<%} %>
								<tr>
									<td colspan="2">
									<div class='col-md-offset-4 col-md-3'>
								  <button class='btn-lg btn-primary' type='submit'>Create File Layout</button>
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