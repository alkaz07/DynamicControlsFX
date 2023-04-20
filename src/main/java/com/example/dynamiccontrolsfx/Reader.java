package com.example.dynamiccontrolsfx;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Reader {
    String fio;

    public Reader() {
//        URL url = null;
//        try {
//            url = new URL("https://api.randomdatatools.ru/?count=1&params=LastName&unescaped=false");
//
//            Scanner sc = new Scanner(url.openStream());
//            String str = sc.nextLine();
//            sc.close();
//            fio =str.split("\"")[3];
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        int r = new Random().nextInt(1, 100);
        fio = "читатель "+r;
    }

    public Reader(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Reader{" + fio +  '}';
    }
}
