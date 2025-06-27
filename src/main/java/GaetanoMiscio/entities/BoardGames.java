package GaetanoMiscio.entities;

public class BoardGames extends Games {
    private int numeroGiocatri;
    private int durataMediaPartita;

    public BoardGames(int id, String titolo, int anno, double prezzo, int numeroGiocatri, int durataMediaPartita) {
        super(id, titolo, anno, prezzo);
        this.numeroGiocatri = numeroGiocatri;
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroGiocatri() {
        return numeroGiocatri;
    }

    public void setNumeroGiocatri(int numeroGiocatri) {
        this.numeroGiocatri = numeroGiocatri;
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
                ", numeroGiocatri=" + numeroGiocatri +
                '}';
    }
}
