/*let btn = document.getElementById("btn");
btn.addEventListener('click', function(event) {
	event.preventDefault();
	// ユーザーIDとパスワードの値を取得
	let userId = document.getElementById("userId").value;
	let password = document.getElementById("password").value;
	// form内の値を取得
	let formElement = document.forms.top1;
	// エラーメッセージの初期化
	let errorMessage = "";
	// User IDのバリデーション
	if (userId === "") {
		errorMessage += "User IDは必須項目です。\n";
	} else if (!/^[a-zA-Z0-9]+$/.test(userId)) {
		errorMessage += "User IDは半角英数字のみで入力してください。\n";
	} else if (userId.length > 10 || userId.length < 3) {
		errorMessage += "User IDは4文字以上10文字未満で入力してください。\n";
	} else if (/[#$%&'()=~]/.test(userId)) {
		errorMessage += "User IDには特殊記号を使用しないでください。\n";
	}
	// Passwordのバリデーション
	if (password === "") {
		errorMessage += "PassWordは必須項目です。\n";
	} else if (!/^[a-zA-Z0-9]+$/.test(password)) {
		errorMessage += "PassWordは半角英数字のみで入力してください。\n";
	} else if (password.length > 10 || password.length < 3) {
		errorMessage += "User IDは10文字以内で入力してください。\n";
	} else if (!/[a-z]/.test(password) || !/[A-Z]/.test(password) || !/[0-9]/.test(password)) {
		errorMessage += "PassWordは大文字小文字数字を組み合わせて入力してください。\n";
	} else if (/[#$%&'()=~]/.test(password)) {
		errorMessage += "PassWordには特殊記号を使用しないでください。\n";
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
*/