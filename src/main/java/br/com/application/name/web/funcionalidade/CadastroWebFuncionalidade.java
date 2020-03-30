package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CadastroWebFuncionalidade extends BaseTest {

    private CadastroWebPage cadastroWebPage;
    public static String name = "";
    private  static String email = "";
    private Random random;

    public CadastroWebFuncionalidade() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void preencheFormulario(){
        this.random = new Random();
        int number = random.nextInt() * 1000;
        setName("Bianca" + number);
        setEmail("teste@teste.cm.br" + number);

        wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getInputNome()));
        this.cadastroWebPage.getInputNome().sendKeys(getName());
        this.cadastroWebPage.getInputSobrenome().sendKeys("nBarbosa");
        this.cadastroWebPage.getInputEmail().sendKeys(getEmail());
        this.cadastroWebPage.getBtnCriar().click();
    }


    public static String getName(){return name;}
    public static void setName(String name){CadastroWebFuncionalidade.name = name;}
    public static String getEmail(){return email;}
    public static  void setEmail(String email){CadastroWebFuncionalidade.email = email;}
}
