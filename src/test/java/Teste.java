import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Teste {
    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, BigDecimal.valueOf(100000000));
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, new Indiferente(), BigDecimal.valueOf(800500), 12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, BigDecimal.valueOf(100000000));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, new Conservador(), BigDecimal.valueOf(800500), 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveSerPossivelNegociarUmAtacanteComUmClube() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 10, BigDecimal.valueOf(100000000));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 9, new Conservador(), BigDecimal.valueOf(800500), 100);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClube() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 10, BigDecimal.valueOf(800500));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 29, null, 9, new Conservador(), BigDecimal.valueOf(800500), 100);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, BigDecimal.valueOf(800000));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, new Conservador(), BigDecimal.valueOf(800500), 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(2000501));
        Meio_Campo meioCampo = new Meio_Campo("DeBruyne", 28, "City", 10, new Indiferente(), BigDecimal.valueOf(2000500));

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoFoiPossivelNegociaMeioCampoComMenosDeTrintaAnosPorReputacaoHistoricas(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 9, BigDecimal.valueOf(2000501));
        Meio_Campo meioCampo = new Meio_Campo("DeBruyne", 28, "City", 10, new Indiferente(), BigDecimal.valueOf(2000500));

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(100000000));
        Meio_Campo meioCampo = new Meio_Campo("DeBruyne", 32, "City", 10, new Indiferente(), BigDecimal.valueOf(600500));

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoZagueiroComMenosDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(5000501));
        Zagueiro zagueiro = new Zagueiro("Tonhao", 28, "Grêmio", 10, new Mercenario(), BigDecimal.valueOf(2000500));

        boolean foiPossivelNegociar = negociacao.negociar(clube, zagueiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoZagueiroComMaisDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(2000500));
        Zagueiro zagueiro = new Zagueiro("Geromel", 33, "Grêmio", 10, new Indiferente(), BigDecimal.valueOf(2000500));

        boolean foiPossivelNegociar = negociacao.negociar(clube, zagueiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoLateralComMaisDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(2000501));
        Lateral lateral = new Lateral("Cortez", 33, null, 5, new Conservador(), BigDecimal.valueOf(2000501),22);

        boolean foiPossivelNegociar = negociacao.negociar(clube, lateral);

        Assert.assertTrue( foiPossivelNegociar);
    }

    @Test
    public void naoDeveCalcularCorretamenteOPrecoDoLateralComMenosDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 8, BigDecimal.valueOf(2000501));
        Lateral lateral = new Lateral("Cortez", 28, null, 5, new Conservador(), BigDecimal.valueOf(2200501),22);

        boolean foiPossivelNegociar = negociacao.negociar(clube, lateral);

        Assert.assertFalse( foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorHistoricoDoClube(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", -1, BigDecimal.valueOf(2000501));
        Lateral lateral = new Lateral("Cortez", 28, null, 5, new Conservador(), BigDecimal.valueOf(2200501),22);

        boolean foiPossivelNegociar = negociacao.negociar(clube, lateral);

        Assert.assertFalse( foiPossivelNegociar);
    }

    @Test
    public void deveSerPossivelNegociarPorHistoricoDoClube(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Sao Jose", 13, BigDecimal.valueOf(2500501));
        Lateral lateral = new Lateral("Cortez", 33, null, 5, new Conservador(), BigDecimal.valueOf(2000501),22);

        boolean foiPossivelNegociar = negociacao.negociar(clube, lateral);

        Assert.assertTrue( foiPossivelNegociar);
    }

}
