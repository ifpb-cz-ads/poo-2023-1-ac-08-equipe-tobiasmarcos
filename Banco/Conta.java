
public class Conta
{
    private int numero;
    private String nome_titular;
    private double saldo;
    
    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }
    
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public String getNome_titular(){
        return nome_titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNome_titular(String nome_titular){
        this.nome_titular = nome_titular;
    }

}
