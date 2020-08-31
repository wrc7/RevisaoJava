package Atividade2;

public class Calculadora {
    public static void main(String[] args) {
        double num1 = 1;
        double num2 = 2;

        double soma = num1 + num2;
        double produto = num1 * num2;
        double diferenca = num1 - num2;
        double divisao = num1 / num2;

        System.out.println("SOMA: " + soma);
        System.out.println("PRODUTO: " + produto);
        System.out.println("DIFERNÇA: " + diferenca);
        System.out.println("DIVISÃO: " + divisao);

        if(num1 > num2){
            System.out.println(num1 + " é maior");
        }else{
            System.out.println(num2 + " é maoir");
        }
    }
}
