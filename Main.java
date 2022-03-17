import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Harry Potter",40d,50, "J.K.Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60d, 30, "J.R.Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livros, games);

        l2.calculaImposto();
        l3.calculaImposto();

        ps4Usado.calculaImposto();
        ps4.calculaImposto();

        americanas.listaLivros();
        americanas.listaVideoGames();
        americanas.calculaPatrimonio();

    }
}
