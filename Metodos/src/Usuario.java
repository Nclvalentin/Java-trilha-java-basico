public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada?"+ smartTV.ligada);
        if (smartTV.ligada){
            System.out.println("Canal Atual: "+ smartTV.canal);
            System.out.println("Volume:" + smartTV.volume);
        
        }
        smartTV.ligar();

        System.out.println("TV Ligada?"+ smartTV.ligada);
        if (smartTV.ligada){
            System.out.println("Canal Atual: "+ smartTV.canal);
            System.out.println("Volume:" + smartTV.volume);
        
        }

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("TV Ligada?"+ smartTV.ligada);
        if (smartTV.ligada){
            System.out.println("Canal Atual: "+ smartTV.canal);
            System.out.println("Volume:" + smartTV.volume);
        
        }
    }
}
