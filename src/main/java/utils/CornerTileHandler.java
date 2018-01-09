package utils;

import java.util.List;

public class CornerTileHandler {
    static void calucalteAdjecentForCornerTiles(String tileId, List<String> adjTiles, String lastNumber) {
        String staticPrefixSameTile = tileId.substring(0, tileId.length() - 1);
        String staticPrefixOtherTile = tileId.substring(0, tileId.length() - 2);
        String penulimateNumber = tileId.substring(tileId.length() - 2, tileId.length() - 1);
        switch (lastNumber) {
            case "A":
                TileConstants.ADJACENT_TO_A.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                TileConstants.ADJACENT_TO_A_LEFT_TILE.stream().
                        forEach(lt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.LEFTWARDS_NUMBER.get(penulimateNumber)).concat(lt)));
                TileConstants.ADJACENT_TO_A_TOP__TILE.stream().
                        forEach(tt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.UPWARDS_NUMBER.get(penulimateNumber)).concat(tt)));
                adjTiles.add(staticPrefixOtherTile.concat(TileConstants.TOP_LEFT_NUMBER.get(penulimateNumber))
                        .concat(TileConstants.ADJACENT_TO_A_DIAGONAL_TILE.get(0)));
                break;

            case "F":
                TileConstants.ADJACENT_TO_F.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                TileConstants.ADJACENT_TO_F_RIGHT_TILE.stream().
                        forEach(lt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.RIGHTWARDS_NUMBER.get(penulimateNumber)).concat(lt)));
                TileConstants.ADJACENT_TO_F_TOP_TILE.stream().
                        forEach(tt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.UPWARDS_NUMBER.get(penulimateNumber)).concat(tt)));
                adjTiles.add(staticPrefixOtherTile.concat(TileConstants.TOP_RIGHT_NUMBER.get(penulimateNumber))
                        .concat(TileConstants.ADJACENT_TO_F_DIAGONAL_TILE.get(0)));
                break;


            case "5":
                TileConstants.ADJACENT_TO_5.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                TileConstants.ADJACENT_TO_5_RIGHT_TILE.stream().
                        forEach(lt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.RIGHTWARDS_NUMBER.get(penulimateNumber)).concat(lt)));
                TileConstants.ADJACENT_TO_5_DOWN_TILE.stream().
                        forEach(tt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.DOWNWARDS_NUMBER.get(penulimateNumber)).concat(tt)));
                adjTiles.add(staticPrefixOtherTile.concat(TileConstants.BOTTOM_RIGHT_NUMBER.get(penulimateNumber))
                        .concat(TileConstants.ADJACENT_TO_5_DIAGONAL_TILE.get(0)));
                break;

            case "0":
                TileConstants.ADJACENT_TO_0.stream().forEach(mt -> adjTiles.add(staticPrefixSameTile.concat(mt)));
                TileConstants.ADJACENT_TO_0_LEFT_TILE.stream().
                        forEach(lt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.LEFTWARDS_NUMBER.get(penulimateNumber)).concat(lt)));
                TileConstants.ADJACENT_TO_0_DOWN_TILE.stream().
                        forEach(tt -> adjTiles.add(staticPrefixOtherTile.concat(TileConstants.DOWNWARDS_NUMBER.get(penulimateNumber)).concat(tt)));
                adjTiles.add(staticPrefixOtherTile.concat(TileConstants.BOTTOM_LEFT_NUMBER.get(penulimateNumber))
                        .concat(TileConstants.ADJACENT_TO_0_DIAGONAL_TILE.get(0)));
                break;

        }
    }
}