
function load(lat,lng) {

    var mapOpt = {
        center: new google.maps.LatLng(lat,lng),
        zoom: 11,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    var map = new google.maps.Map(document.getElementById("googleMap"), mapOpt);
}

function loadDefault() {

    var mapOpt = {
        center: new google.maps.LatLng(29.349969,47.980631),
        zoom: 8,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    var map = new google.maps.Map(document.getElementById("googleMap"), mapOpt);
}