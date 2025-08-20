public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        System.out.println("---- Ligando a TV ----");
        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        System.out.println("---- Aumentando o volume ----");
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);

        System.out.println("---- Diminuindo o volume ----");
        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + smartTv.volume);
        System.out.println("---- Aumentando o canal ----");
        smartTv.aumentarCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        System.out.println("---- Diminuindo o canal ----");
        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        System.out.println("---- Mudando o canal ----");
        smartTv.mudarCanal(10);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("---- Desligando a TV ----");
        smartTv.desligar();     
        System.out.println("TV Ligada? " + smartTv.ligada);
    }
}
