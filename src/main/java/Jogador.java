import java.math.BigDecimal;

public class Jogador {
    protected String nome;
    protected int idade;
    protected String clubeAtual;
    protected int reputacaoHistorica;
    protected ApetiteFinanceiro apetiteFinanceiro;
    protected BigDecimal preco;

    public Jogador(String nome, int idade, String clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.reputacaoHistorica = reputacaoHistorica;
        this.apetiteFinanceiro = apetiteFinanceiro;
        this.preco = preco;
    }

    public String getNomeJogador() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        if (clubeAtual.equals("null")){
            this.clubeAtual = "Sem Clube";
        }else{
        this.clubeAtual = clubeAtual;
        }
    }

    public int getReputacaoHistoricaJogador() {
        return reputacaoHistorica;
    }

    public ApetiteFinanceiro getApetiteFinanceiro() {
        return apetiteFinanceiro;
    }

    public BigDecimal getPreco() {
        return preco;
    }


    public BigDecimal valorDeCompra(){
        return this.getPreco().multiply(BigDecimal.valueOf(this.getApetiteFinanceiro().getPercentualDeAumento()));
    }

    public void novoClube(String novoClube){
        setClubeAtual(novoClube);
    }

    public boolean interresseTranferenciaJogador(Clube clube){
        if (clube.getReputacaoHistoricaClube() >= 1){
            return true;
        } else return false;
    }

}
