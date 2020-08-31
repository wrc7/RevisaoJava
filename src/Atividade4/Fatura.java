package Atividade4;

public class Fatura {
    public String codigo;
    public String descricao;
    public int    quantidade;
    public double preco;

    public Fatura(String c, String d, int q, double p){
        codigo     = c;
        descricao  = d;
        quantidade = q;
        preco      = p;
    }

    public void totalFatura(){
       double total = quantidade * preco;
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Fatura fat1 = new Fatura("C001", "Lápis", 5, 4.5 );
        System.out.println("Código: " + fat1.codigo);
        System.out.println("Descrição: " + fat1.descricao);

        fat1.totalFatura();
    }
}
