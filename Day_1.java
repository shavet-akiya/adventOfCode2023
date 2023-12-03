import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day_1 {
    public static int parseAndAdd(String allLines) {
        String[] lines = allLines.split("\n");
        int total = 0;
        for (int i = 0; i < lines.length; i++) {
            int a = -1;
            int b = -1;
            String l = lines[i];
            for (int j = 0; j < l.length() - 1;j++) {
                if ((l.charAt(j) == 'o') && (l.charAt(j + 1) == 'n') && (l.charAt(j + 2) == 'e')) {
                    if (a < 0) {
                        a = 1;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 1;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 't') && (l.charAt(j + 1) == 'w') && (l.charAt(j + 2) == 'o')) {
                    if (a < 0) {
                        a = 2;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 2;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 't') && (l.charAt(j + 1) == 'h') && (l.charAt(j + 2) == 'r') &&
                        (l.charAt(j + 3) == 'e') && ((l.charAt(j + 4) == 'e'))) {
                    if (a < 0) {
                        a = 3;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 3;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 'f') && (l.charAt(j + 1) == 'o') && (l.charAt(j + 2) == 'u') &&
                        (l.charAt(j + 3) == 'r')) {
                    if (a < 0) {
                        a = 4;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 4;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 'f') && (l.charAt(j + 1) == 'i') && (l.charAt(j + 2) == 'v') &&
                        (l.charAt(j + 3) == 'e')) {
                    if (a < 0) {
                        a = 5;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 5;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 's') && (l.charAt(j + 1) == 'i') && (l.charAt(j + 2) == 'x')) {
                    if (a < 0) {
                        a = 6;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 6;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 's') && (l.charAt(j + 1) == 'e') && (l.charAt(j + 2) == 'v') &&
                        (l.charAt(j + 3) == 'e') && (l.charAt(j + 4) == 'n')) {
                    if (a < 0) {
                        a = 7;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 7;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 'e') && (l.charAt(j + 1) == 'i') && (l.charAt(j + 2) == 'g') &&
                        (l.charAt(j + 3) == 'h') && (l.charAt(j + 4) == 't')) {
                    if (a < 0) {
                        a = 8;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 8;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((l.charAt(j) == 'n') && (l.charAt(j + 1) == 'i') && (l.charAt(j + 2) == 'n') &&
                        (l.charAt(j + 3) == 'e')) {
                    if (a < 0) {
                        a = 9;
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = 9;
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if (Character.isDigit(l.charAt(j))) {
                    if (a < 0) {
                        a = Character.getNumericValue((l.charAt(j)));
//                        System.out.printf("this is a: %d\n", a);
                    } else {
                        b = Character.getNumericValue((l.charAt(j)));
//                        System.out.printf("this is b: %d\n", b);
                    }
                }
                if ((j + 1) == (l.length() - 1)) {
                    if (Character.isDigit(l.charAt(l.length() - 1))) {
                        if (a < 0) {
                            a = Character.getNumericValue((l.charAt(l.length() - 1)));
//                        System.out.printf("this is a: %d\n", a);
                        } else {
                            b = Character.getNumericValue((l.charAt(l.length() - 1)));
//                        System.out.printf("this is b: %d\n", b);
                        }
                    }
                }
            }
            if (b < 0) {
                System.out.printf("this is (a,b) : (%d,%d)\n", a, a);
//                String c = (Integer.toString(a)) + (Integer.toString(a));
//                System.out.println(c);
//                total += (Integer.valueOf(c));
                total += ((10 * a) + a);
            } else {
                System.out.printf("this is (a,b) : (%d,%d)\n", a, b);
//                String c = (Integer.toString(a)) + (Integer.toString(b));
//                System.out.println(c);
//                total += (Integer.valueOf(c));
                total += ((10 * a) + b);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(parseAndAdd(s));
    }
}
