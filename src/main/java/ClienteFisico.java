
public class ClienteFisico extends Cliente{
    
    private String cpf;
    
    public ClienteFisico(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void imprimirDados() {
        
        System.out.println("=== Dados do Cliente ===");
        super.dados();
        System.out.println(String.format("CPF: %s", this.cpf));
    }

    
    
}
