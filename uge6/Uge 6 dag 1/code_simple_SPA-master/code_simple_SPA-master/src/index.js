import 'bootstrap/dist/css/bootstrap.css'
import jokes from "./jokes";
const findJoke = document.querySelector("#getJoke");
const addJoke = document.querySelector("#addJoke");




const allJokes = jokes.getJokes().map(joke => "<li>"+joke+"</li>");
document.getElementById("jokes").innerHTML = allJokes.join("");

function getJoke() {
    let id = document.querySelector("#tID"); 
    let temp = jokes.getJokeById(id.value);
    document.getElementById("foundJoke").innerHTML = temp;
}

function addJoke1() {
    let newJoke = document.querySelector("#addJ"); 
    jokes.addJoke(newJoke.value);
   const allJokes2 = jokes.getJokes().map(joke => "<li>"+joke+"</li>");
    document.getElementById("jokes").innerHTML = allJokes2.join("");
}

findJoke.addEventListener("click", getJoke, false);
addJoke.addEventListener("click", addJoke1, false);



