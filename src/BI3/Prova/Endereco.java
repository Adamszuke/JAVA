package src.BI3.Prova;

public class Endereco {
    private String rua;
    private String cidade;
    private String pais;

    public Endereco() {
        this.rua = "";
        this.cidade = "";   
        this.pais = "";
    }

    public Endereco(String rua, String cidade, String pais) {
        this.rua = rua;
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String exibirEndereco() {
        return "Endereço: " + rua + ", " + cidade + "- " + pais;
    }

}
