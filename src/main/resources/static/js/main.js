document.getElementById("createUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");
  
    fetch("users/static/content/getHtmlCreate")
      .then(response => response.text())
      .then(data => {
        contentElement.innerHTML = data;
    });
});
document.getElementById("updateUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");

    fetch("users/static/content/getHtmlUpdate")
        .then(response => response.text())
        .then(data => {
        contentElement.innerHTML = data;
    });
});
document.getElementById("deleteUser").addEventListener("click", function() {
    const contentElement = document.getElementById("content");

    fetch("users/static/content/getHtmlDelete")
        .then(response => response.text())
        .then(data => {
        contentElement.innerHTML = data;
    });
});