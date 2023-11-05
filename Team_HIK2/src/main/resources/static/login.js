//let btn = document.getElementById("support2");
//
//btn.ddEventListener("click",function() {
//	location.replace("details.html");
//},false);

//if(example1 === null) {
//	alert("User IDは必須項目です。");
//}

let example1 = document.querySelector(".example1")
let login = document.querySelector(".A");
login.addEventListener("click",() => {
	if(document.querySelector(".example1").value === "") {
		alert("User IDは必須項目です。");
		
	} else if(!(example1 === "^[a-z0-9]+$")) {
		alert("User IDは半角英数字のみで入力してください。")
	} else {
		alert("User IDは4文字以上10文字未満で入力してください")
	}});
	
//	if(example1 === "") {
//		alert("User IDは必須項目です。")
//	} else if(!(example1 === "^[a-z0-9]+$")) {
//		alert("User IDは半角英数字のみで入力してください。")
//	} else if(example1 <= 3 || example1 >= 10) {
//		alert("User IDは4文字以上10文字未満で入力してください")
//	} else if(regex.test(example1) === "^[#,$,%,&,',(,),=,~]+$") {
//		alert("User IDは4文字以上10文字未満で入力してください")
//	};
//};