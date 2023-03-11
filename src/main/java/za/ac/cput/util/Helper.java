package za.ac.cput.util;

import java.util.Random;
import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean checkStock() {
        Random randomStock = new Random();
        if (randomStock.nextBoolean()) {
            return true;
        }
        else return false;
    }
}
