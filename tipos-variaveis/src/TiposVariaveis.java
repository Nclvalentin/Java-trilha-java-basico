public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Nathan Costa Louro Valentin";
        System.out.println(meuNome);

        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.err.println(numeroCurto);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);

        final double VALOR_DE_PI = 3.14;
        System.out.printf("O VALOR DE PI É " ,VALOR_DE_PI);
    }
}
