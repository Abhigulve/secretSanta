package changed.approach;

/**
 * @author Abhijeet Gulve
 */
public class Tile {

    private long tileId;
    private int featureCount;
    private boolean isLock;
    private boolean isGrouped;
    private String hexTileId;

    public Tile(long tileId, int featureCount, boolean isLock, boolean isGrouped) {

        this.tileId = tileId;
        this.hexTileId = Long.toHexString(tileId);
        this.featureCount = featureCount;
        this.isLock = isLock;
        this.isGrouped = isGrouped;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "tileId=" + tileId + "\n" +
                ", featureCount=" + featureCount + "\n" +
                ", isLock=" + isLock + "\n" +
                ", isGrouped=" + isGrouped + "\n" +
                ", hexTileId='" + hexTileId + '\'' + "\n" +
                '}';
    }

    public long getTileId() {

        return tileId;
    }

    public void setTileId(long tileId) {
        this.tileId = tileId;
    }

    public int getFeatureCount() {
        return featureCount;
    }

    public void setFeatureCount(int featureCount) {
        this.featureCount = featureCount;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public boolean isGrouped() {
        return isGrouped;
    }

    public void setGrouped(boolean grouped) {
        isGrouped = grouped;
    }

    public String getHexTileId() {
        return hexTileId;
    }

    public void setHexTileId(String hexTileId) {
        this.hexTileId = hexTileId;
    }
}
