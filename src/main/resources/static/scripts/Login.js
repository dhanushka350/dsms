document.getElementById('login_password').onkeydown = function (event) {
    if (event.keyCode == 13) {
        login.checkLoginDetails();
    }
}

var login = {
    checkLoginDetails: function () {

        var e = {};
        e["name"] = document.getElementById("login_username").value;
        e["pass"] = document.getElementById("login_password").value;

        var d = JSON.stringify(e);

        $.ajax({
            url: 'check/login',
            dataType: 'json',
            contentType: "application/json",
            type: 'POST',
            data: d,
            success: function (data, textStatus, jqXHR) {

                window.location.replace("/"+data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                window.location.replace("/"+jqXHR.responseText);
                console.log("error" + jqXHR + " - " + errorThrown);
                console.log(textStatus);
                console.log("R: " + jqXHR.status);
                console.log("R: " + jqXHR.responseText);
            }
        });
    },

}