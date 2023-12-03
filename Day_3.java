import java.util.ArrayList;

public class Day_3 {
    public static int adjacentPartFinder(String s) {
        String[] engine = s.split("\n");
        int total = 0;
        for (int i = 1; i < engine.length - 1; i++) {
            String engineRow = engine[i];
            for (int j = 0; j < engineRow.length(); j++) {
                if (engineRow.charAt(j) == '*') {
                    int counter = 0;
                    int num1 = 0;
                    int num2 = 0;
                    String numberBuilder;
                    ArrayList<String> parts = new ArrayList<>();
                    for (int y = (i - 1); y < (i + 2); y++) {
                        if (y == i) {
                            if (Character.isDigit(engine[y].charAt(j - 1))) {
                                numberBuilder = Character.toString(engine[y].charAt(j - 1));
                                if ((Character.isDigit(engine[y].charAt(j - 2)))) {
                                    numberBuilder =
                                            Character.toString(engine[y].charAt(j - 2)) + numberBuilder;
                                    if ((Character.isDigit(engine[y].charAt(j - 3)))) {
                                        numberBuilder =
                                                Character.toString(engine[y].charAt(j - 3)) + numberBuilder;
                                        parts.add(numberBuilder);
                                    } else {
                                        parts.add(numberBuilder);
                                    }
                                } else {
                                    parts.add(numberBuilder);
                                }
                            }
                            if (Character.isDigit(engine[y].charAt(j + 1))) {
                                numberBuilder = Character.toString(engine[y].charAt(j + 1));
                                if ((Character.isDigit(engine[y].charAt(j + 2)))) {
                                    numberBuilder += Character.toString(engine[y].charAt(j + 2));
                                    if ((Character.isDigit(engine[y].charAt(j + 3)))) {
                                        numberBuilder += Character.toString(engine[y].charAt(j + 3));
                                        parts.add(numberBuilder);
                                    } else {
                                        parts.add(numberBuilder);
                                    }
                                } else {
                                    parts.add(numberBuilder);
                                }
                            }
                            y++;
                        }
                        /*
                    Three number if statements
                     */
                        if (Character.isDigit(engine[y].charAt(j - 1)) &&
                                Character.isDigit((engine[y].charAt(j - 2))) && Character.isDigit((engine[y].charAt(j - 3)))) {
                            numberBuilder = Character.toString(engine[y].charAt(j - 3)) +
                                    Character.toString(engine[y].charAt(j - 2)) + Character.toString(engine[y].charAt(j - 1));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j)) &&
                                Character.isDigit((engine[y].charAt(j - 1))) && Character.isDigit((engine[y].charAt(j - 2)))) {
                            numberBuilder = Character.toString(engine[y].charAt(j - 2)) +
                                    Character.toString(engine[y].charAt(j - 1)) + Character.toString(engine[y].charAt(j));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j)) &&
                                Character.isDigit((engine[y].charAt(j - 1))) && Character.isDigit((engine[y].charAt(j + 1)))) {
                            numberBuilder = Character.toString(engine[y].charAt(j - 1)) +
                                    Character.toString(engine[y].charAt(j)) + Character.toString(engine[y].charAt(j + 1));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j)) &&
                                Character.isDigit((engine[y].charAt(j + 2))) && Character.isDigit((engine[y].charAt(j + 1)))) {
                            numberBuilder = Character.toString(engine[y].charAt(j)) +
                                    Character.toString(engine[y].charAt(j + 1)) + Character.toString(engine[y].charAt(j + 2));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j + 3)) &&
                                Character.isDigit((engine[y].charAt(j + 2))) && Character.isDigit((engine[y].charAt(j + 1)))) {
                            numberBuilder = Character.toString(engine[y].charAt(j + 1)) +
                                    Character.toString(engine[y].charAt(j + 2)) + Character.toString(engine[y].charAt(j + 3));
                            parts.add(numberBuilder);
                        }
                    /*
                    Two number if statements
                     */
                        if (Character.isDigit(engine[y].charAt(j - 1)) &&
                                Character.isDigit((engine[y].charAt(j - 2))) && !(Character.isDigit((engine[y].charAt(j - 3)))) &&
                                !(Character.isDigit((engine[y].charAt(j))))) {
                            numberBuilder =
                                    Character.toString(engine[y].charAt(j - 2)) + Character.toString(engine[y].charAt(j - 1));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j)) &&
                                Character.isDigit((engine[y].charAt(j - 1))) &&
                                !(Character.isDigit((engine[y].charAt(j + 1)))) && !(Character.isDigit(engine[y].charAt(j - 2)))) {
                            numberBuilder =
                                    Character.toString(engine[y].charAt(j - 1)) + Character.toString(engine[y].charAt(j));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j)) &&
                                Character.isDigit(engine[y].charAt(j + 1)) &&
                                !(Character.isDigit(engine[y].charAt(j - 1))) && !(Character.isDigit(engine[y].charAt(j + 2)))) {
                            numberBuilder =
                                    Character.toString(engine[y].charAt(j)) + Character.toString(engine[y].charAt(j + 1));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j + 2)) &&
                                Character.isDigit((engine[y].charAt(j + 1))) &&
                                !(Character.isDigit(engine[y].charAt(j))) && !(Character.isDigit(engine[y].charAt(j + 3)))) {
                            numberBuilder =
                                    Character.toString(engine[y].charAt(j + 1)) + Character.toString(engine[y].charAt(j + 2));
                            parts.add(numberBuilder);
                        }
                    /*
                    One number if statements
                     */
                        if (Character.isDigit(engine[y].charAt(j)) && !(Character.isDigit((engine[y].charAt(j - 1))))
                                && !(Character.isDigit((engine[y].charAt(j + 1))))) {
                            numberBuilder = Character.toString(engine[y].charAt(j));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j - 1)) && !(Character.isDigit((engine[y].charAt(j - 2))))
                                && !(Character.isDigit((engine[y].charAt(j))))) {
                            numberBuilder = Character.toString(engine[y].charAt(j - 1));
                            parts.add(numberBuilder);
                        }
                        if (Character.isDigit(engine[y].charAt(j + 1)) && !(Character.isDigit((engine[y].charAt(j))))
                                && !(Character.isDigit((engine[y].charAt(j + 2))))) {
                            numberBuilder = Character.toString(engine[y].charAt(j + 1));
                            parts.add(numberBuilder);
                        }
                    }
                    if (parts.size() == 2) {
                        num1 = Integer.valueOf(parts.get(0));
                        num2 = Integer.valueOf(parts.get(1));
                        total += num2 * num1;
                    }
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        String s = "yay!";
        System.out.println(adjacentPartFinder(s));
    }
}
