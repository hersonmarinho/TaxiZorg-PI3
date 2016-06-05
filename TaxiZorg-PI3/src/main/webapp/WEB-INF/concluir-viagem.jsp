<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="inner">
    <h2>Concluir Viagem</h2>
    <div class="split style1">
        <section>

        <form method="post" action="/Concluir/Viagem">
            <div class="field half">
                <label for="taxista"></label>
                <jsp:useBean id="objViagem" class="com.mycompany.pi3_zorg.Viagem" scope="page"> </jsp:useBean>
                <select name="viagem">
                    <option value="">Selecione</option>
                    <c:forEach items="${objViagem.listarViagens()}" var="viagem">
                        <option value="${viagem.getCodViagem()}">${viagem.nomeCliente()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="field half">
                <input type="submit" name="button" id="cadastrar" value="Concluir" class="botao"/>
            </div>
        </form>

        </section>
    </div>
</div>
