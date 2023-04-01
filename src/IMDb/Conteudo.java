package IMDb;

public class Conteudo {

    //atributos
    private String titulo;
    private String urlImagem;

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
