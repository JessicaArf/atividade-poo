import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }


    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }

    public int getDimensaoTotal() {
        int dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensaoTerritorial();
        }
        return dimensaoTotal;
    }

    public int getPopulacaoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double getDensidadePopulacional() {
        return (double) getPopulacaoTotal() / getDimensaoTotal();
    }

    public Pais getPaisComMaiorPopulacao() {
        Pais paisComMaiorPopulacao = null;
        for (Pais pais : paises) {
            if (paisComMaiorPopulacao == null || pais.getPopulacao() > paisComMaiorPopulacao.getPopulacao()) {
                paisComMaiorPopulacao = pais;
            }
        }
        return paisComMaiorPopulacao;
    }

    public Pais getPaisComMenorPopulacao() {
        Pais paisComMenorPopulacao = null;
        for (Pais pais : paises) {
            if (paisComMenorPopulacao == null || pais.getPopulacao() < paisComMenorPopulacao.getPopulacao()) {
                paisComMenorPopulacao = pais;
            }
        }
        return paisComMenorPopulacao;
    }

    public Pais getPaisComMaiorDimensaoTerritorial() {
        Pais paisComMaiorDimensao = null;
        for (Pais pais : paises) {
            if (paisComMaiorDimensao == null || pais.getDimensaoTerritorial() > paisComMaiorDimensao.getDimensaoTerritorial()) {
                paisComMaiorDimensao = pais;
            }
        }
        return paisComMaiorDimensao;
    }

    public Pais getPaisComMenorDimensaoTerritorial() {
        Pais paisComMenorDimensao = null;
        for (Pais pais : paises) {
            if (paisComMenorDimensao == null || pais.getDimensaoTerritorial() < paisComMenorDimensao.getDimensaoTerritorial()) {
                paisComMenorDimensao = pais;
            }
        }
        return paisComMenorDimensao;
    }


    public double getRazaoTerritorialMaiorMenor(){
        int maiorPais = getPaisComMaiorDimensaoTerritorial().getDimensaoTerritorial();
        int menorPais = getPaisComMenorDimensaoTerritorial().getDimensaoTerritorial();
        return (double) maiorPais / menorPais;
    }

    public void mostrarInformacoes(){
        System.out.println("=============================================");
        System.out.println("Continente: " + getNome());
        System.out.println("=============================================");
        System.out.println("Dimensão total do continente: " + getDimensaoTotal());
        System.out.println("População total do continente: " + getPopulacaoTotal());
        System.out.println("País com maior população: " + getPaisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + getPaisComMenorPopulacao().getNome());
        System.out.println("País com maior dimensão territorial: " + getPaisComMaiorDimensaoTerritorial().getNome());
        System.out.println("País com menor dimensão territorial: " + getPaisComMenorDimensaoTerritorial().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país  do continente: " + String.format("%.2f", getRazaoTerritorialMaiorMenor()));
    }

}
