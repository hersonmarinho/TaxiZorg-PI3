<%--
    Document   : cadastro-usuario
    Created on : 20/05/2016, 02:21:08
    Author     : Fabricio
--%>
<div class="inner">
    <h2>Cadastrar</h2>
    <p>Inclua um usu�rio no sistema.</p>
    <div class="split style1">
        <section>
            <form method="post" action="Cadastrar/Usuario">
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
                        <option value="1">SP - S�o Paulo</option>
                        <option value="2">MG - Belo Horizonte</option>
                        <option vale="3">BH - Vit�ria</option>
                        <option value="4">RJ - Rio de Janeiro</option>
                        <option value="5">MA - Maranh�o</option>
                    </select>
                </div>
                <div class="field half">
                    <input type="submit" name="button" id="cadastrar" value="Cadastrar" class="botao"/>
                </div>

            </form>
        </section>
    </div>
</div>
