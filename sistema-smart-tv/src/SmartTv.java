public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual: " +canal);
    }

    
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para: " +canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuir canal para: " +canal);
    }

    public void  aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " +volume);
    }


    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: "+volume);
    }

    public void ligar(){
        ligada=true;
        System.out.println("Tv ligada");
    }
    public void desligar(){
        ligada=false;
        System.out.println("Tv desligada");
    }
}