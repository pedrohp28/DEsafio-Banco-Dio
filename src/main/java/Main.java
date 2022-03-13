
public class Main {

    public static void main(String[] args) {
        
        Cliente pedro = new ClienteFisico("Pedro", "513.477.798-50");
        pedro.setEndereço("Av. pararelepipedo, 128");
        pedro.setCep("12344-236");
        pedro.setCidade("sfrf");
        
        Cliente empresa = new ClienteJuridico("Empresa", "12.345.678/0001-98");
        empresa.setEndereço("Av. jooj joojinho joojao, 28");
        empresa.setCep("12344-500");
        empresa.setCidade("Jublileu");
        
        Conta cc = new ContaCorrente(pedro);
        cc.depositar(100);
        
        Conta poupanca = new ContaPoupanca(empresa);
        
        cc.transferir(poupanca, 101);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        pedro.imprimirDados();
        empresa.imprimirDados();
        
    }
    
}
