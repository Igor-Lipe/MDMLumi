<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>MDM Lumi - Instalar Apps</title>
</head>
<body>
    <h2>📱 Aplicativos Permitidos</h2>

    <form method="post" action="/apps/instalar-em-grupo">
        <label for="grupo">Selecione o grupo de tablets:</label>
        <select name="grupo" id="grupo">
            <option value="A">Carrinho A</option>
            <option value="B">Carrinho B</option>
            <option value="C">Carrinho C</option>
            <option value="D">Carrinho D</option>
        </select>

        <br><br>

        <label for="app">Selecione o app para instalar:</label>
        <select name="nomeApp" id="app">
            <c:forEach var="app" items="${appsPermitidos}">
                <option value="${app.nomeApp}">${app.nomeApp}</option>
            </c:forEach>
        </select>

        <br><br>
        <button type="submit">📦 Instalar App</button>
    </form>
</body>
</html>
