package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void devePontuarUmJogador() {
        Cartola cartola = new Cartola(2023, 1, "Brasileiro", "Flamengo");
        Jogador jogador = new Jogador("Gabriel");
        jogador.escalar(cartola);
        cartola.lancarPontuacao();
        assertEquals("Gabriel, pontuacao lançada no Aplicativo{ano=2023, turno=1, nomeCompeticao='Brasileiro', nomeTime='Flamengo'}", jogador.getUltimaNotificacao());
    }

    @Test
    void devePontuarJogadores() {
        Cartola cartola = new Cartola(2023, 1, "Brasileiro", "Flamengo");
        Jogador jogador1 = new Jogador("Gabriel");
        Jogador jogador2 = new Jogador("Pedro");
        jogador1.escalar(cartola);
        jogador2.escalar(cartola);
        cartola.lancarPontuacao();
        assertEquals("Gabriel, pontuacao lançada no Aplicativo{ano=2023, turno=1, nomeCompeticao='Brasileiro', nomeTime='Flamengo'}", jogador1.getUltimaNotificacao());
        assertEquals("Pedro, pontuacao lançada no Aplicativo{ano=2023, turno=1, nomeCompeticao='Brasileiro', nomeTime='Flamengo'}", jogador2.getUltimaNotificacao());
    }

    @Test
    void naoDevePontuarJogador() {
        Cartola cartola = new Cartola(2023, 1, "Brasileiro", "Flamengo");
        Jogador jogador = new Jogador("Pablo");
        cartola.lancarPontuacao();
        assertEquals(null, jogador.getUltimaNotificacao());
    }

    @Test
    void devePontuarJogadorFlamengo() {
        Cartola cartolaA = new Cartola(2023, 1, "Brasileiro", "Flamengo");
        Cartola cartolaB = new Cartola(2023, 1, "Brasileiro", "Fluminense");
        Jogador jogador1 = new Jogador("Gabriel");
        Jogador jogador2 = new Jogador("Cano");
        jogador1.escalar(cartolaA);
        jogador2.escalar(cartolaB);
        cartolaA.lancarPontuacao();
        assertEquals("Gabriel, pontuacao lançada no Aplicativo{ano=2023, turno=1, nomeCompeticao='Brasileiro', nomeTime='Flamengo'}", jogador1.getUltimaNotificacao());
        assertEquals(null, jogador2.getUltimaNotificacao());
    }
}