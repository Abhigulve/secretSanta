package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdjacentTileFinderImpl {


    public static List<String> getAdjacentTiles(String tileId) {
        List<String> adjTiles = new ArrayList<>();
        String lastNumber = tileId.substring(tileId.length() - 1);
        if (TileConstants.CORNER_TILE_LIST.contains(lastNumber)) {
            CornerTileHandler.calucalteAdjecentForCornerTiles(tileId, adjTiles, lastNumber);
        } else if (TileConstants.EDGE_TILE_LIST.contains(lastNumber)) {
            EdgeTileHandlers.calculateAdjacentForEdgeTiles(tileId, adjTiles, lastNumber);
        } else {
            MiddileTileHandler.calculateAdjForMiddileTiles(tileId, adjTiles, lastNumber);
        }

        return adjTiles;
    }


    public static List<String> getAdjacentTiles(List<String> tileIds) {
        Set<String> tileSet = new HashSet<>();
        tileIds.stream().forEach(tile -> tileSet.addAll(getAdjacentTiles(tile)));
        List<String> adjTileList = tileSet.stream().filter(ft -> !(tileIds.contains(ft))).collect(Collectors.toList());

        return adjTileList;
    }

    public static String getDiagonalPosition(String tile1, String tile2) {

        String lastNumber1 = tile1.substring(tile1.length() - 1);
        String lastNumber2 = tile2.substring(tile2.length() - 1);

        if (lastNumber1.equals(TileConstants.TOP_LEFT_NUMBER.get(lastNumber2))) {
            return TileConstants.TOP_LEFT;
        } else if (lastNumber1.equals(TileConstants.TOP_RIGHT_NUMBER.get(lastNumber2))) {
            return TileConstants.TOP_RIGHT;
        } else if (lastNumber1.equals(TileConstants.BOTTOM_LEFT_NUMBER.get(lastNumber2))) {
            return TileConstants.BOTTOM_LEFT;
        } else if (lastNumber1.equals(TileConstants.BOTTOM_RIGHT_NUMBER.get(lastNumber2))) {
            return TileConstants.BOTTOM_RIGHT;
        } else {
            return TileConstants.NOT_DIAGONAL;
        }
    }


}

