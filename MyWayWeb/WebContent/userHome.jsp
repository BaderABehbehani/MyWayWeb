<!DOCTYPE HTML>
<html>
<head>
<title>User Home</title>
<%@include file="header.jsp" %>
</head>
<body>
	<!-- Header -->
	<div id="header">
		<div id="nav-wrapper">
			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="#">User Home</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<div id="main">
		<div class="container">
			<div class="row">
				<div id="sidebar" class="4u">
					<section>
						<header>
							<h2>Menu</h2>
						</header>
						<%@include file="leftHandNavigation.jsp" %>
					</section>
				</div>
				<!-- Content -->
				<div id="content" class="8u skel-cell-important">
					<section>
						<header>
							<h2>Welcome to your account</h2>
						</header>
					</section>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>