public class EstruturasCondicionais {
    public static void main(String[] args) throws Exception {
        //Condicional Simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado<saldo)
        saldo = saldo - valorSolicitado;
        System.out.println(saldo);

        //Condicional Composta 
        int nota = 6;

        if(nota>=7)
        System.out.println("Aprovado");

        else
        System.out.println("Reprovado");
            //Em ternario 
            //resultado = nota>=7? "aprovado" : "reprovado"
            //system.out.println(resultado)

        //Condicional Cadeada

        int notaEsc = 4 ;

        if(notaEsc>=7)
        System.out.println("Aprovado");
        else{
            if(notaEsc>=5 && notaEsc <7){
                System.out.println("Recuperação");
            }        
            else{
                System.out.println("Reprovado");
            }
            
        }
            // Em ternario
            //String resultado = notaEsc>=7?"Aprovado":notaEsc>=5 && notaEsc<7 ? "Recuperação" : "Reprovado";
            //System.out.println(resultado);

        //Switch Case

        String medida = "M";
        switch (medida){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
                case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
        }
        
            
            
    }
}
