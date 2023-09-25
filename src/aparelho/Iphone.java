package aparelho;

import aparelho.funcionalidades.AparelhoTelefonico;
import aparelho.funcionalidades.NavegadorInternet;
import aparelho.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }

    //funcionalidades do reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Uma música está sendo tocada no reprodutor musical do Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Uma música está sendo pausada no reprodutor musical do Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Uma música está sendo selecionada no reprodutor musical do Iphone");
    }

    //funcionalidades do aparelho telefonico

    @Override
    public void ligar() {
        System.out.println("O aparelho Iphone está realizando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("O aparelho Iphone está atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz do Iphone está sendo iniciado");
    }

    //funcionalidades do navegador de internet

    @Override
    public void exibirPagina() {
        System.out.println("Uma página está sendo exibida no navegador do Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba está sendo adicionada no navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Uma página está sendo atualizada no navegador do Iphone");
    }


}
