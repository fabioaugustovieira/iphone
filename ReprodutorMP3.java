public class ReprodutorMP3 implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa...");
    }

    public void retrocederFaixa() {
        System.out.println("Retrocedendo para a faixa anterior...");
    }
}
