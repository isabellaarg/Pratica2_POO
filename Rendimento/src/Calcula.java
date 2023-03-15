public class Calcula {
    private double invInicial;
    private double taxaDoInvestimento;
    private int nroDeMeses;

    public Calcula(double invInicial, double taxaDoInvestimento, int nroDeMeses) {
        this.invInicial = invInicial;
        this.taxaDoInvestimento = taxaDoInvestimento;
        this.nroDeMeses = nroDeMeses;
    }


    public double calcularEMostrar() {
        invInicial = invInicial + ((invInicial * taxaDoInvestimento) / 100);
        return invInicial;
    }
}

