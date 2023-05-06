public class Computador extends Equipamento {
    private int memoria;
    private String processador;

    public Computador(String modelo, double preco, int memoria, String processador) {
        super(modelo, preco);
        this.memoria = memoria;
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}