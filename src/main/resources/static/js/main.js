document.getElementById("createUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");
  
    fetch("users/static/content/create")
      .then(response => response.text())
      .then(data => {
        contentElement.innerHTML = data;
    });
});
document.getElementById("updateUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");

    fetch("users/static/content/update")
        .then(response => response.text())
        .then(data => {
        contentElement.innerHTML = data;
    });
});
document.getElementById("deleteUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");

    fetch("users/static/content/delete")
        .then(response => response.text())
        .then(data => {
        contentElement.innerHTML = data;
    });
});