package padroescomportamentais.observer;

import java.util.Observable;

public class Cartola extends Observable {

    private Integer ano;
    private Integer turno;
    private String nomeCompeticao;
    private String nomeTime;

    public Cartola(Integer ano, Integer turno, String nomeCompeticao, String nomeTime) {
        this.ano = ano;
        this.turno = turno;
        this.nomeCompeticao = nomeCompeticao;
        this.nomeTime = nomeTime;
    }

    public void lancarPontuacao() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Aplicativo{" +
                "ano=" + ano +
                ", turno=" + turno +
                ", nomeCompeticao='" + nomeCompeticao + '\'' +
                ", nomeTime='" + nomeTime + '\'' +
                '}';
    }
}
