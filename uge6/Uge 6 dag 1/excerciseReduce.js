var all= ["Lars", "Peter", "Jan", "Bo"];
document.getElementById("demo").innerHTML = all.join(", #");

var numbers = [2, 3, 67, 33]; 

function getSum(total, num) {
    return total + num;
}

document.getElementById("demo2").innerHTML = numbers.reduce(getSum);