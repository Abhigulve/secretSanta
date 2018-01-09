package changed.approach;

import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class adjacentTiles {
    List<Tile> tiles;
    int sumofTiles;

    public adjacentTiles(List<Tile> tiles, int sumofTiles) {
        this.tiles = tiles;
        this.sumofTiles = sumofTiles;
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public int getSumofTiles() {
        return sumofTiles;
    }

    public void setSumofTiles(int sumofTiles) {
        this.sumofTiles = sumofTiles;
    }
}
