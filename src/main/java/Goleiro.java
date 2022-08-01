import java.math.BigDecimal;

public class Goleiro extends Jogador{
        private int penaltisDefendidosNoAno;

        public Goleiro(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int penaltisDefendidosNoAno) {
                super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
                this.penaltisDefendidosNoAno = penaltisDefendidosNoAno;
        }

        public int getPenaltisDefendidosNoAno() {
                return penaltisDefendidosNoAno;
        }

        @Override
        public BigDecimal valorDeCompra() {
                return super.valorDeCompra().add(BigDecimal.valueOf(this.getPenaltisDefendidosNoAno() * 1.04));
        }
}
