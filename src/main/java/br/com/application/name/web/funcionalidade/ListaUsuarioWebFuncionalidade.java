package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.DeleteWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ListaUsuarioWebFuncionalidade extends BaseTest {

    private DeleteWebPage deleteWebPage;
    public ListaUsuarioWebFuncionalidade() {
        this.deleteWebPage = new DeleteWebPage(webDriver);
    }

    public void acessarListaDeUsuarios(){
        this.deleteWebPage.getLinkFormularios().click();
        wait.until(ExpectedConditions.elementToBeClickable(this.deleteWebPage.getLinkListaUsuarios()));
        this.deleteWebPage.getLinkListaUsuarios().click();
    }
}
