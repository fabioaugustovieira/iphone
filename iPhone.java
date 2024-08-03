public class iPhone implements DispositivoEletronico {
    private String modelo;
    private String cor;

    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public void fazerLigacao(String numero) {
        // Implementação para fazer uma ligação
        System.out.println("Ligando para " + numero + "...");
    }

    public void enviarMensagem(String mensagem, String numero) {
        // Implementação para enviar uma mensagem
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("iPhone desligado.");
    }
}
