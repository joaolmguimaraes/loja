public class VideoGame extends Produto implements Imposto {

    private String marca;
    private String modelo;
    boolean isUsado;

    public VideoGame() {

    }

    public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0d;

        if(this.isUsado()) {
            imposto = this.getPreco() * 0.25;
            System.out.printf("Imposto %s usado: R$ %.2f.%n", this.getNome(), imposto);
        } else {
            imposto = this.getPreco() * 0.45;
            System.out.printf("Imposto %s: R$ %.2f.%n", this.getNome(), imposto);
        }
        return imposto;
    }
}
