<%--
    Document   : cadastro-usuario
    Created on : 20/05/2016, 02:21:08
    Author     : Fabricio
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="inner">
    <h2>Cadastrar Usuário</h2>
    <p>Inclua um usuário no sistema.</p>
    <div class="split style1">
        <section>
            <form method="post" action="Cadastrar/Usuario">
                <input type="hidden" id="matricula" name="matricula" />
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
                    <input type="password" name="senha" id="password" />
                </div>

                <jsp:useBean id="objAcesso" class="com.mycompany.pi3_zorg.Acesso"></jsp:useBean>
                    <div class="field half">
                        <label for="acesso">Tipo de Acesso</label>
                        <select name="acesso" id="acesso">
                            <option>Selecione</option>
                        <c:forEach items="${objAcesso.listarAcessos()}" var="acesso">
                            <option value="${acesso.getIdAcesso()}">${acesso.getTipoAcesso()}</option>
                        </c:forEach>
                    </select>
                </div>

                <jsp:useBean id="objUnidade" class="com.mycompany.pi3_zorg.Unidade" scope="page"> </jsp:useBean>
                    <div class="field half">
                        <label for="taxista">Unidade</label>
                        <select name="unidade">
                            <option value="">Selecione</option>
                        <c:forEach items="${objUnidade.listarUnidades()}" var="unidade">
                            <option value="${unidade.getCodUnidade()}">${unidade.getCidade()} - ${unidade.getUf()}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="field half">
                    <input type="submit" name="button" id="cadastrar" value="Cadastrar" class="botao"/>
                </div>

            </form>
        </section>
    </div>
</div>