package pl.derela.wszib.spotkanie4.powtorka.exception;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws MalformedURLException {

        CheckedExceptionDemo checkedExceptionDemo = new CheckedExceptionDemo();
        /*checkedExceptionDemo.urlTesterByTrycatch("htps://www.wszib.edu.pl/rekrutacja/");*/
        checkedExceptionDemo.urlTesterByThrows("htps://www.wszib.edu.pl/rekrutacja/");

    }

    public void urlTesterByTrycatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " +url.getProtocol());
            System.out.println("Host: " +url.getHost());

        } catch (MalformedURLException e) {
            /*e.printStackTrace();*/
            System.out.println("Wystąpił błąd: " +e.getMessage());
        }

    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {

        URL url = new URL(urlStr);
        System.out.println("Protocol: " +url.getProtocol());
        System.out.println("Host: " +url.getHost());
    }


}
