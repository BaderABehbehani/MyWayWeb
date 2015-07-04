function loadPOITypes() {
	dojo.xhrGet({
				url : "/MyWayWeb/PointsOfInterest",
				timeout : 5000,
				content : {action:"loadPOITypes"},
				headers : {
					"Content-Type" : "application/json"
				},
				preventCache : true,
				handleAs : "json",
				handle : function(types, ioArgs) {
					for (var i = 0; i < types.length; i++) {
						var TypeSelectionVar = document.getElementById("TypeSelection");
						var option = document.createElement("option");
						option.text = types[i].type;
						option.value = types[i].typeID;
						TypeSelectionVar.add(option);
					}
				}
			});
}
function submitPOIForm() {
	if (validateForm()) {
		document.forms["poiForm"].submit();
	}
}

function validateForm() {

	var valid = true;
	var name = document.getElementById("Name").value;
	var area = document.getElementById("Area").value;
	var block = document.getElementById("Block").value;
	var street = document.getElementById("Street").value;
	var house = document.getElementById("House").value;
	var type = document.getElementById("TypeSelection").value;

	if (name == "") {
		document.getElementById('nameError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('nameError').innerHTML = "";
	}
	
	if (area == "") {
		document.getElementById('areaError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('areaError').innerHTML = "";
	}

	if (block == "") {
		document.getElementById('blockError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('blockError').innerHTML = "";
	}

	if (street == "") {
		document.getElementById('streetError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('streetError').innerHTML = "";
	}

	if (house == "") {
		document.getElementById('houseError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('houseError').innerHTML = "";
	}

	if (type == "") {
		document.getElementById('typeError').innerHTML = "Field Cannot Be Empty";
		valid = false;
	} else {
		document.getElementById('typeError').innerHTML = "";
	}

	return valid;
}

function resetfields() {

	document.getElementById('nameError').innerHTML = "";
	document.getElementById('areaError').innerHTML = "";
	document.getElementById('blockError').innerHTML = "";
	document.getElementById('streetError').innerHTML = "";
	document.getElementById('houseError').innerHTML = "";
	document.getElementById('typeError').innerHTML = "";

}