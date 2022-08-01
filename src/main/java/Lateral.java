import java.math.BigDecimal;

public class Lateral extends Jogador{
    private int cruzamentoCerteirosNoAno;

    public Lateral(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int cruzamentoCerteirosNoAno) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.cruzamentoCerteirosNoAno = cruzamentoCerteirosNoAno;
    }

    public int getCruzamentoCerteirosNoAno() {
        return cruzamentoCerteirosNoAno;
    }

    @Override
    public BigDecimal valorDeCompra() {
        if (this.getIdade() > 30){
            return (super.valorDeCompra().add(BigDecimal.valueOf(this.getCruzamentoCerteirosNoAno() * 1.02)).multiply(BigDecimal.valueOf(0.7)));
        } return super.valorDeCompra().add(BigDecimal.valueOf(this.getCruzamentoCerteirosNoAno() * 1.02));
    }
}
