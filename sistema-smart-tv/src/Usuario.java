public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("Tv Ligada ? " + smartTv.ligada);
       System.out.println("Canal Atual :" + smartTv.canal);
       System.out.println("Volume Atual :" + smartTv.volume);

       smartTv.ligar();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();

       smartTv.aumentarCanal();
       smartTv.diminuirCanal();
       smartTv.mudarCanal(51);

       smartTv.desligar();
       
    }
}
