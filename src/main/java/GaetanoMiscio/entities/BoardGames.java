package GaetanoMiscio.entities;

public class BoardGames extends Games {
    private int numeroGiocatori;
    private int durataMediaPartita;

    public BoardGames(int id, String titolo, int anno, double prezzo, int numeroGiocatori, int durataMediaPartita) {
        super(id, titolo, anno, prezzo);
        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public void setDurataMediaPartita(int durataMediaPartita) {
        this.durataMediaPartita = durataMediaPartita;
    }

    @Override
    public String toString() {
        return "BoardGames{" +
                "durataMediaPartita=" + durataMediaPartita +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", prezzo=" + prezzo +
                ", numeroGiocatri=" + numeroGiocatori +
                '}';
    }
}
