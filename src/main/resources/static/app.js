var stompClient = null;

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });

    // Sayfa açıldığında otomatik bağlan
    connect();
});

function connect() {
    var socket = new SockJS('/parity/websocket');

    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {

        setConnected(true);

        console.log('Connected: ' + frame);

        stompClient.subscribe('/topic/parities', function (response) {

            var parities = JSON.parse(response.body);

            for (var k in parities) {
                showParity(parities[k]);
            }

        });
    });
}

function showParity(parity) {

    if ($("#parity-" + parity.paritySymbol)[0] != null) {
        $("#parity-" + parity.paritySymbol).html(parity.price);
    } else {
        $("#parities").append("<tr><td>" + parity.paritySymbol + "</td><td id='parity-" + parity.paritySymbol + "'>" + parity.price + "</td></tr>");
    }

}

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);

    /*if (connected) {
        $("#parity-table").show();
    } else {
        $("#parity-table").hide();
    }*/

    $("#greetings").html("");
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }

    setConnected(false);

    console.log("Disconnected");
}