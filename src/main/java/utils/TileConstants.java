package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TileConstants {

    public static final String TOP_LEFT = "Top Left";
    public static final String BOTTOM_LEFT = "Bottom Left";
    public static final String TOP_RIGHT = "Top Right";
    public static final String BOTTOM_RIGHT = "Bottom Right";
    public static final String NOT_DIAGONAL = "Not Diagonal";
    public static List<String> CORNER_TILE_LIST = Arrays.asList("A", "F", "0", "5");
    public static List<String> EDGE_TILE_LIST = Arrays.asList("B", "E", "7", "5", "4", "1", "2", "8");
    public static List<String> ADJACENT_TO_9 = Arrays.asList("A", "B", "E", "C", "6", "3", "2", "8");
    public static List<String> ADJACENT_TO_C = Arrays.asList("B", "E", "F", "D", "3", "7", "6", "9");
    public static List<String> ADJACENT_TO_3 = Arrays.asList("8", "9", "C", "6", "4", "1", "0", "2");
    public static List<String> ADJACENT_TO_6 = Arrays.asList("9", "C", "D", "7", "5", "4", "1", "3");
    public static List<String> ADJACENT_TO_B = Arrays.asList("A", "E", "C", "9", "8");
    public static List<String> ADJACENT_TO_B_OTHER__TILE = Arrays.asList("0", "1", "4");
    public static List<String> ADJACENT_TO_E = Arrays.asList("B", "F", "C", "9", "D");
    public static List<String> ADJACENT_TO_E_OTHER__TILE = Arrays.asList("1", "4", "5");
    public static List<String> ADJACENT_TO_D = Arrays.asList("7", "6", "C", "E", "F");
    public static List<String> ADJACENT_TO_D_OTHER__TILE = Arrays.asList("A", "8", "2");
    public static List<String> ADJACENT_TO_7 = Arrays.asList("d", "5", "4", "6", "C");
    public static List<String> ADJACENT_TO_7_OTHER__TILE = Arrays.asList("8", "2", "0");
    public static List<String> ADJACENT_TO_4 = Arrays.asList("5", "1", "3", "6", "7");
    public static List<String> ADJACENT_TO_4_OTHER__TILE = Arrays.asList("B", "E", "F");
    public static List<String> ADJACENT_TO_1 = Arrays.asList("4", "0", "2", "3", "6");
    public static List<String> ADJACENT_TO_1_OTHER__TILE = Arrays.asList("A", "B", "E");
    public static List<String> ADJACENT_TO_2 = Arrays.asList("0", "1", "3", "9", "8");
    public static List<String> ADJACENT_TO_2_OTHER__TILE = Arrays.asList("D", "7", "5");
    public static List<String> ADJACENT_TO_8 = Arrays.asList("B", "A", "3", "9", "2");
    public static List<String> ADJACENT_TO_8_OTHER__TILE = Arrays.asList("F", "D", "7");
    public static List<String> ADJACENT_TO_A = Arrays.asList("B", "9", "8");
    public static List<String> ADJACENT_TO_A_TOP__TILE = Arrays.asList("0", "1");
    public static List<String> ADJACENT_TO_A_LEFT_TILE = Arrays.asList("F", "D");
    public static List<String> ADJACENT_TO_A_DIAGONAL_TILE = Arrays.asList("5");
    public static List<String> ADJACENT_TO_F = Arrays.asList("E", "C", "D");
    public static List<String> ADJACENT_TO_F_TOP_TILE = Arrays.asList("4", "5");
    public static List<String> ADJACENT_TO_F_RIGHT_TILE = Arrays.asList("A", "8");
    public static List<String> ADJACENT_TO_F_DIAGONAL_TILE = Arrays.asList("0");
    public static List<String> ADJACENT_TO_5 = Arrays.asList("4", "6", "7");
    public static List<String> ADJACENT_TO_5_DOWN_TILE = Arrays.asList("E", "F");
    public static List<String> ADJACENT_TO_5_RIGHT_TILE = Arrays.asList("0", "2");
    public static List<String> ADJACENT_TO_5_DIAGONAL_TILE = Arrays.asList("A");
    public static List<String> ADJACENT_TO_0 = Arrays.asList("2", "3", "1");
    public static List<String> ADJACENT_TO_0_DOWN_TILE = Arrays.asList("A", "B");
    public static List<String> ADJACENT_TO_0_LEFT_TILE = Arrays.asList("7", "5");
    public static List<String> ADJACENT_TO_0_DIAGONAL_TILE = Arrays.asList("F");
    public static List<String> UPWARDS = Arrays.asList("B", "E");
    public static List<String> DOWNWARDS = Arrays.asList("1", "4");
    public static List<String> LEFT = Arrays.asList("8", "2");
    public static List<String> RIGHT = Arrays.asList("D", "7");

    public static Map<String, String> UPWARDS_NUMBER = new HashMap<>();
    public static Map<String, String> LEFTWARDS_NUMBER = new HashMap<>();
    public static Map<String, String> RIGHTWARDS_NUMBER = new HashMap<>();
    public static Map<String, String> DOWNWARDS_NUMBER = new HashMap<>();

    public static Map<String, String> TOP_LEFT_NUMBER = new HashMap<>();
    public static Map<String, String> TOP_RIGHT_NUMBER = new HashMap<>();
    public static Map<String, String> BOTTOM_RIGHT_NUMBER = new HashMap<>();
    public static Map<String, String> BOTTOM_LEFT_NUMBER = new HashMap<>();

    static {
        UPWARDS_NUMBER.put("A", "0");
        UPWARDS_NUMBER.put("B", "1");
        UPWARDS_NUMBER.put("C", "E");
        UPWARDS_NUMBER.put("D", "F");
        UPWARDS_NUMBER.put("E", "4");
        UPWARDS_NUMBER.put("F", "5");
        UPWARDS_NUMBER.put("0", "2");
        UPWARDS_NUMBER.put("1", "3");
        UPWARDS_NUMBER.put("2", "8");
        UPWARDS_NUMBER.put("3", "9");
        UPWARDS_NUMBER.put("4", "6");
        UPWARDS_NUMBER.put("5", "7");
        UPWARDS_NUMBER.put("6", "C");
        UPWARDS_NUMBER.put("7", "D");
        UPWARDS_NUMBER.put("8", "A");
        UPWARDS_NUMBER.put("9", "B");

        LEFTWARDS_NUMBER.put("A", "F");
        LEFTWARDS_NUMBER.put("B", "a");
        LEFTWARDS_NUMBER.put("C", "9");
        LEFTWARDS_NUMBER.put("D", "C");
        LEFTWARDS_NUMBER.put("E", "B");
        LEFTWARDS_NUMBER.put("F", "E");
        LEFTWARDS_NUMBER.put("0", "5");
        LEFTWARDS_NUMBER.put("1", "0");
        LEFTWARDS_NUMBER.put("2", "7");
        LEFTWARDS_NUMBER.put("3", "2");
        LEFTWARDS_NUMBER.put("4", "1");
        LEFTWARDS_NUMBER.put("5", "4");
        LEFTWARDS_NUMBER.put("6", "3");
        LEFTWARDS_NUMBER.put("7", "6");
        LEFTWARDS_NUMBER.put("8", "D");
        LEFTWARDS_NUMBER.put("9", "8");

        RIGHTWARDS_NUMBER.put("A", "B");
        RIGHTWARDS_NUMBER.put("B", "E");
        RIGHTWARDS_NUMBER.put("C", "D");
        RIGHTWARDS_NUMBER.put("D", "8");
        RIGHTWARDS_NUMBER.put("E", "F");
        RIGHTWARDS_NUMBER.put("F", "A");
        RIGHTWARDS_NUMBER.put("0", "1");
        RIGHTWARDS_NUMBER.put("1", "4");
        RIGHTWARDS_NUMBER.put("2", "3");
        RIGHTWARDS_NUMBER.put("3", "6");
        RIGHTWARDS_NUMBER.put("4", "5");
        RIGHTWARDS_NUMBER.put("5", "0");
        RIGHTWARDS_NUMBER.put("6", "7");
        RIGHTWARDS_NUMBER.put("7", "2");
        RIGHTWARDS_NUMBER.put("8", "9");
        RIGHTWARDS_NUMBER.put("9", "C");


        DOWNWARDS_NUMBER.put("A", "8");
        DOWNWARDS_NUMBER.put("B", "9");
        DOWNWARDS_NUMBER.put("C", "6");
        DOWNWARDS_NUMBER.put("D", "7");
        DOWNWARDS_NUMBER.put("E", "C");
        DOWNWARDS_NUMBER.put("F", "D");
        DOWNWARDS_NUMBER.put("0", "A");
        DOWNWARDS_NUMBER.put("1", "B");
        DOWNWARDS_NUMBER.put("2", "0");
        DOWNWARDS_NUMBER.put("3", "1");
        DOWNWARDS_NUMBER.put("4", "E");
        DOWNWARDS_NUMBER.put("5", "F");
        DOWNWARDS_NUMBER.put("6", "4");
        DOWNWARDS_NUMBER.put("7", "5");
        DOWNWARDS_NUMBER.put("8", "2");
        DOWNWARDS_NUMBER.put("9", "3");

        TOP_LEFT_NUMBER.put("A", "5");
        TOP_LEFT_NUMBER.put("B", "0");
        TOP_LEFT_NUMBER.put("C", "B");
        TOP_LEFT_NUMBER.put("D", "E");
        TOP_LEFT_NUMBER.put("E", "1");
        TOP_LEFT_NUMBER.put("F", "4");
        TOP_LEFT_NUMBER.put("0", "2");
        TOP_LEFT_NUMBER.put("1", "0");
        TOP_LEFT_NUMBER.put("2", "D");
        TOP_LEFT_NUMBER.put("3", "8");
        TOP_LEFT_NUMBER.put("4", "3");
        TOP_LEFT_NUMBER.put("5", "6");
        TOP_LEFT_NUMBER.put("6", "9");
        TOP_LEFT_NUMBER.put("7", "C");
        TOP_LEFT_NUMBER.put("8", "F");
        TOP_LEFT_NUMBER.put("9", "A");

        TOP_RIGHT_NUMBER.put("A", "1");
        TOP_RIGHT_NUMBER.put("B", "4");
        TOP_RIGHT_NUMBER.put("C", "F");
        TOP_RIGHT_NUMBER.put("D", "A");
        TOP_RIGHT_NUMBER.put("E", "5");
        TOP_RIGHT_NUMBER.put("F", "0");
        TOP_RIGHT_NUMBER.put("0", "3");
        TOP_RIGHT_NUMBER.put("1", "6");
        TOP_RIGHT_NUMBER.put("2", "9");
        TOP_RIGHT_NUMBER.put("3", "C");
        TOP_RIGHT_NUMBER.put("4", "7");
        TOP_RIGHT_NUMBER.put("5", "2");
        TOP_RIGHT_NUMBER.put("6", "D");
        TOP_RIGHT_NUMBER.put("7", "8");
        TOP_RIGHT_NUMBER.put("8", "B");
        TOP_RIGHT_NUMBER.put("9", "E");

        BOTTOM_LEFT_NUMBER.put("A", "D");
        BOTTOM_LEFT_NUMBER.put("B", "8");
        BOTTOM_LEFT_NUMBER.put("C", "3");
        BOTTOM_LEFT_NUMBER.put("D", "6");
        BOTTOM_LEFT_NUMBER.put("E", "9");
        BOTTOM_LEFT_NUMBER.put("F", "C");
        BOTTOM_LEFT_NUMBER.put("0", "F");
        BOTTOM_LEFT_NUMBER.put("1", "A");
        BOTTOM_LEFT_NUMBER.put("2", "5");
        BOTTOM_LEFT_NUMBER.put("3", "0");
        BOTTOM_LEFT_NUMBER.put("4", "B");
        BOTTOM_LEFT_NUMBER.put("5", "E");
        BOTTOM_LEFT_NUMBER.put("6", "1");
        BOTTOM_LEFT_NUMBER.put("7", "4");
        BOTTOM_LEFT_NUMBER.put("8", "7");
        BOTTOM_LEFT_NUMBER.put("9", "2");

        BOTTOM_RIGHT_NUMBER.put("A", "9");
        BOTTOM_RIGHT_NUMBER.put("B", "C");
        BOTTOM_RIGHT_NUMBER.put("C", "7");
        BOTTOM_RIGHT_NUMBER.put("D", "2");
        BOTTOM_RIGHT_NUMBER.put("E", "D");
        BOTTOM_RIGHT_NUMBER.put("F", "8");
        BOTTOM_RIGHT_NUMBER.put("0", "B");
        BOTTOM_RIGHT_NUMBER.put("1", "E");
        BOTTOM_RIGHT_NUMBER.put("2", "1");
        BOTTOM_RIGHT_NUMBER.put("3", "4");
        BOTTOM_RIGHT_NUMBER.put("4", "F");
        BOTTOM_RIGHT_NUMBER.put("5", "A");
        BOTTOM_RIGHT_NUMBER.put("6", "5");
        BOTTOM_RIGHT_NUMBER.put("7", "0");
        BOTTOM_RIGHT_NUMBER.put("8", "3");
        BOTTOM_RIGHT_NUMBER.put("9", "6");

    }
}

