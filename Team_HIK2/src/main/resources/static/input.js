$(function() {
	$("#nextBtn").click(function() {
		const name = $("#name").val();
		const kana = $("#kana").val();
		const hobby = $('[name="hobby"]:checked').val();

		if (name == "" || name.length == 0) {
			alert("名前は必須項目です。")
			return false;
		} else if(name.length > 10){
			alert("名前は10文字以内で入力してください。")
			return false;
		}

		if (kana == "" || kana.length == 0) {
			alert("フリガナは必須項目です。")
			return false;
		}else if(kana.length > 20){
			alert("フリガナは20文字以内で入力してください。")
			return false;
		}
		
		if(!hobby){
			alert("趣味は必須項目です。1つ以上選んでください。")
			return false;
		}
		
	});
});