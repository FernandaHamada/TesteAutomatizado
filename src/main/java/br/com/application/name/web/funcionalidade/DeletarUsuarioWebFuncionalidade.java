package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import br.com.application.name.web.pages.DeleteWebPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeletarUsuarioWebFuncionalidade extends BaseTest {


    private DeleteWebPage deleteWebPage;
    public DeletarUsuarioWebFuncionalidade() {
        this.deleteWebPage = new DeleteWebPage(webDriver);
    }

    public void acessarNomeDoUsuario() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(this.deleteWebPage.getLinkIconDelete()));
        this.deleteWebPage.getLinkBuscarNomeDeletar().click();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        wait.until(ExpectedConditions.visibilityOf(this.deleteWebPage.getLblMensagemDelete()));
    }


    public String retornaMensagem(){
        wait.until(ExpectedConditions.visibilityOf(this.deleteWebPage.getLblMensagemDelete()));
        return this.deleteWebPage.getLblMensagemDelete().getText();
    }

}
