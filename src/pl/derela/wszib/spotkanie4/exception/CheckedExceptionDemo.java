package pl.derela.wszib.spotkanie4.exception;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
        ced.urlTesterByTryCatch("httsp://www.wszib.edu.pl/rekrutacja");

    }



    public void urlTesterByTryCatch(String urlStr) {

        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());

        } catch (MalformedURLException e) {
            System.out.println("Wystąpił Błąd:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows (String urlStr) {

        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
