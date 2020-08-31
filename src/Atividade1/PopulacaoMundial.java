package Atividade1;

public class PopulacaoMundial {
    public static void main(String[] args) {

        int anos = 2;
        long populacaoMundial = 7807229720L;
        double percentual = 1.05;

        double divisao = percentual/100;

        double total = divisao * populacaoMundial;

        double estimativa = total * anos;

        System.out.println(estimativa);

    }
}
