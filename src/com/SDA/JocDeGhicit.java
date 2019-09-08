package com.SDA;

public class JocDeGhicit {

    Jucator p1;
    Jucator p2;
    Jucator p3;

public void startJoc(){

    p1 = new Jucator();
    p2 = new Jucator();
    p3 = new Jucator();

    int numarAles1 =0;
    int numarAles2 =0;
    int numarAles3 =0;

    boolean p1aGhicit = false ;
    boolean p2aGhicit = false ;
    boolean p3aGhicit = false ;

    int numarulTinta = (int) (Math.random()*10);
    System.out.println("Ma gandesc la un numar intre 0 si 9...");

    while(true){

        System.out.println("Numarul care trebuie ghicit este " + numarulTinta);
        p1.incearca();
        p2.incearca();
        p3.incearca();

        numarAles1=p1.numar;
        System.out.println("Jucatorul unu a ales " +numarAles1);
        numarAles2=p2.numar;
        System.out.println("Jucatorul doi a ales " +numarAles2);
        numarAles3=p3.numar;
        System.out.println("Jucatorul trei a ales " +numarAles3);

        if(numarAles1==numarulTinta){
            p1aGhicit=true;
        }
        if(numarAles2==numarulTinta){
            p2aGhicit=true;
        }
        if(numarAles3==numarulTinta){
            p3aGhicit=true;
        }

        if (p1aGhicit||p2aGhicit|| p3aGhicit) {
            System.out.println("Avem un castigator!");
            System.out.println("Jucatorul 1 a ghicit? " + p1aGhicit);
            System.out.println("Jucatorul 2 a ghicit? " + p2aGhicit);
            System.out.println("Jucatorul 3 a ghicit? " + p3aGhicit);
            System.out.println("Jocul s-a terminat.");
            break;//jocul s-a terminat asa ca iesim din ciclu
        }else{
            System.out.println("Jucatorii trebuie sa incerce din nou! ");
        }



    }



}


}
