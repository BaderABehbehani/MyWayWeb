<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Review Reports</title>
		<style>
			th,td {
				 border: solid 2px red;
				
			}
		</style>
	</head>
	<body>
		
			<button type="submit" name="pending" onClick="alert('Hi');">Pending Reports</button>
			<button type="submit" name="approved">Approved Reports</button>
			<button type="submit" name="declined">Declined Reports</button>
		<form action="ReviewReportServlet" method="post">
			<table style="border-color: black; border-style: solid; border-width: 3px; border-collapse: collapse;">
				<tr>
					<th>Report ID</th>
					<th>Report Type</th>
					<th>Report Description</th>
					<th>Voice Notification Status</th>
					<th>Location</th>
					<th>Date</th>
					<th>Time</th>
					<th colspan="2">Set Status</th>
				</tr>
				<%
					for (int i = 0; i < 10 ; i++) {
						out.println("<tr>");
						for (int j = 0 ; j < 8 ; j++ ) {
							if (j < 7) {
								out.print("<td>");
									out.print("hello");
								out.print("</td>");
							} else {
							//	out.print("<fieldset>");
								
								out.print("<td>");
								out.print("<input type='radio' name='setStatus" + i + "' value='approve'>Approve");
								out.print("</td>");
								out.print("<td>");
								out.print("<input type='radio' name='setStatus" + i + "' value='decline'>Decline");
								out.print("</td>");
							//	out.print("</fieldset>");
							}
						}
						out.println("</tr>");
					}
				%>
			</table>
			<br>
			<button type="submit" name="submit" value="Submit">Submit</button>
		</form>
	</body>
</html>