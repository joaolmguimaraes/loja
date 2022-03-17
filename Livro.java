public class Livro extends Produto implements Imposto {

    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {

    }

    public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }
    @Override
    public double calculaImposto() {
        double imposto = 0d;
        if(this.getTema() == "educativo") {
            System.out.printf("Livro educativo não tem imposto: %s%n", this.getNome());
        }
        else {
            imposto = this.getPreco() * 0.1;
            System.out.printf("R$ %.2f de impostos sobre o livro %s.%n", imposto, this.getNome());
        }
        return imposto;
    }
}
