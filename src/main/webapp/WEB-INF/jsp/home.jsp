<!-- WEB-INF/jsp/home.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home - MDM Lumi</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f5f6fa;
        }

        /* Abinha Superior */
        .header {
            height: 50px;
            background: linear-gradient(90deg, #A020F0, #8A2BE2);
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            z-index: 999;
        }
        
        .sidebar {
		    position: fixed;
		    top: 25px; /* abaixo da header */
		    left: 0;
		    width: 260px;
		    height: calc(100% - 10px); /* ocupa o resto da tela abaixo da header */
		    background: #FF8C00;
		    color: white;
		    padding-top: 10px;
		    overflow-y: auto;
		}

        .sidebar a {
		    color: white;
		    text-decoration: none;
		    display: block;
		    padding: 10px 15px;
		    border-radius: 5px;
		    transition: background 0.2s;
		}

        .sidebar h2 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 20px;
        }

        .sidebar ul {
            list-style: none;
            padding: 0;
        }

        .sidebar li {
            margin-bottom: 5px;
        }

        .sidebar a:hover {
            background-color: #9400D3;
		    color: white;
		    text-decoration: none;
        }

        .main {
        min-height: calc(100vh - 50px); /* altura total da tela menos a header (50px) */
	    margin-left: 260px;
	    padding: 80px 20px 20px 20px; /* top padding maior por causa da abinha */
	
	    /* Imagem de fundo */
	    background-image: url('${pageContext.request.contextPath}/imagens/fundohome.png');
	    background-repeat: no-repeat;
	    background-position: center center;
	    background-size: cover;
	
	    /* Camada branca translúcida para melhorar a leitura */
	    background-color: rgba(255, 255, 255, 0.8);
	    background-blend-mode: lighten;
}


        .card {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
        }

        .logout {
            padding: 12px 20px;
		    cursor: pointer;
		    display: block;
		    transition: background 0.2s;
		    color: white;
		    text-decoration: none;
        }

        .logout:hover {
        	background-color: #9400D3;
            text-decoration: none;
        }
    </style>
</head>
<body>

<!-- Abinha Superior -->
<div class="header" style="display: flex; align-items: left; justify-content: left;">
    <div style="background-color: black; padding: 5px 57px; border-radius: 0px;">
        <img src="${pageContext.request.contextPath}/imagens/loglogin.png" 
             alt="Logo MDM Lumi" 
             style="height: 40px; display: block;" />
    </div>
</div>
<!-- Menu Lateral -->
<div class="sidebar">
    <ul>
    <li><a href="#" onclick="carregarConteudo('blockapps')">📦 BlockApps</a></li>
    <li><a href="#" onclick="carregarConteudo('wallpaperoff')">🖼️ WallpaperOff</a></li>
    <li><a href="#" onclick="carregarConteudo('thenightisyoung')">🌙 TheNightIsYoung</a></li>
    <li><a href="#" onclick="carregarConteudo('unauthorizedstudent')">🔐 UnauthorizedStudent</a></li>
    <li><a href="#" onclick="carregarConteudo('goaway')">🔕 GoAway</a></li>
    <li><a href="#" onclick="carregarConteudo('nono')">🚫 NoNo</a></li>
    <li><a href="#" onclick="carregarConteudo('admgogle')">📧 ADMGogle</a></li>
    <li><a href="#" onclick="carregarConteudo('findwifi')">📶 FindWifi</a></li>
</ul>
    
    <a href="${pageContext.request.contextPath}/logout" class="logout-btn">🚪 Sair</a>
    
</div>

<!-- Painel Central -->
	<div class="main" id="conteudo-central">
	    <h2>Bem-vindo ao MDM Lumi!</h2>
	    <p>Você está logado como <b>SuperAdmLuminova</b>.</p>
	    
	    <div class="card">
	    <p>Teste</p>
	    <p>Este é o painel inicial do seu MDM. Em breve você verá gráficos, alertas e controles aqui.</p>
	    </div>
</div>

<script>
function carregarConteudo(pagina) {
    fetch(pagina)
        .then(res => {
            if (!res.ok) throw new Error('Erro ao carregar');
            return res.text();
        })
        .then(html => {
            const parser = new DOMParser();
            const doc = parser.parseFromString(html, 'text/html');
            const conteudo = doc.body.innerHTML;
            document.getElementById('conteudo-central').innerHTML = conteudo;
        })
        .catch(() => {
            document.getElementById('conteudo-central').innerHTML = '<p>❌ Erro ao carregar o conteúdo.</p>';
        });
}
</script>


</body>
</html>
