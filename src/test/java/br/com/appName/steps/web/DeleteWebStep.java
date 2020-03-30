package br.com.appName.steps.web;


import br.com.application.name.web.funcionalidade.DadosWebFuncionalidade;
import br.com.application.name.web.funcionalidade.DeletarUsuarioWebFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DeleteWebStep {

    private DeletarUsuarioWebFuncionalidade deletarUsuarioWebFuncionalidade;

    public DeleteWebStep(){
        this.deletarUsuarioWebFuncionalidade = new DeletarUsuarioWebFuncionalidade();
    }

    @Entao("^visualizo a mensagem de delete \"([^\"]*)\"$")
    public void visualizoAMensagemDeDelete(String mensagemDelete){
        Assert.assertEquals("Seu Usuário foi removido com sucesso!", this.deletarUsuarioWebFuncionalidade.retornaMensagem());

    }


}