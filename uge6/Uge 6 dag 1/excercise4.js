var numbers = [1, 3, 5, 10, 11];
var names2 = [{name:"Lars",phone:"1234567"}, {name: "Peter",phone: "675843"}, {name: "Jan", phone: "98547"},{name: "Bo", phone: "79345"}];

function fibo(element, index, array){
    if(index+1 === array.length){
        return element;
    }
    else {
        return element  + array[index+1];
    }
    

}

var names = ["Lars","Peter","Jan","Bo"];

function makeA(element){
    var href = "<a href=\"\">"+element + "</a> <br>";
    return href;
}

function makeTable(item, index,array){
    var result = "<tr><td>"+[item.name,item.phone].join(" ") +"</td></tr>";
       
    return result;
}

function filterByA(){
    document.getElementById("nav2").innerHTML = names.map(filterA);
}
function filterA(names){
    return names.includes('a');
}

    document.getElementById("demo").innerHTML = numbers.map(fibo);
    document.getElementById("nav").innerHTML = names.map(makeA);
    document.getElementById("table").innerHTML = names2.map(makeTable); 
    