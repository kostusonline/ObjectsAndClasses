// Терских Константин, kostus.online.1974@yandex.ru, 2024
// Домашнее задание по теме "Объекты и классы"
// SkyPro

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class Main {
    public static final String DIVIDER = " -------------------------------------";
    public static final DecimalFormat CURRENCY_FORMAT = new DecimalFormat("#,###.###");

    private static PrintWriter out;

    private static void init() {
        var charset = System.out.charset();
        System.out.println("[charset = " + charset + "]");
        out = new PrintWriter(System.out, true, charset);
    }

    public static void main(String[] args) {
        init();
    }
}