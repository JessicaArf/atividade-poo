public class Pais {

    private String nome;
    private int populacao;
    private int dimensaoTerritorial;

    public Pais(String nome, int populacao, int dimensaoTerritorial) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    public void setDimensaoTerritorial(int dimensaoTerritorial) {
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

}
