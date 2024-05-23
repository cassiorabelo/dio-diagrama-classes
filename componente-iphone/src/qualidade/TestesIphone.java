package qualidade;

import dispositivos.Iphone;

public class TestesIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("\nTESTES DE REPRODUTOR MUSICAL DO MEU IPHONE:");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Angra - Tide of Changes");

        System.out.println("\nTESTES DE APARELHO TELEFONICO DO MEU IPHONE:");
        meuIphone.ligar("123321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\nTESTES DE NAVEGADOR NA INTERNET DO MEU IPHONE:");
        meuIphone.exibirPagina("https://github.com/cassiorabelo");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
