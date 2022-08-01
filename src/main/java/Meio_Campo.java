import java.math.BigDecimal;

public class Meio_Campo extends Jogador{

    public Meio_Campo(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
    }

    @Override
    public BigDecimal valorDeCompra() {
        if (this.getIdade() > 30){
            return super.valorDeCompra().multiply(BigDecimal.valueOf(0.8));
        } return super.valorDeCompra();
    }

    @Override
    public boolean interresseTranferenciaJogador(Clube clube) {
        if (this.getReputacaoHistoricaJogador() - clube.getReputacaoHistoricaClube() >= 2){
          return true;
        }else return false;
    }

}
