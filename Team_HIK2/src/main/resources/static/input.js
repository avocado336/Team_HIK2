$(function() {
	$("#nextBtn").click(function() {
		// valはinputhtmlで入力した値をjs側で受け取る宣言方法
		const name = $("#name").val();
		const kana = $("#kana").val();
		const hobby = $('[name="hobby"]:checked').val();

		if (name == "" || name.length == 0) {
			alert("名前は必須項目です。")
			return false;
		} else if (name.length > 10) {
			alert("名前は10文字以内で入力してください。")
			return false;
		}

		if (kana == "" || kana.length == 0) {
			alert("フリガナは必須項目です。")
			return false;
		} else if (kana.length > 20) {
			alert("フリガナは20文字以内で入力してください。")
			return false;
//		} else if (kana !== "[\u30A1-\u30F6]*") {
//			alert("カタカナ以外は受け付けておりません")
//			return false;
		}

		if (!hobby) {
			alert("趣味は必須項目です。1つ以上選んでください。")
			return false;
		}

	});
});