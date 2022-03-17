import java.util.Arrays;
import java.util.List;

public class Loja {

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {

    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros () {
        if(this.livros.isEmpty()) {
            System.out.printf("A loja %s não tem livros no seu estoque.%n", this.getNome());
        } else {
            System.out.printf("A loja %s possui estes livros para venda:%n", this.getNome());
            for (Livro libro: livros) {
                System.out.printf("Título: %s, preço: %.2f, quantidade: %d em estoque.%n", libro.getNome(), libro.getPreco(), libro.getQtd());
            }
        }
    }

    public void listaVideoGames() {

        if(this.videoGames.isEmpty()) {
            System.out.printf("A loja %s não tem video-games no seu estoque.%n", this.getNome());
        } else {
            System.out.printf("A loja %s possui estes video-games para venda:%n", this.getNome());
            for (VideoGame game: videoGames) {
                System.out.printf("Título: %s, preço: %.2f, quantidade: %d em estoque.%n", game.getNome(), game.getPreco(), game.getQtd());
            }
        }
    }

    public double calculaPatrimonio() {

        double patrimonio = 0d;

        for (Livro libro: livros) {
            patrimonio += libro.getPreco();
        }
        for (VideoGame game: videoGames) {
            patrimonio += game.getPreco();
        }
        System.out.printf("O patrimônio da loja: %s é de R$ %.2f", this.getNome(), patrimonio);
        return patrimonio;
    }
}
