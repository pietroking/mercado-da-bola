import java.math.BigDecimal;

public class Zagueiro extends Jogador{

    public Zagueiro(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
    }

    @Override
    public BigDecimal valorDeCompra() {
        if (this.getIdade() > 30){
            return super.valorDeCompra().multiply(BigDecimal.valueOf(0.8));
        } return super.valorDeCompra();
    }
}
