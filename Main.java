public class Main extends Cliente {
   
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();
        CaixaEletronico caixa = new CaixaEletronico();

        cliente1.dNome("Sonali");
        cliente1.dSobrenome("Dias");
        cliente1.dSaldo(7000);
        cliente1.dLimite(1000);

        limpador();
        caixa.menuPrincipal();

}

}

