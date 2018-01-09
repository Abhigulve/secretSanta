package changed.approach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class TilesGrouping {


    public static void main(String[] args) {
        List<Tile> tiles = new ArrayList<Tile>();
        String tileId = "B118502";
        //185697538
        //9baee40
        System.out.println(Long.toHexString(185697538));
        System.out.println(Integer.parseInt(tileId, 16));
        System.out.println(Long.parseLong(tileId, 16));
    }

    private static void sort(List<Tile> elements) {
        Collections.sort(elements, new Comparator<Tile>() {
            public int compare(Tile o1, Tile o2) {
                return o2.getFeatureCount() - o1.getFeatureCount();
            }
        });
    }

    public static void grouping(Tile tile, List<Tile> tiles, List<Tile> grouped, List<Tile> edgeTiles, int threshold, int currentFeatureCount) {
        if (edgeTiles.size() == 1) {
            if (tile.getFeatureCount() + currentFeatureCount >= threshold) {
                grouped.add(tile);
                return;
            } else {

/*
                                    |---- get the left right of the center element and make the best combination which less than threshold
          Get the best out of it---|
                                    |----get the top and bottom of the center element and make the best combination which less than threshold
      Check the threshold read or not and pass the
*/


            }
        }

    }
    /*
        1 :- horizontal
        2 :- Vertical
        3 :- both
    */

    private int getNextTiles(List<Tile> tile, int threshold, List<Tile> groupTiles, int currentCount, int verOrHor) {

        int horizantalExpantionTotal = 0;
        int verticalExpantionTotal = 0;
        if ((verOrHor != 2 || (verOrHor == 3))) {
            if (getLeftTile(tile).getSumofTiles() < threshold) {
                horizantalExpantionTotal = getLeftTile(tile).getSumofTiles() + getrightTile(tile).getSumofTiles() - currentCount;
                if (horizantalExpantionTotal >= threshold) {
                    addHorizontal(groupTiles, tile);
                    return 0;
                } else if (verOrHor == 1) {
                    addHorizontal(groupTiles, tile);
                }
            } else {
                groupTiles.addAll(getLeftTile(tile).getTiles());
                return 0;
            }
        }
        if (verOrHor != 1 || (verOrHor == 3)) {
            if (getTopTile(tile).getSumofTiles() < threshold) {
                verticalExpantionTotal = getTopTile(tile).getSumofTiles() + getBottomTile(tile).getSumofTiles() - currentCount;
                if (verticalExpantionTotal >= threshold) {
                    addVertical(groupTiles, tile);
                    return 0;
                } else if (verOrHor == 2) {
                    addVertical(groupTiles, tile);
                }
            } else {
                groupTiles.addAll(getTopTile(tile).getTiles());
                return 0;
            }
        }
        if (verOrHor == 3) {
            if ((verticalExpantionTotal < horizantalExpantionTotal)) {
                addVertical(groupTiles, tile);
                getNextTiles(tile, threshold, groupTiles, verticalExpantionTotal, 2);
            } else {
                addHorizontal(groupTiles, tile);
                getNextTiles(tile, threshold, groupTiles, horizantalExpantionTotal, 1);
            }
        } else {
            getNextTiles(tile, threshold, groupTiles, verticalExpantionTotal, 3);
        }
        return 1;
    }

    private void addVertical(List<Tile> groupTiles, List<Tile> tile) {
        groupTiles.addAll(getTopTile(tile).getTiles());
        groupTiles.addAll(getBottomTile(tile).getTiles());
    }

    private void addHorizontal(List<Tile> groupTiles, List<Tile> tile) {
        groupTiles.addAll(getLeftTile(tile).getTiles());
        groupTiles.addAll(getrightTile(tile).getTiles());
    }

    private adjacentTiles getLeftTile(List<Tile> tile) {
        return null;
    }

    private adjacentTiles getrightTile(List<Tile> tile) {
        return null;
    }

    private adjacentTiles getTopTile(List<Tile> tile) {
        return null;
    }

    private adjacentTiles getBottomTile(List<Tile> tile) {
        return null;
    }

    @Test
    public void test() {

        List<Tile> tiles = new ArrayList<Tile>();
        tiles.add(new Tile(185697538, 10, false, false));
        tiles.add(new Tile(185697544, 30, false, false));
        tiles.add(new Tile(185697373, 45, false, false));
        tiles.add(new Tile(185697375, 57, false, false));
        tiles.add(new Tile(163245258, 67, false, false));
        tiles.add(new Tile(185619385, 11, false, false));
        tiles.add(new Tile(163224576, 00, false, false));
        tiles.add(new Tile(163223893, 20, false, false));
        tiles.add(new Tile(163223211, 23, false, false));
        tiles.add(new Tile(163224577, 25, false, false));
        tiles.add(new Tile(185619379, 66, false, false));
        sort(tiles);
        //System.out.println(tiles);
    }

    static class CornerCoOrdinates {

        private Point topLeft;
        private Point topRight;
        private Point bottomLeft;
        private Point getBottomRight;

        public CornerCoOrdinates(Point topLeft, Point topRight, Point bottomLeft, Point getBottomRight) {

            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.getBottomRight = getBottomRight;
        }

        public Point getTopLeft() {

            return topLeft;
        }

        public void setTopLeft(Point topLeft) {
            this.topLeft = topLeft;
        }

        public Point getTopRight() {
            return topRight;
        }

        public void setTopRight(Point topRight) {
            this.topRight = topRight;
        }

        public Point getBottomLeft() {
            return bottomLeft;
        }

        public void setBottomLeft(Point bottomLeft) {
            this.bottomLeft = bottomLeft;
        }

        public Point getGetBottomRight() {
            return getBottomRight;
        }

        public void setGetBottomRight(Point getBottomRight) {
            this.getBottomRight = getBottomRight;
        }

        @Override
        public String toString() {
            return "CornerCoOrdinates{" +
                    "topLeft=" + topLeft +
                    ", topRight=" + topRight +
                    ", bottomLeft=" + bottomLeft +
                    ", getBottomRight=" + getBottomRight +
                    '}';
        }

        /**
         * This class object poses sigle co-ordinate of matrix
         */
        class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

    }


}
