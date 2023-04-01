package IMDb;

public class Conteudo {

    //atributos
    private final String titulo;
    private final String urlImagem;

    //Construtor
    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    //get
    public String getTitulo() {
        return titulo;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

}
