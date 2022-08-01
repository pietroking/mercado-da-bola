public class Negociacao {
    private Jogador jogadorDeInteresse;
    private Clube clubeInteressado;

    public Negociacao() {
    }

    private boolean interesseJogador(Clube clubeInteressado, Jogador jogadorDeInteresse){
        return jogadorDeInteresse.interresseTranferenciaJogador(clubeInteressado);
    }

    private boolean clubeTemDinheiro(Clube clubeInteressado, Jogador jogadorDeInteresse){
        Integer teste = (clubeInteressado.getSaldoDisponivel().compareTo(jogadorDeInteresse.valorDeCompra()));
        if (teste.equals(1)) {
            return true;
        } else return false;
    }

    public boolean negociar(Clube clubeInteressado, Jogador jogadorDeInteresse){
        if (interesseJogador(clubeInteressado, jogadorDeInteresse) && clubeTemDinheiro(clubeInteressado, jogadorDeInteresse)){
            clubeInteressado.setSaldoDisponivel(clubeInteressado.getSaldoDisponivel().subtract(jogadorDeInteresse.valorDeCompra()));
            jogadorDeInteresse.novoClube(clubeInteressado.getNomeClube());
            return true;
        }
        return false;
    }
}
