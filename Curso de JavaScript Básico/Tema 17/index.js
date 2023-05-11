let map, makers;

function initMap() {

    const position = {
        lat: -34.397,
        lng: -34.397
    }
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: position
    })

    makers.push(
        new google.maps.Marker({
            position: {
                lat: 43.4722475,
                lng: -3.8199358
            },
            map,
            title: "Santander"
        })
    )
    makers.push(
        new google.maps.Marker({
            position: {
                lat: 35.6919692956754,
                lng: 139.75419284336286
            },
            map,
            title: "Tokyo"
        })
    )
    makers.push(
        new google.maps.Marker({
            position: {
                lat: 30.04402913587217,
                lng: 31.24524560391992
            },
            map,
            title: "El Cairo"
        })
    )
}

