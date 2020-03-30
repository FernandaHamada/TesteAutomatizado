package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteWebPage {

    public DeleteWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@class='collapsible-header ']")
    private WebElement linkFormularios;

    @FindBy(xpath = "//a[@href='/users']")
    private WebElement linkListaUsuarios;

    @FindBy(xpath = "/html/body/div[3]/div/table/tbody/tr[1]/td[11]/a")
    private WebElement linkIconDelete;

    @FindBy(xpath = "//a[@data-confirm='Vocee está certo disso?']")
    private WebElement linkBuscarNomeDeletar;

    @FindBy(xpath = "//a[contains(text(),'Próximo')]")
    private WebElement btnProximaPagina;

    @FindBy(id="notice")
    private WebElement lblMensagemDelete;

    public WebElement getLinkFormularios() {
        return linkFormularios;
    }

    public WebElement getLinkListaUsuarios(){ return linkListaUsuarios;}

    public WebElement getLinkIconDelete(){return  linkIconDelete;}

    public WebElement getLinkBuscarNomeDeletar(){return linkBuscarNomeDeletar;}

    public WebElement getBtnProximaPagina(){return  btnProximaPagina;}

    public WebElement getLblMensagemDelete(){return  lblMensagemDelete;}
}
