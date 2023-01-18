public class CaixaEletronico extends Main{

    int opcao;
    double valorDeSaque;
    double valorTaxado;
    double novoSaldo;


    public void menuPrincipal(){
        println("Olá " + nome + " " + sobrenome + ". Digite a opção que deseja selecionar:");
        println("1 - Verifique seus dados");
        println("2 - Realizar saque");
        println("3 - Realizar depósito");
        int opcao = sc.nextInt();

        if (opcao == 1){
        limpador();
        dados();
        }
        else if (opcao == 2){
        limpador();
        realizarSaque();
        }
        else if (opcao == 3){
        limpador();
        realizarDeposito();
        }
    }
    
    public void dados(){
        println(this.nome + " " + this.sobrenome);
        println("Seu saldo é " + this.saldo);
        println("Seu limite é " + this.limite);
        menuPrincipal();
    }

    public void realizarSaque(){
        println("ATENÇÃO! É retirado 5% de taxa do seu valor a ser sacado.");
        println("Quanto deseja retirar?");
        valorDeSaque = sc.nextDouble();

        if (valorDeSaque < this.limite){
            valorTaxado = valorDeSaque * 0.05;
            novoSaldo = this.saldo - valorTaxado;
            println("Seu valor sacado foi de " + valorDeSaque);
            println("Foi retirado do seu saldo " + valorTaxado + ". Seu saldo agora é " + novoSaldo);
            novoSaldo = this.saldo;
            menuPrincipal();
        }
        else if (valorDeSaque > this.limite){
            println("Não foi possível realizar seu saque. Retornando ao menu principal.");
            menuPrincipal();
        }
    }

    public void realizarDeposito(){
        println("Digite o valor que deseja depositar:");
        double deposito = sc.nextDouble();
        novoSaldo = this.saldo + deposito;
        println("Você depositou " + deposito + ". Seu saldo agora é " + novoSaldo);
        novoSaldo = this.saldo;
        println("Retornando ao menu principal.");
        menuPrincipal();
    }

}
