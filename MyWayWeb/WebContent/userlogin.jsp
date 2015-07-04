<!DOCTYPE HTML>
<html>
<head>
<title>UserLogin</title>
<%@include file="header.jsp" %>
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
							<h2>User Login</h2>
						</header>
						<h3>Enter username</h3>
						<input type="text" required><br>
						<h3>Enter Password</h3>
						<input type="password" required><br><br>
						<button onclick="window.location.href = 'userHome.jsp';">Log in</button>
					</section>	
				</div>

			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>
</body>
</html>