package IMDb;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Olá mundo!");
        // fazer uma conexao http e pegar os dados do imdb


        // pegar somente dos dados que interessam(titulo,imagem,nota)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeConteudo = parser.parse(body);
        System.out.println(listaDeConteudo.size());
        System.out.println(listaDeConteudo.get(0));


        // exibir e manipular os dados

        for (Map<String, String> conteudo : listaDeConteudo) {

            String urlImagem = conteudo.get("image");
            String titulo = conteudo.get("title");

            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = titulo + ".png";


            GeradorDeFigurinhas geradora = new GeradorDeFigurinhas();
            geradora.cria(inputStream, nomeArquivo);

            System.out.println("Titulo: " + conteudo.get("title"));
            //System.out.println("imagem -> " + filme.get("image"));
            //System.out.println("Nota: " + filme.get("imDbRating"));
            System.out.println();
        }

    }

}
