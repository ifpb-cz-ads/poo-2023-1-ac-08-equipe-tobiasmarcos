
public class ContaPoupança extends Conta{

    public ContaPoupança(int numero, String nome_titular){
        super();
    }

    public void reajustar(double percentual){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
    } 
    
    
}

