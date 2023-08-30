public class Main {
    public static void main(String[] args) {
        //Classe Objeto   Construtor
       Turista mochileiro = new Turista();
//Definir formato do objeto
        mochileiro.setNome("otta");

        mochileiro.setCpf(Validacao.cpf("43213"));

        Turista mochileira = new Turista("Dona maria");
        //definir comportamento

        String retorno = mochileira.viajar();
        System.out.println(retorno);


    }
}