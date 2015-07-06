<!DOCTYPE HTML>
<html>
<head>
<title>UserLogin</title>
<%@include file="header.jsp"%>
<style>
.req {
	color: red;
	disply: inline;
}
</style>
</head>
<body>
	<!-- Header -->
	<div id="header">
		<div id="nav-wrapper">
			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="#">UserLogin</a></li>
				</ul>
			</nav>
		</div>

	</div>
	<!-- Header -->

	<!-- Main -->
	<div id="main">
		<div class="container">
			<div class="row">
				<!-- Content -->
				<div id="content" class="8u skel-cell-important">
					<section>
						<header>
							<h2>User Register</h2>
						</header>
						<form method="post" action="Register">
							<fieldset width=200px>
								<legend>Personal information:</legend>
								<p>First Name:</p>
								<input name="FirstName" type="text" required>
								<pre class="req"> * </pre>
								<p>Last Name:</p>
								<input name="Lastname" type="text" required>
								<pre class="req"> * </pre>
								<p>User Name:</p>
								<input name="username" type="text" required>
								<%
									boolean fl = Boolean.valueOf((request.getParameter("userExists")));

									String msg = "";

									if (fl == true) {
										msg = "Username duplicate";
									}
								%>
								<div style="color: red;"><%=msg%></div>
								<pre class="req"> * </pre>
								<p>Password:</p>
								<input name="password" type="password" required>
								<pre class="req"> * </pre>
								<p>Confirm Password:</p>
								<input name="conPassword" type="password" required>
								<pre class="req"> * </pre>
								<p>Role:</p>
								<select name="userRole">
									<option value="user ">user</option>
									<option value="Parent">Parent</option>

									<pre class="req"> * </pre>
								</select>
								<p>E-mail:</p>
								<input name="email" type="email" required>
								<pre class="req">  </pre>
								<p>Mobile:</p>
								<input name="mobile" type="number" required>
								<pre class="req">  </pre>

								<br> <br> <input type="submit" name="sumbit"
									value="submit" />
									<input type="button" name="cancel"
									value="cancel" />
							</fieldset>
						</form>
					</section>
				</div>

			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>