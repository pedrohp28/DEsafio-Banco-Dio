
public abstract class Cliente implements ICliente{
    
    protected String nome;
    protected String endereco;
    protected String cep;
    protected String cidade;
    
    public Cliente(String nome){
    
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

    public String getNome() {
        return nome;
    }

    protected void dados() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Endereço: %s", this.endereco));
        System.out.println(String.format("CEP: %s", this.cep));
        System.out.println(String.format("Cidade: %s", this.cidade));
    }
}
