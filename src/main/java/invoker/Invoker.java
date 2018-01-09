package invoker;


import utils.AdjacentTileFinderImpl;

import java.util.List;

public class Invoker {

    public static void main(String[] args) {
        List<String> adjOfEo84C99 = AdjacentTileFinderImpl.getAdjacentTiles("EO84C60");
//        List<String> adjOfEo84C99 = AdjacentTileFinderImpl.getAdjacentTiles(Arrays.asList("EO84C60", "EO84C61", "EO84C4A", "EO84C4B"));
        System.out.println(adjOfEo84C99);

    }
}

