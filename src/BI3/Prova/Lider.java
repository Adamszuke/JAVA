package BI3.Prova;

public class Lider extends Cadastro{
    private int tempoLideranca;

    public Lider() {
        super();
        this.tempoLideranca = 0;
    }
    public Lider(String nome, String poder, int idade, int nivelForca, Endereco endereco, int tempoLideranca) {
        super(nome, poder, idade, nivelForca, endereco);
        this.tempoLideranca = tempoLideranca;
    }
    public int getTempoLideranca() {
        return tempoLideranca;
    }
    public void setTempoLideranca(int tempoLideranca) {
        this.tempoLideranca = tempoLideranca;
    }

    @Override
    public void exibirCadastro() {
        System.out.println("\n--Dados do Líder--");
        super.exibirCadastro();
        System.out.println("Tempo de Liderança: " + tempoLideranca + " anos");
        System.out.println("-----------------------");
    }
    public void liderarMissao() {
        System.out.println(getNome() + " está liderando a equipe com sabedoria!");
    }
}
