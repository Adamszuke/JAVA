package BI3.Prova;

public class Cadastro {
    private String nome;
    private String poder;
    private int idade;
    private int nivelForca;
    protected Endereco endereco;

    public Cadastro() {
        this.nome = "";
        this.poder = "";
        this.idade = 0;
        this.nivelForca = 0;
        this.endereco = new Endereco();
    }

    public Cadastro(String nome, String poder, int idade, int nivelForca, Endereco endereco) {
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
        this.nivelForca = nivelForca;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }   
    public int getIdade() {
        return idade;
    }   
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNivelForca() {
        return nivelForca;
    }
    public void setNivelForca(int nivelForca) {
        this.nivelForca = nivelForca;
    }   
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirCadastro() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Super Poder: " + poder);
        System.out.println("Nível de Poder: " + nivelForca);
        System.out.println(endereco.exibirEndereco());
    }   


}
