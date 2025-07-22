<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDM Lumi - BlockApps</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            padding: 20px;
        }

        h2 {
            color: #333;
        }

        .app-list {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
        }

        .app-card {
            background: white;
            border-radius: 10px;
            padding: 15px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            width: 200px;
        }

        .app-card input {
            margin-right: 10px;
        }

        .submit-btn {
            margin-top: 20px;
            padding: 10px 20px;
            background: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .submit-btn:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>📱 Gerenciar Aplicativos Permitidos</h2>
    <p>Selecione os aplicativos que podem ser acessados nos dispositivos:</p>

    <form action="salvarApps" method="post">
        <div class="app-list">
            <div class="app-card">
                <input type="checkbox" name="apps" value="binoculo" checked />
                Binóculo
            </div>
            <div class="app-card">
                <input type="checkbox" name="apps" value="az" checked />
                AZ
            </div>
            <div class="app-card">
                <input type="checkbox" name="apps" value="kahoot" checked />
                Kahoot
            </div>
            <div class="app-card">
                <input type="checkbox" name="apps" value="youtube" />
                YouTube
            </div>
            <div class="app-card">
                <input type="checkbox" name="apps" value="tiktok" />
                TikTok
            </div>
            <!-- Adicione mais aplicativos conforme necessário -->
        </div>

        <button class="submit-btn" type="submit">Salvar Permissões</button>
    </form>
</div>

</body>
</html>
