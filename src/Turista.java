public class Turista {
    private String Nome;
    private String cpf;

    public String viajar(){
        return "Viajando...";
    }

    //Construtor Padrão
    Turista(){

    }
    //Sobrecarga do construtor personalizado
    Turista(String _nome){
        this.Nome = _nome;
    }
    //Encapsulamento - Getters and Setters


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
