import java.util.Scanner;
import java.util.ArrayList; 

public class Banco
{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Conta> contas = new ArrayList<Conta>();
    int k;
    do{
        System.out.println("Para criar conta - 1");
        System.out.println("Para checar saldo em conta ja criada - 2");
        System.out.println("Para efetuar saque em conta já criada - 3");
        System.out.println("Para efetuar depósito em conta já criada - 4");
        System.out.println("Para encerrar o programa - 5");
        int l = 0;
        k = scan.nextInt();
        while(k < 5){ 

            if(k == 1){
                System.out.println("Qual tipo de conta deve ser criada?");
                System.out.println("Para conta normal - 1");
                System.out.println("Para conta especial - 2");
                System.out.println("Para conta poupança - 3");
                System.out.println("Para sair da criação de conta - 4");
                l = scan.nextInt();
                    if(l == 1){
                        Conta novaConta = new Conta();
                        System.out.println("Insira o nome do titular:");
                        novaConta.setNome_titular(scan.next());
                        novaConta.setNumero(contas.size()+1);
                        System.out.println("Insira o saldo inicial da conta:");
                        novaConta.setSaldo(scan.nextInt());
                        System.out.println("O numero da conta é :");
                        System.out.println(novaConta.getNumero());
                        contas.add(novaConta);
                        k = 0;
                    }
                    if(l == 2){
                        ContaEspecial novaConta;
                        System.out.println("Insira o nome do titular:");
                        String nomeTitular = scan.next();
                        int numConta = contas.size()+1;
                        System.out.println(numConta);
                        System.out.println("Insira o limite da conta:");
                        Double limite = scan.nextDouble();                       
                        novaConta = new ContaEspecial(numConta, nomeTitular, limite);
                        novaConta.setNumero(numConta);
                        System.out.println("O numero da conta é:");
                        System.out.println(novaConta.getNumero());
                        System.out.println("Insira o saldo inicial da conta:");
                        novaConta.setSaldo(scan.nextDouble());
                        contas.add(novaConta);
                        k = 0;
                    }
                    if(l == 3){
                        ContaPoupança novaConta;
                        System.out.println("Insira o nome do titular:");
                        String nomeTitular = scan.next();
                        int numConta = contas.size()+1;
                        novaConta = new ContaPoupança(numConta, nomeTitular);
                        novaConta.setNumero(numConta);
                        System.out.println("O numero da conta é:");
                        System.out.println(novaConta.getNumero());
                        System.out.println("Insira o saldo inicial da conta:");
                        novaConta.setSaldo(scan.nextDouble());
                        contas.add(novaConta);
                        k = 0;
                    }
                    k = 0;       
            }
            if(k == 2){
                System.out.println("Qual número da sua conta?");
                int num = scan.nextInt();
                num = num - 1;
                System.out.println("O saldo atual da conta é:");
                System.out.println(contas.get(num).getSaldo());
                k = 0;
            }
            if(k == 3){
                System.out.println("Qual número da sua conta?");
                int num = scan.nextInt();
                num = num - 1;
                System.out.println("Qual valor será sacado?:");
                Double valor = scan.nextDouble();
                
                    if(contas.get(num).sacar(valor) == true){
                        
                        System.out.println("Saque efetuado com sucesso");                        
                    }
                    else{
                        System.out.println("Saque não efetuado");
                    }
                k = 0;
            }
            if(k == 4){
                System.out.println("Qual número da sua conta?");
                int num = scan.nextInt();
                num = num - 1;
                System.out.println("Qual valor será depositado?:");
                Double valor = scan.nextDouble();
                contas.get(num).depositar(valor);
                System.out.println(contas.get(num).getSaldo());
                k = 0;
            }
        
            System.out.println("Para criar conta - 1");
            System.out.println("Para checar saldo em conta já criada - 2");
            System.out.println("Para efetuar saque em conta já criada - 3");
            System.out.println("Para efetuar depósito em conta já criada - 4");
            System.out.println("Para encerrar o programa - 5");
            k = scan.nextInt();
        }
    }while(k < 5);

    scan.close();
    }
    
}