package com.peer39.utils;

import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;

public class Test {

    public static void main(String[] args) {
        String urlStr = "https://edition.cnn.com/";
        StringBuilder text = new StringBuilder();
        URL url;
        {
            try {
                url = new URL(urlStr);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            try {
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            BufferedReader buffer = null;
            try {
                buffer = new BufferedReader(new InputStreamReader(url.openStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String input;
            while (true) {
                try {
                    if ((input = buffer.readLine()) == null) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                text.append(input);
                System.out.println(text);
            }

        }
//        String cleaned = Jsoup.clean(text, Whitelist.relaxed());
    }

}
