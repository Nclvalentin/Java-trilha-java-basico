import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while( mesada > 0 ){
            double valorDoce = valorAleatorio();
            if (valorDoce> mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor "+ valorDoce + "Adcionado ao carrinho");
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Mesada = R$" + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);

    }
    
}
