const names = ["Franco","Alberto","Miguel","Jose","Fernando","Pepe"];

function checkA(names){
    return names.includes('a');
}

function rever(ar){
    var splitString = ar.split("");
    var reverseArray = splitString.reverse();
    var joinArray = reverseArray.join("");
    return joinArray; 
}

function func(){
    document.getElementById("demo").innerHTML = names.filter(checkA);
}

function func1(){
    document.getElementById("demo").innerHTML = names.map(rever);
    
}