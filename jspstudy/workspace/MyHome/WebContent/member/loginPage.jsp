<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function fn_login(f) {
		if(f.mId.value == ''|| f.mPw.value == ''){
			alert('아이디와 비밀번호를 모두 입력하세요.');
			return;
		}
		/* if($('#mId').val() == '' || $('#mPw').val() == ''){
			// jquery식 위와 같은 의미
		} */
		f.action = '/MyHome/login.member';
		f.submit();
	}
</script>
</head>
<body>
	<div class="login-box">
		<form method="post">
			<label for="mId">아이디</label><br/>
			<input type="text" name="mId" id="mId" autofocus/><br/><br/>
			<label for="mPw">비밀번호</label><br/>
			<input type="password" name="mPw" id="mPw"/><br/><br/>
			<input type="button" value="로그인" onclick="fn_login(this.form)"/>
		</form>
	</div>
</body>
</html>