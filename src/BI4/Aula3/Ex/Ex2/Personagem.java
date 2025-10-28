package BI4.Ex.Ex2;

public abstract class Personagem {
    protected String nome = "Yukio";
    protected int lv = 5;

    abstract String atacar();

    public String exibirStatus(){
        return "Nome: " + nome + "Lv: " + lv;
    }
}
