package aheng.wpapitest.utils;

/**
 * @author AHeng
 * @date 2021/05/15 0:48
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class Validate {
    public Validate() {
    }

    public static void isTrue(boolean expression, String message, long value) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, value));
        }
    }

    public static void isTrue(boolean expression, String message, double value) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, value));
        }
    }

    public static void isTrue(boolean expression, String message, Object... values) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, values));
        }
    }

    public static void isTrue(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException("The validated expression is false");
        }
    }

}
