public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde){
        if(qtde < qtdMinima){
            qtdAtual -=qtde;
        }
        else{
            System.out.println("O estoque não pode ficar negativo");
        }
    }
    public String mostra(){
        return "Nome do produto: "+ getNome() + "\nQtd minima: " + getQtdMinima() + "\nQtd atual: " +  getQtdAtual();

    }
    boolean precisaRepor(){
        if(qtdAtual<=qtdMinima)
            return true;
        else
            return false;

    }
}

