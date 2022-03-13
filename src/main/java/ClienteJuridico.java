
public class ClienteJuridico extends Cliente{
    
    private String cnpj;
    
    public ClienteJuridico(String nome,String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirDados() {
        System.out.println("=== Dados do Cliente ===");
        super.dados();
        System.out.println(String.format("CNPJ: %s", this.cnpj));
    }
    
}
