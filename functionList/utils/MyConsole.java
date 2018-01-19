package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsole {
    BufferedReader bufferedReader;

    public MyConsole() {
        InputStreamReader m = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(m);
    }

    public void print(String s) {
        System.out.print(s);
    }

    public void println(String s) {
        System.out.println(s);
    }

    public String readString(String defValue) {
        try {
            String s = bufferedReader.readLine();
            if (s.trim().length() == 0) {
                return defValue;
            }
            return s;
        } catch (IOException e) {
            return defValue;
        }
    }

    public int readInt(int defValue) {
        try {
            String s = readString(null);
            return Integer.valueOf(s);
        } catch (Exception e) {
            return defValue;
        }
    }
}
