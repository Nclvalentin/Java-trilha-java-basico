import java.util.Date;

public class Operadores{
    public static void main(String[] args) throws Exception {
        //Atribuição << = >>
        String nome = "Nathan";
        int idade = 22;
        double peso = 68.5;
        char sexo ='M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Aritméticos 
        double soma =10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //Unários
        int numero;
        numero = 3;
        numero++;
        numero--;

        //ternario
        int numero1, numero2;
        numero1 = 2;
        numero2 = 3;
        String maior = ( numero1> numero2)?"verdadeiro":"falso";


        //relacionais 
        if(numero1 == numero2)

        if (numero1 != numero2)
        
        if (numero1 > numero2)

        if (numero1 < numero2)

        if (numero1 >= numero2)
           
        if (numero1 <= numero2)
        System.out.print(maior);

        //Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.print("Todas são verdadeiras");
        } else if (condicao1 || condicao2) {
            System.out.print("Uma das duas é verdadeira");
        } else {
            System.err.print("Todas são falsas");
        }

    }
}
