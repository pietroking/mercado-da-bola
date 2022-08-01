import java.math.BigDecimal;

public class Atacante extends Jogador{
    private int golsFeitosNoAno;

    public Atacante(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int golsFeitosNoAno) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.golsFeitosNoAno = golsFeitosNoAno;
    }

    public int getGolsFeitosNoAno() {
        return golsFeitosNoAno;
    }

    @Override
    public BigDecimal valorDeCompra() {
        if (this.getIdade() > 30){
            return (super.valorDeCompra().add(BigDecimal.valueOf(this.getGolsFeitosNoAno() * 1.01)).multiply(BigDecimal.valueOf(0.75)));
        } return super.valorDeCompra().add(BigDecimal.valueOf(this.getGolsFeitosNoAno() * 1.01));
    }

    @Override
    public boolean interresseTranferenciaJogador(Clube clube) {
        if (this.getReputacaoHistoricaJogador() < clube.getReputacaoHistoricaClube()){
            return true;
        }else return false;
    }
}
