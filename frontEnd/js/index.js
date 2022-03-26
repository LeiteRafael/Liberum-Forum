/* ///////////////////////////////////////////////////////// */
const showPasswordElement = document.getElementById("show_password");

function showPassword(){
	var passwordElement = document.getElementById("password");
	if(passwordElement.type === "password"){
		passwordElement.type = "text";
	}else{
		passwordElement.type = "password";
	}//end of if else
}//end of showPassword

showPasswordElement.addEventListener("click", e=>{
	showPassword();
});//end of showPasswordElement.addEventListener
/* ///////////////////////////////////////////////////////// */
