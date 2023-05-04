public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Modelo 1", 1500.00);
        Computador computador = new Computador("Modelo 2", 2500.00, 8, "Intel Core i5");

        System.out.println("Equipamento:");
        System.out.println("Modelo: " + equipamento.getModelo());
        System.out.println("Preço: R$ " + equipamento.getPreco());

        System.out.println("\nComputador:");
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Preço: R$ " + computador.getPreco());
        System.out.println("Memória: " + computador.getMemoria() + " GB");
        System.out.println("Processador: " + computador.getProcessador());
    }
}
