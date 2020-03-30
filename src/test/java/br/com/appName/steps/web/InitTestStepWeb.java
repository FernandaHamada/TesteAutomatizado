package br.com.appName.steps.web;

import br.com.application.name.commons.funcionalidade.ParametrosEvidenciaFuncionalidade;
import br.com.application.name.mobile.funcionalidade.HomeFuncionalidade;
import br.com.application.name.web.funcionalidade.DeletarUsuarioWebFuncionalidade;
import br.com.application.name.web.funcionalidade.HomeNewFuncionalidade;
import br.com.application.name.web.funcionalidade.ListaUsuarioWebFuncionalidade;
import br.com.application.name.web.funcionalidade.LoginFuncionalidade;
import br.com.application.name.web.pages.DeleteWebPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;

public class InitTestStepWeb {

    private ParametrosEvidenciaFuncionalidade realizandoTesteFuncionalidade;
    private HomeNewFuncionalidade homeNewFuncionalidade;
    private DeletarUsuarioWebFuncionalidade deletarUsuarioWebFuncionalidade;
    private ListaUsuarioWebFuncionalidade listaUsuarioWebFuncionalidade;

    public InitTestStepWeb() {
        this.realizandoTesteFuncionalidade = new ParametrosEvidenciaFuncionalidade();
        this.homeNewFuncionalidade =new HomeNewFuncionalidade();
        this.deletarUsuarioWebFuncionalidade = new DeletarUsuarioWebFuncionalidade();
        this.listaUsuarioWebFuncionalidade = new ListaUsuarioWebFuncionalidade();
    }

    @E("^estou realizando o teste$")
    public void estouRealizandoOTeste(DataTable params) {

        System.out.println("Definindo os parametros da evidencia . . .");
        this.realizandoTesteFuncionalidade.executandoTeste(params);
        System.out.println("Parâmetros de evidência ok");
    }

    @Dado("^que acesso a pagina de criação do usuário$")
    public void queAcessoAPaginaDoSite() {
        this.homeNewFuncionalidade.acessaCriarUsuarios();
    }

    @Dado("^que acesso a pagina de lista de usuários$")
    public void queAcessoAListaDeUsuario(){
        this.listaUsuarioWebFuncionalidade.acessarListaDeUsuarios();
    }

    @E("^busco pelo nome a ser deletado$")
    public void buscaPeloNomeDeletar() throws InterruptedException {
        this.deletarUsuarioWebFuncionalidade.acessarNomeDoUsuario();
    }


}
