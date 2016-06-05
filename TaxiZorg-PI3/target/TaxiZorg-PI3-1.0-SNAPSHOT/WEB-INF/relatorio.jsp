<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="inner">
    <h2>Relatório</h2>
    <div class="split style1">
        <section>
            <form method="post" action="RelatorioServlet">
                <jsp:useBean id="objTaxista" class="com.mycompany.pi3_zorg.Taxista" scope="page"> </jsp:useBean>
                    <div class="field half">
                        <label for="taxista">Taxista</label>
                        <select name="taxista">
                            <option value="">Selecione</option>
                        <c:forEach items="${objTaxista.listarTodosDisponiveis()}" var="taxi">
                            <option value="${taxi.getMatricula()}">${taxi.getNome()} ${taxi.getSobrenome()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="field half">
                    <input type="submit" name="button" id="cadastrar" value="Mostrar Dados" class="botao"/>
                </div>
                <jsp:useBean id="relatorio" class="com.mycompany.pi3_zorg.Relatorio" scope="page"></jsp:useBean>
                    <div class="field half">
                        <table border="1">
                            <tr><td>Funcioario</td><td>Cliente</td><td>Tipo Viagem</td><td>Status</td></tr>
                        <c:forEach items="${relatorio.listarRelatoriosTaxista()}" var="relatorio">
                            <tr><td>${relatorio.getNomeFuncionario()} ${relatorio.getSobrenomeFuncionario()}</td> <td>${relatorio.getNomeCliente()}</td> <td>${relatorio.getTipoViagem()}</td> <td>${relatorio.getStatusViagem()}</td></tr>
                        </c:forEach>
                    </table>
                </div>
            </form>
        </section>
    </div>
</div>