package GaetanoMiscio.entities;


import java.util.*;
import java.util.stream.Collectors;

public class Collezione {
    private Map<Integer, Games> collectionGames = new HashMap<>();

    public void addGames(Games games) {
        if (collectionGames.containsKey(games.getId()))
            collectionGames.put(games.getId(), games);
    }

    public Games searchId(Integer id) {
        if (!collectionGames.containsKey(id)) ;
        return collectionGames.get(id);
    }

    public List<BoardGames> searchPlayer(int minPlayer) {
        return collectionGames.values().stream()
                .filter(games -> games instanceof BoardGames)
                .map(games -> (BoardGames) games)
                .filter(games -> games.getNumeroGiocatori() >= minPlayer)
                .collect(Collectors.toList());
    }

    public List<Games> searchPrice(double maxPrice) {
        return collectionGames.values().stream()
                .filter((games -> games.getPrezzo() < maxPrice))
                .collect(Collectors.toList());
    }

    public void removePlayer(Integer id) {
        if (!collectionGames.containsKey(id))
            collectionGames.remove(id);
    }

    public void updateGame(Integer id, Games news) {
        if (!collectionGames.containsKey(id))
            collectionGames.put(id, news);
    }

    public void collectionStatistics() {
        int nVideogames = Math.toIntExact(collectionGames.values().stream()
                .filter(games -> games instanceof Videogames).count());
        System.out.println("Nr totale Videogames" + nVideogames);
        int nBoardGames = Math.toIntExact(collectionGames.values().stream()
                .filter(games -> games instanceof BoardGames).count());
        System.out.println("Nr totale di BoardGames" + nBoardGames);
        Optional<Games> maxGamePrice = collectionGames.values().stream().max(Comparator.comparing(Games::getPrezzo));
        double mediaPrice = collectionGames.values().stream().mapToDouble(Games::getPrezzo).average().orElse(0);

    }

    @Override
    public String toString() {
        return "Collezione{" +
                "collectionGames=" + collectionGames +
                '}';
    }


}
