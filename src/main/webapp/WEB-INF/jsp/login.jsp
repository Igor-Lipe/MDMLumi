<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login - MDM Lumi</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #4e54c8 0%, #6a62d0 30%, #ff7e5f 60%, #ff9966 100%);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-container {
            background-color: rgba(255, 255, 255, 0.35);
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.2);
            width: 100%;
            max-width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            background-color: #4e54c8;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background-color: #3b3fc0;
        }

        .message {
            text-align: center;
            margin-top: 15px;
            font-weight: bold;
        }

        .message.error {
            color: red;
        }

        .message.success {
            color: green;
        }
    </style>
</head>
<body>

<div class="login-container">
    <div style="text-align: center; margin-bottom: 50px;">
    <img src="${pageContext.request.contextPath}/imagens/loglogin.png" 
     alt="Logo MDM Lumi" 
     style="max-width: 400px;" />
</div>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username">Usuário:</label>
        <input type="text" id="username" name="username" required />

        <label for="password">Senha:</label>
        <input type="password" id="password" name="password" required />

        <!-- CSRF Token -->
        <c:set var="csrfParameterName" value="${_csrf.parameterName}" />
        <c:set var="csrfToken" value="${_csrf.token}" />
        <input type="hidden" name="${csrfParameterName}" value="${csrfToken}" />

        <button type="submit">Entrar</button>
    </form>

    <c:if test="${param.error != null}">
        <p class="message error">Usuário ou senha inválido.</p>
    </c:if>

    <c:if test="${param.logout != null}">
        <p class="message success">Logout realizado com sucesso.</p>
    </c:if>
</div>

</body>
</html>
