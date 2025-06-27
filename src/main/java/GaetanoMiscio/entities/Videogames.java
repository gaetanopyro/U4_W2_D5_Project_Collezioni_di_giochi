package GaetanoMiscio.entities;

import GaetanoMiscio.enums.GameType;
import GaetanoMiscio.enums.Platform;

public class Videogames extends Games {
    private Platform platform;
    private int durata;
    private GameType gameType;


    public Videogames(int id, String titolo, int anno, double prezzo, Platform platform, int durata, GameType gameType) {
        super(id, titolo, anno, prezzo);
        this.platform = platform;
        this.durata = durata;
        this.gameType = gameType;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    @Override
    public String toString() {
        return "Videogames{" +
                "platform=" + platform +
                ", durata=" + durata +
                ", gameType=" + gameType +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", prezzo=" + prezzo +
                '}';
    }
}
