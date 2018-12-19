import 'bootstrap/dist/css/bootstrap.css'
const botClick = document.querySelector("#ajaxBot");
const northClick = document.querySelector("#north");
const southClick = document.querySelector("#south");
const eastClick = document.querySelector("#east");
const westClick = document.querySelector("#west");
botClick.addEventListener("click", addqoute, false);
northClick.addEventListener("click", writeInPNorth, false);
southClick.addEventListener("click", writeInPSouth, false);
eastClick.addEventListener("click", writeInPEast, false);
westClick.addEventListener("click", writeInPWest, false);


function addqoute(){
    fetch('https://studypoints.dk/jokes/api/jokes/period/hour')
    .then(function (response) { return response.json(); })
    .then(function (data) {
      document.getElementById('divID').innerHTML = ('qoute:' + data.joke )
    });
}

function writeInPNorth(){  
    document.getElementById("write").innerHTML = "north";
}
function writeInPSouth(){
    document.getElementById("write").innerHTML = "south";
}
function writeInPEast(){
    document.getElementById("write").innerHTML = "east";
}
function writeInPWest(){   
    document.getElementById("write").innerHTML = "west";
}