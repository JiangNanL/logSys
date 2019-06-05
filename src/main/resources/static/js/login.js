/**
 * 
 */

function loginSubmit()
{
 var username =  document.getElementById("username").value;
 var pw = document.getElementById("password").value;
 if(username==""){
	// console.log("??");
	 document.getElementById("error").innerHTML = "请输入用户名！";
	return;
 }
 
 if(pw==""){
	 document.getElementById("error").innerHTML = "请输入密码！";
	 return;
	 
 }
}

/*
 * z中文校验
 */
function isChinese(obj){
	var reg = /^[\u0391-\uFFE5]+$/;
	if(obj!=""&&!reg.test(obj)){
		alert("必须输入中文！");
		return false; 
	}
}

