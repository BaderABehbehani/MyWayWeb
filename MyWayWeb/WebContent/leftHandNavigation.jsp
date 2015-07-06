

<div class="row">
	<section class="6u">
		<c:choose>
			<c:when test="${sessionScope.user.userRole == 'admin'}">
				<ul class="default">
					<li><a href="admin.jsp">Home</a></li>
					<li><a href="viewPointsOfInterest.jsp">Review Point of
							Interests</a></li>
					<li><a href="postPointOfInterest.jsp">Review Reports </a></li>
					<li><a href="Logout">Log out</a></li>
				</ul>
			</c:when>
			<c:when test="${sessionScope.user.userRole == 'user'}">
				<ul class="default">
					<li><a href="userHome.jsp">Home</a></li>
					<li><a href="viewPointsOfInterest.jsp">View Point of
							Interests</a></li>
					<li><a href="postPointOfInterest.jsp">Post New Point of
							Interest</a></li>
					<li><a href="Logout">Log out</a></li>
				</ul>
			</c:when>
			<c:otherwise>
				<ul class="default">
					<li><a href="userHome.jsp">Home</a></li>
					<li><a href="viewPointsOfInterest.jsp">View Point of
							Interests</a></li>
					<li><a href="postPointOfInterest.jsp">Post New Point of
							Interest</a></li>
					<li><a href="parentsMonitoring.jsp">Parental Monitoring</a></li>
					<li><a href="Logout">Log out</a></li>
				</ul>

			</c:otherwise>
		</c:choose>


	</section>

</div>