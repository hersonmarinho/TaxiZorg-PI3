<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="inner">
    <h2>Relatório Gerencial</h2>
    <div class="split style1">
        <section>
            <jsp:useBean id="relatorio" class="com.mycompany.pi3_zorg.Relatorio" scope="page"></jsp:useBean>
                <div class="field half">
                    <table border="1">
                        <tr> <td><b>Funcionário</b></td> <td><b>Cliente</b></td> <td><b>Tipo</b></td> <td><b>Início</b></td> <td><b>Fim</b></td> <td><b>Status</b></td></tr>
                    <c:forEach items="${relatorio.listarRelatoriosTaxista()}" var="relatorio">
                        <tr><td>${relatorio.getNomeFuncionario()} ${relatorio.getSobrenomeFuncionario()}</td> <td>${relatorio.getNomeCliente()}</td> <td>${relatorio.getTipoViagem()}</td> <td>${relatorio.getInicioViagem()}</td> <td>${relatorio.getFimViagem()}</td> <td>${relatorio.getStatusViagem()}</td></tr>
                    </c:forEach>
                </table>
            </div>
        </section>
    </div>
</div>