<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="inner">
    <h2>Criar Viagem</h2>
    <p>Inclua uma nova viagem no sistema.</p>
    <div class="split style1">
        <section>
            <form method="post" action="Cadastrar/Viagem">
                <!-- Dados do endereço de partida -->
                <h3>Endereço partida</h3>
                <hr/>
                <div class="field half first">
                    <label for="ceppartida">CEP</label>
                    <input type="text" name="ceppartida" id="cep-partida" />
                </div>
                <div class="field half first">
                    <label for="logpartida">Logradouro</label>
                    <input type="text" name="logpartida" id="log-partida" />
                </div>
                <div class="field half first">
                    <label for="numpartida">Numero</label>
                    <input type="text" name="numpartida" id="num-partida" />
                </div>
                <!-- Dados do endereço de destino -->
                <h3>Endereço destino</h3>
                <hr/>
                <div class="field half first">
                    <label for="cepdestino">CEP</label>
                    <input type="text" name="cepdestino" id="cep-destino" />
                </div>
                <div class="field half">
                    <label for="logdestino">Logradouro</label>
                    <input type="text" name="logdestino" id="log-destino" />
                </div>
                <div class="field half">
                    <label for="numdestino">Numero</label>
                    <input type="text" name="numdestino" id="num-destino" />
                </div>

                <!-- Dados do cliente -->
                <h3>Dados do Cliente</h3>
                <hr/>
                <div class="field half">
                    <label for="cliente">Nome do cliente</label>
                    <input type="text" name="cliente" id="cliente" />
                </div>

                <!-- Taxista -->
                <h3>Taxista</h3>
                <hr/>
                <jsp:useBean id="objTaxista" class="com.mycompany.pi3_zorg.Taxista" scope="page"> </jsp:useBean>
                    <div class="field half">
                        <label for="taxista">Taxista</label>
                        <select name="taxista">
                            <option value="">Selecione</option>
                        <c:forEach items="${objTaxista.listarDisponiveis()}" var="taxi">
                            <option value="${taxi.getMatricula()}">${taxi.getNome()} ${taxi.getSobrenome()}</option>
                        </c:forEach>
                    </select>
                </div>

                <!-- Tipo Viagem -->
                <div class="field half">
                    <label for="viagem">Tipo de Viagem</label>
                    <select name="viagem" id="viagem">
                        <option>Selecione</option>
                        <option value="Comum">Comum</option>
                        <option value="Diario">Diário</option>
                        <option vale="Viagem">Viagem</option>
                    </select>
                </div>

                <div class="field half">
                    <input type="submit" name="button" id="cadastrar" value="Cadastrar" class="botao"/>
                </div>
            </form>
        </section>
    </div>
</div>