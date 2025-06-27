package GaetanoMiscio;


import GaetanoMiscio.entities.BoardGames;
import GaetanoMiscio.entities.Collezione;
import GaetanoMiscio.entities.Videogames;
import GaetanoMiscio.enums.GameType;
import GaetanoMiscio.enums.Platform;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

        Collezione listGames = new Collezione();
        Scanner scanner = new Scanner(System.in);

        int scelta;
        while (true) {
            System.out.println("--- Menu Collezione Giochi ---");
            System.out.println("1. Aggiungi un nuovo gioco");
            System.out.println("2. Cerca gioco per ID");
            System.out.println("3. Cerca giochi con prezzo inferiore a...");
            System.out.println("4. Cerca giochi da tavolo per numero di giocatori");
            System.out.println("5. Rimuovi un gioco per ID");
            System.out.println("6. Aggiorna un gioco esistente");
            System.out.println("7. Mostra statistiche della collezione");
            System.out.println("0. Esci");
            System.out.print("Inserisci la tua scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("--- Aggiungi Nuovo Gioco ---");
                    System.out.print("Inserisci ID gioco: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Inserisci Anno di pubblicazione: ");
                    int anno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("È un (V)ideogioco o (T)avolo? (V/T): ");
                    String sceltaTipo = scanner.nextLine().trim().toUpperCase();

                    if ("V".equals(sceltaTipo)) {
                        System.out.print("Inserisci Piattaforma (PC, PLAYSTATION, XBOX, NINTENDO_SWITCH, MOBILE): ");
                        Platform piattaforma = Platform.valueOf(scanner.nextLine().trim().toUpperCase());
                        System.out.print("Inserisci Durata (ore): ");
                        int durata = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Inserisci Tipo Gioco (FANTASY, AZIONE, SPORT, AVVVENTURA): ");
                        GameType tipo = GameType.valueOf(scanner.nextLine().trim().toUpperCase());
                        listGames.addGames(new Videogames(id, titolo, anno, prezzo, piattaforma, durata, tipo));
                    } else if ("T".equals(sceltaTipo)) {
                        System.out.print("Inserisci Numero massimo di giocatori: ");
                        int maxGiocatori = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Inserisci Durata media partita (minuti): ");
                        int durataMedia = scanner.nextInt();
                        scanner.nextLine();
                        listGames.addGames(new BoardGames(id, titolo, anno, prezzo, maxGiocatori, durataMedia));
                    } else {
                        System.out.println("Tipo gioco non valido. Operazione annullata.");
                    }
                    break;

                case 2:
                    System.out.println("--- Cerca Gioco per ID ---");
                    System.out.print("Inserisci l'ID del gioco da cercare: ");
                    int idRicerca = scanner.nextInt();
                    scanner.nextLine();


                case 3:
                    System.out.println("--- Cerca Giochi per Prezzo Inferiore a ---");
                    System.out.print("Inserisci il prezzo massimo: ");
                    double prezzoMax = scanner.nextDouble();
                    scanner.nextLine();


                case 4:
                    System.out.println("--- Cerca Giochi da Tavolo per Numero di Giocatori ---");
                    System.out.print("Inserisci il numero minimo di giocatori: ");
                    int minGiocatori = scanner.nextInt();
                    scanner.nextLine();


                case 5:
                    System.out.println("--- Rimuovi Gioco per ID ---");
                    System.out.print("Inserisci l'ID del gioco da rimuovere: ");
                    int idRimuovi = scanner.nextInt();
                    scanner.nextLine();
                    listGames.removePlayer(idRimuovi);
                    break;

                case 6:
                    System.out.println("--- Aggiorna Gioco Esistente ---");
                    System.out.print("Inserisci l'ID del gioco da aggiornare: ");
                    int idAggiorna = scanner.nextInt();
                    scanner.nextLine();

                case 7:
                    listGames.collectionStatistics();
                    break;

                case 0:
                    System.out.println("Chiusura applicazione. Arrivederci!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

            System.out.print("Premi INVIO per continuare...");
            scanner.nextLine();

        }
    }
}



