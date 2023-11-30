let btn = document.getElementById("btn");
btn.addEventListener('click', function(event) {
	event.preventDefault();
	let userID = document.getElementById("userId").value;
	let password = document.getElementById("passWord").value;
	let mailAddress = document.getElementById("mailAddress").value;
	// form内の値を取得
	let formElement = document.forms.top2;
	// エラーメッセージの初期化
	let errorMessage = "";
	// User IDのバリデーション
	if (userID === "") {
		errorMessage += "User IDは必須項目です。\n";
	} else if (!/^[a-zA-Z0-9]+$/.test(userID)) {
		errorMessage += "User IDは半角英数字のみで入力してください。\n";
	} else if (userID.length > 10 || userID.length < 3) {
		errorMessage += "User IDは10文字以内で入力してください。\n";
	} else if (/[#$%&'()=~]/.test(userID)) {
		errorMessage += "User IDに特殊記号を使用しないでください。\n";
/*	} else if(userRepository.existsByUserId(form.getUserId())) {
		errorMessage += "このユーザーは登録済みです。\n";	*/
	}
	// MailAddressのバリデーション
	if (mailAddress === "") {
		errorMessage += "MailAddressは必須項目です。\n";
	} else if (!/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/.test(mailAddress)) {
		errorMessage += "正しいMailAddress形式で入力してください。\n";
	} else if (/[^a-zA-Z0-9.@_%-+]/.test(mailAddress)) {
		errorMessage += "MailAddressは半角英数字と@._%-+のみで入力してください。\n";
	}
	// Passwordのバリデーション
	if (password === "") {
		errorMessage += "PassWordは必須項目です。\n";
	} else if (/[^a-zA-Z0-9]/.test(password)) {
		errorMessage += "PassWordは半角英数字のみで入力してください。\n";
	} else if (password.length > 10 || password.length < 3) {
		errorMessage += "PassWordは10文字以内、3文字以上で入力してください。\n";
	} else if (!/[a-z]/.test(password) || !/[A-Z]/.test(password) || !/[0-9]/.test(password)) {
		errorMessage += "PassWordは大文字小文字数字を組み合わせて入力してください。\n";
	} else if (/[#$%&'()=~]/.test(password)) {
		errorMessage += "PassWordに特殊記号を使用しないでください。\n";
	}
	// エラーメッセージがある場合は表示
	if (errorMessage !== "") {
		alert(errorMessage);
		return false; // フォームの送信をキャンセル
	} else {
		// フォームの送信を許可
		formElement.submit();
		return true;
	}
	
});