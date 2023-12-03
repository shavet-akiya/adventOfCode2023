public class Day_2 {
    public static int cubeGame(String gameList) {
        String[] games = gameList.split("\n");
        int total = 0;
        for (int i = 0; i < games.length; i++) {
            String g = games[i];
            int gameNumber = i + 1;
            int blockCount = 0;
            int gameFail = 0;
            int red = 0;
            int green = 0;
            int blue = 0;
            for (int j = 6; j < g.length(); j++) {
                if ((gameNumber >= 10) && (j == 6)) {
                    j++;
                } if ((gameNumber >= 100 ) && (j == 6)) {
                   j++;
                }
                if (Character.isDigit(g.charAt(j))) {
                    if (Character.isDigit(g.charAt(j + 1))) {
                        blockCount = (10 * Character.getNumericValue(g.charAt(j))) +
                                Character.getNumericValue(g.charAt(j + 1));
                        if ((g.charAt(j + 3) == 'r') && (blockCount > red)) {
                            red = blockCount;
                        }
                        if ((g.charAt(j + 3) == 'b') && (blockCount > blue)) {
                            blue = blockCount;
                        }
                        if ((g.charAt(j + 3) == 'g') && (blockCount > green)) {
                            green = blockCount;
                        }
                    } else if (!(Character.isDigit(g.charAt(j - 1)))) {
                        blockCount = Character.getNumericValue(g.charAt(j));
                        if ((g.charAt(j + 2) == 'r') && (blockCount > red)) {
                            red = blockCount;
                        }
                        if ((g.charAt(j + 2) == 'b') && (blockCount > blue)) {
                            blue = blockCount;
                        }
                        if ((g.charAt(j + 2) == 'g') && (blockCount > green)) {
                            green = blockCount;
                        }
                    }
                }
            }
            int power = red * blue * green;
            System.out.printf("R: %d, G: %d, B: %d => Power: %d.\n", red, green, blue, power);
            total += power;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "yay!";
        System.out.println(cubeGame(s));
    }
}
