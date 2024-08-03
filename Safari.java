public class Safari implements NavegadorInternet {
    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página web: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando página web.");
    }

    public void buscar(String termo) {
        System.out.println("Buscando por: " + termo);
    }

    public void favoritarPagina(String url) {
        System.out.println("Página " + url + " favoritada.");
    }
}
