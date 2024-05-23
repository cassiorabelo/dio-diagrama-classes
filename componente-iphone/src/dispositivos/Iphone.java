package dispositivos;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    public void tocar() {

        System.out.println("iPhone: tocando musica");
    }

    public void pausar() {
        System.out.println("iPhone: musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("iPhone: musica '" + musica + "' selecionada");
    }

    public void ligar(String numero) {
        System.out.println("iPhone: ligando para " + numero);
    }

    public void atender() {
        System.out.println("iPhone: ligacao atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("iPhone: correio de voz iniciado");
    }

    public void exibirPagina(String url) {
        System.out.println("iPhone: pagina localizada em " + url + " exibida");
    }

    public void adicionarNovaAba() {
        System.out.println("iPhone: nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("iPhone: pagina atualizada");
    }
}
