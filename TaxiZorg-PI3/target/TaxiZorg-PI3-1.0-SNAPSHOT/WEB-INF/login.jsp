<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Login - TaxiZorg</title>
        <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>
        <link rel="stylesheet" href="resources/css/login.css">
    </head>
    <body>
        <form action="Login" method="post">
            <div class="login">
                <div class="login_title">
                    <span>Entre com sua conta</span>
                </div>
                <div class="login_fields">
                    <div class="login_fields__user">
                        <div class="icon">
                            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/user_icon_copy.png"/>
                        </div>
                        <input placeholder="Usuario" type="text" name="usuario">
                        <div class="validation">
                            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/tick.png"/>
                        </div>
                        </input>
                    </div>
                    <div class="login_fields__password">
                        <div class="icon">
                            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/lock_icon_copy.png"/>
                        </div>
                        <input placeholder="Senha" type="password" name="senha"></input>
                        <div class="validation">
                            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/tick.png"/>
                        </div>
                    </div>
                    <div class="login_fields__submit">
                        <input type="submit" value="Log In"></input>
                        
                    </div>
                </div>
                <div class="success">
                    <h2>Authentication Success</h2>
                    <p>Welcome back</p>
                </div>
                <div class="disclaimer">
                    <p>Entre na Taxi Zorg conosco</p>
                </div>
            </div>
        </form>
        <div class="authent">
            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/puff.svg"/>
            <p>Authenticating...</p>
        </div>

        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
        <script src="resources/js/login.js"></script>
    </body>
</html>
