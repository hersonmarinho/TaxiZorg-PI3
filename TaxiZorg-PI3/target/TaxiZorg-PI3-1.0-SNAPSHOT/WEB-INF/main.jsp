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
                        <li><a href="ViagemServlet">Crie uma viagem</a></li>
                        <li><a href="#three">Cadastre um Usuario</a></li>
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

            <!-- Two -->
            <section id="two" class="wrapper style1 fade-up">
                <div class="inner">
                    <h2>Criar</h2>
                    <p>Inclua uma nova viagem no sistema.</p>
                    <div class="split style1">
                        <section>
                            <form method="post" action="MainServlet">
                                <div class="field half first">
                                    <label for="name">Nome</label>
                                    <input type="text" name="nome" id="name" />
                                </div>
                                <div class="field half">
                                    <label for="sobrenome">Sobrenome</label>
                                    <input type="text" name="sobrenome" id="lastName" />
                                </div>
                                <div class="field half">
                                    <label for="telefone">Telefone</label>
                                    <input type="text" name="telefone" id="tell" />
                                </div>
                                <div class="field half">
                                    <label for="user">Usuario</label>
                                    <input type="text" name="usuario" id="user" />
                                </div>
                                <div class="field half">
                                    <label for="senha">Senha</label>
                                    <input type="password" name="senha" id="password" />
                                </div>
                                
                               <div class="field half">
                                    <input type="submit" name="button" id="cadastrar" value="Cadastrar" class="botao"/>
                                </div>
                            </form>
                        </section>
                    </div>
                </div>
            </section

            <!-- Three -->
            <section id="three" class="wrapper style1 fade-up">
                <div class="inner">
                    <h2>Cadastrar</h2>
                    <p>Inclua um usuário no sistema.</p>
                    <div class="split style1">
                        <section>
                            <form method="post" action="MainServlet">
                                <div class="field half first">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" id="name" />
                                </div>
                                <div class="field half">
                                    <label for="sobrenome">Sobrenome</label>
                                    <input type="text" name="sobrenome" id="lastName" />
                                </div>
                                <div class="field half">
                                    <label for="telefone">Telefone</label>
                                    <input type="text" name="telefone" id="tell" />
                                </div>
                                <div class="field half">
                                    <label for="usuario">Usuario</label>
                                    <input type="text" name="usuario" id="user" />
                                </div>
                                <div class="field half">
                                    <label for="senha">Senha</label>
                                    <input type="text" name="senha" id="password" />
                                </div>
                                <div class="field half">
                                    <label for="acesso">Tipo de Acesso</label>
                                    <select name="acesso" id="acesso">
                                        <option>Selecione</option>
                                        <option value="1">Taxista</option>
                                        <option value="2">Operador</option>
                                        <option vale="4">Gerente</option>
                                        <option value="3">CEO</option>
                                    </select>
                                </div>
                                <div class="field half">
                                    <label for="unidade">Unidade</label>
                                    <select name="unidade" id="unidade">
                                        <option>Selecione</option>
                                        <option value="1">SP - São Paulo</option>
                                        <option value="2">MG - Belo Horizonte</option>
                                        <option vale="3">BH - Vitória</option>
                                        <option value="4">RJ - Rio de Janeiro</option>
                                        <option value="5">MA - Maranhão</option>
                                    </select>
                                </div>
                                <div class="field half">
                                    <input type="submit" name="button" id="cadastrar" value="Cadastrar" class="botao"/>
                                </div>
                                
                            </form>
                        </section>
                    </div>
                </div>
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

