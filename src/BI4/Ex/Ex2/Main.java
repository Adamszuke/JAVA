package BI4.Ex.Ex2;



public class Main {
    public static void main(String[] args) {
        Personagem p;
        p = new Mago();
        System.out.println(p.atacar());

        p = new Guerreiro();
        System.out.println(p.atacar());
    }
    
}
