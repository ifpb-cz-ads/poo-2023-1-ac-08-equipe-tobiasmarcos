
public class ContaEspecial extends Conta{
    private double limite;
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    public ContaEspecial(int numero, String nome_titular, double limite){
        super();
        this.limite = limite;
    }
    
    public boolean sacar(double valor){
        if(valor <= this.limite + getSaldo()){
            double saldo = getSaldo();
            saldo = saldo - valor;
            setSaldo(saldo);
            return true;
        }else {
            return false;
        }
    }
}
   

