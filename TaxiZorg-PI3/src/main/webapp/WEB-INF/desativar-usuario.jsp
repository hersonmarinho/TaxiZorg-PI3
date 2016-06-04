<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="inner">
    <h2>Desativar</h2>
    <div class="split style1">
        <section>

					<form method="post" action="UsuariosDesativar">
						<div class="field half">
							<label for="taxista">Funcionarios</label>
							<jsp:useBean id="objFuncionario" class="com.mycompany.pi3_zorg.Funcionario" scope="page"> </jsp:useBean>
							<select name="funcionarios">
								<option value="">Selecione</option>
								<c:forEach items="${objFuncionario.listarFuncionarios()}" var="funcionario">
										<option value="${funcionario.getMatricula()}">${funcionario.getNome()} ${funcionario.getSobrenome()}</option>
								</c:forEach>
							</select>
						</div>
						<div class="field half">
								<input type="submit" name="button" id="cadastrar" value="Desativar" class="botao"/>
						</div>
				</form>

        </section>
    </div>
</div>
