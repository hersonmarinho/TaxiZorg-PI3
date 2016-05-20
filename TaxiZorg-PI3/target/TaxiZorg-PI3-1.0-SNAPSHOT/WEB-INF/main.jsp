<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<!--
        Hyperspace by HTML5 UP
        html5up.net | @n33co
        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
    <head>
        <title>Inicio</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="resources/assets/css/main.css" />
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    </head>
    <body>

        <!-- Sidebar -->
        <section id="sidebar">
            <div class="inner">
                <nav>
                    <ul>
                        <li><a href="#intro">Bem-Vindo</a></li>
                        <li><a href="#two">Crie uma viagem</a></li>
                        <li><a href="#three">Cadastre um Usuario</a></li>
                        <li><a href="LogoutServlet">Logout</a></li>
                    </ul>
                </nav>
            </div>
        </section>

        <!-- Wrapper -->
        <div id="wrapper">

            <!-- Intro -->
            <section id="intro" class="wrapper style1 fullscreen fade-up">
                <div class="inner">
                    <h1>Taxi Zorg</h1>
                    <p>Conte conosco para fazer sua viagem sem se preocupar em dirigir.<br />
                </div>
            </section>
            <!-- Two - Cadastro de viagem -->     
            <section id="two" class="wrapper style1 fade-up">
                <jsp:include page="viagem.jsp" />
            </section>
            
            <!-- Three -->
            <section id="three" class="wrapper style1 fade-up">
                <jsp:include page="cadastro-usuario.jsp" />
            </section>

        </div>

        <!-- Footer -->
        <footer id="footer" class="wrapper style1-alt">
            <div class="inner">
                <ul class="menu">
                    <li>Todos os direitos são reservados pela Taxi Zorg.</li>
                </ul>
            </div>
        </footer>

        <!-- Scripts -->
        <script src="resources/assets/js/jquery.min.js"></script>
        <script src="resources/assets/js/jquery.scrollex.min.js"></script>
        <script src="resources/assets/js/jquery.scrolly.min.js"></script>
        <script src="resources/assets/js/skel.min.js"></script>
        <script src="resources/assets/js/util.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="resources/assets/js/main.js"></script>

    </body>
</html>

