import 'bootstrap/dist/css/bootstrap.css'
const getUser = document.querySelector("#botID");
const newUser = document.querySelector("#newUser");
const deleteUser = document.querySelector("#deleteUser");
function getALL(){
    fetch('http://localhost:3333/api/users')
    .then(function (response) { return response.json(); })
    .then(function (data) {
      document.getElementById('list').innerHTML = ('<table id = userTable><th>Age</th><th>Name</th><th>Gender</th><th>Email</th>')
      for (var i = 0; i < data.length; i++) {
        document.getElementById('userTable').innerHTML += ('<tr><td> ' + data[i].age + '</td><td> ' + data[i].name + '</td><td> ' + data[i].gender + '</td><td> ' + data[i].email + '</td></tr>')
      }
    }); 
}

  function getUserByID() {

    let id = document.querySelector("#userID"); 
    fetch('http://localhost:3333/api/users/' + id.value)
        .then(function (response) { return response.json(); })
        .then(function (data) {
            document.getElementById('UserData').innerHTML = ('ID is:' + data.age + ' Name is: ' + data.name + ' Gender is: ' + data.gender + ' Email is: '+ data.email)  
      });
}

function addNewUser(){
    let age = document.querySelector("#userAge"); 
    let name = document.querySelector("#userName"); 
    let gender = document.querySelector("#userGender"); 
    let email = document.querySelector("#userEmail"); 

    let options = {
        method: "POST",
        headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          age: age.value,
          name: name.value,
          gender: gender.value,
          email: email.value
        })
     }
     fetch("http://localhost:3333/api/users",options);
    
}

function deleteUserByID() {

    let id = document.querySelector("#userID"); 
    let options = {
        method: "DELETE",
        headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        },

     }
     fetch("http://localhost:3333/api/users/"+id.value,options);
    
}

deleteUser.addEventListener("click", deleteUserByID, false);
getUser.addEventListener("click", getUserByID, false);
document.getElementById("allUsers").addEventListener("click", getALL);
newUser.addEventListener("click", addNewUser, false);