public class SmartTV {
        //EXERCITANDO

        //vamos criar um exemplo de uma classe para representar uma SmartTv onde
        //1- Ela tenha as características: Ligada(boolean), canal(int) e volume(int)
        //2- Nossa TV poderá ligar e desligar e assim mudar o estado ligado;
        //3- Nossa TV aumentará ou diminuirá o volume sempre em +1 ou -1
        //4- Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligada= true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }

    //canais
    public void mudarDeCanal(int novoCanal){
        canal=novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    
}
