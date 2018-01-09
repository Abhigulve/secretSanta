package utils;

import java.util.List;

public class EdgeTileHandlers {
    static void calculateAdjacentForEdgeTiles(String tileId, List<String> adjTiles, String lastNumber) {
        String staticPrefixSameTile = tileId.substring(0, tileId.length() - 1);
        String staticPrefixOtherTile = tileId.substring(0, tileId.length() - 2);
        String penulimateNumber = tileId.substring(tileId.length() - 2, tileId.length() - 1);
        switch (lastNumber) {
            case "B":
                TileConstants.ADJACENT_TO_B.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTileB = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_B_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTileB).concat(ot)));
                break;
            case "E":
                TileConstants.ADJACENT_TO_E.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTileE = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_E_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTileE).concat(ot)));
                break;
            case "D":
                TileConstants.ADJACENT_TO_D.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTileD = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_D_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTileD).concat(ot)));
                break;
            case "7":
                TileConstants.ADJACENT_TO_7.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTile7 = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_7_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTile7).concat(ot)));
                break;
            case "4":
                TileConstants.ADJACENT_TO_4.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTile4 = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_4_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTile4).concat(ot)));
                break;
            case "1":
                TileConstants.ADJACENT_TO_1.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTile1 = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_1_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTile1).concat(ot)));
                break;
            case "2":
                TileConstants.ADJACENT_TO_2.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTile2 = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_2_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTile2).concat(ot)));
                break;
            case "8":
                TileConstants.ADJACENT_TO_8.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                String outsideTile8 = calculatePenultimateSurroundingForEdge(penulimateNumber, lastNumber);
                TileConstants.ADJACENT_TO_8_OTHER__TILE.stream().forEach(ot -> adjTiles.add(staticPrefixOtherTile.concat(outsideTile8).concat(ot)));
                break;
        }
    }

    static String calculatePenultimateSurroundingForEdge(String penultimateNumber, String lastNumber) {
        if (TileConstants.UPWARDS.contains(lastNumber)) {
            return TileConstants.UPWARDS_NUMBER.get(penultimateNumber);
        } else if (TileConstants.DOWNWARDS.contains(lastNumber)) {
            return TileConstants.DOWNWARDS_NUMBER.get(penultimateNumber);
        } else if (TileConstants.LEFT.contains(lastNumber)) {
            return TileConstants.LEFTWARDS_NUMBER.get(penultimateNumber);
        } else if (TileConstants.RIGHT.contains(lastNumber)) {
            return TileConstants.RIGHTWARDS_NUMBER.get(penultimateNumber);
        } else {
            return "Unknown tile";
        }

    }
}