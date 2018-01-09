package utils;

import java.util.List;

public class MiddileTileHandler {
    static void calculateAdjForMiddileTiles(String tileId, List<String> adjTiles, String lastNumber) {
        String staticPrefix = tileId.substring(0, tileId.length() - 2);
        switch (lastNumber) {
            case "9":
                TileConstants.ADJACENT_TO_9.stream().forEach(mt -> adjTiles.add(staticPrefix.concat(mt)));
                break;
            case "C":
                TileConstants.ADJACENT_TO_C.stream().forEach(mt -> adjTiles.add(staticPrefix.concat(mt)));
                break;
            case "3":
                TileConstants.ADJACENT_TO_3.stream().forEach(mt -> adjTiles.add(staticPrefix.concat(mt)));
                break;
            case "6":
                TileConstants.ADJACENT_TO_6.stream().forEach(mt -> adjTiles.add(staticPrefix.concat(mt)));
                break;
        }
    }
}