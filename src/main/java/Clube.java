import java.math.BigDecimal;

public class Clube {
    private String nomeClube;
    private int reputacaoHistoricaClube;
    private BigDecimal saldoDisponivel;

    public Clube(String nome, int reputacaoHistorica, BigDecimal saldoDisponivel) {
        this.nomeClube = nome;
        if (reputacaoHistorica < 0){
            this.reputacaoHistoricaClube = 0;
        }else if (reputacaoHistorica > 10){
            this.reputacaoHistoricaClube = 10;
        }else{
            this.reputacaoHistoricaClube = reputacaoHistorica;
        }
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public int getReputacaoHistoricaClube() {
        return reputacaoHistoricaClube;
    }

    public BigDecimal getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(BigDecimal saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
