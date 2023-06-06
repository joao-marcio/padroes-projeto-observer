package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void escalar(Cartola cartola) {
        cartola.addObserver(this);
    }

    public void update(Observable turma, Object arg1) {
        this.ultimaNotificacao = this.nome + ", pontuacao lançada no " + turma.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
