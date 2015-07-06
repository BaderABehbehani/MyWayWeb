<!DOCTYPE HTML>
<html>
<head>
<title>view Points of interest</title>
<%@include file="header.jsp" %>
<script type="text/javascript" src="js/PointsOfInterest.js"></script>
</head>
<body onload="loadPOITypes()">
	<!-- Header -->
	<div id="header">
		<div id="nav-wrapper">
			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="#">view Points of interest</a></li>
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
						Type:
								<select id="TypeSelection" name="TypeSelection">
										<option selected value=""></option>
												<!-- GET FROM DB -->
								</select> <span class="error">*</span>
						
						Points of interest:
								<select name="PointsOfInterest" id="PointsOfInterest" mulitple="multiple" >
										<option selected value=""></option>
								</select> <span class="error">*</span>
								<div id="pois"></div><br>
								<div id="selecto"></div>
					
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
	
	<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	
	<script type="text/javascript">
	
	$( document ).ready(function() {
	    console.log( "ready!" );

	    	$.getJSON( "/MyWayWeb/PointsOfInterest?action=loadPointOfInterest", function( resp ) {
	    	    
	    		var $selected= $("#TypeSelection");
	    		var $myOpt = $("#PointsOfInterest");
	    		
	    		var $pois = $("#pois");
 					 
 					$( "#TypeSelection").on('change', function (e) {
 						
 						$($myOpt).html('');
 					
 						    var optionSelected = $("option:selected", this);
 						    var valueSelected = this.value;
 						    
 						    
 						   $.each( resp, function( key, value ) {
 						    
 							   if(optionSelected.text() == value.poiType){
 						   $myOpt.append($('<option>', {
 			    	            value: key,
 			    	            text: value.namePOI
 			    	        }));
 							   }
 							   
 						  });
 						    
 					});
	    	    
	    	});
       

	});
	</script>
</body>
</html>