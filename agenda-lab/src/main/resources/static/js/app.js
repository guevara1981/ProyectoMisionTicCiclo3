const loadUserConfig = () => {

    const user = localStorage.getItem("loggedUser");
  
    const userInfo = JSON.parse(user);

    document.getElementById("usuario").innerText = userInfo.name;

};