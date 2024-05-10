import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        split();
    }

    private static void split() {
        System.out.println("String.split() examples...");

        String string = "A quick brown fox jumps over the lazy dog";
        System.out.println("\n\n" + string);
        for (String s : string.split(" ")) {
            System.out.println(s);
        }

        string = "What light is light if Sylvia be not seen?";
        System.out.println("\n\n" + string);
        for (String s : string.split("[\\s?]")) {
            System.out.println(s);
        }

        string = "What joy is  ?     joy if Sylvia      be not by?";
        System.out.println("\n\n" + string);
        for (String s : string.split("[?\\s]+")) {
            System.out.println(s);
        }
    }
}

