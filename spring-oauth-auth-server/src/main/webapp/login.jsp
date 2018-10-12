<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>

<body>

	<div class="container">

		<h1>Login</h1>

		<c:if test="${not empty param.authentication_error}">
			<h1>Woops!</h1>

			<p class="error">Your login attempt was not successful.</p>
		</c:if>
		<c:if test="${not empty param.authorization_error}">
			<h1>Woops!</h1>

			<p class="error">You are not permitted to access that resource.</p>
		</c:if>

		<div class="form-horizontal">
			<form action="login" method="post" role="form">
				<fieldset>
					<legend> Login </legend>
					<div class="form-group">
						<label for="usuario">Username:</label> <input id="usuario"
							class="form-control" type='text' name='usuario' />
					</div>
					<div class="form-group">
						<label for="senha">Password:</label> <input id="senha"
							class="form-control" type='text' name='senha' />
					</div>
					<button class="btn btn-primary" type="submit">Login</button>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</fieldset>
			</form>

		</div>

		<div class="footer">
			Sample application for <a
				href="http://github.com/spring-projects/spring-security-oauth"
				target="_blank">Spring Security OAuth</a>
		</div>

	</div>


</body>
</html>
