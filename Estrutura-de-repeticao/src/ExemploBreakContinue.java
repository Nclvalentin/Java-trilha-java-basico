public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3)
                break;
                //continue;
            System.out.println(numero);
        }
    }
    //o for  com break vai do 1 ao 2 e a condição for se encerra
    //ja o continue irá seguir até o 3, quando o numero for igual a 3 ele ira pular para o 4 antes de imprimir o 3 
}
