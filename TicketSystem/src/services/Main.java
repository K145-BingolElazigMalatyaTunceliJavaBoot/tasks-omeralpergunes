package services;

import companies.entities.Pegasus;
import companies.entities.TurkishAirlines;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner click = new Scanner(System.in);
        System.out.println("Firma secimi icin 1'e tiklayiniz");
        int a = click.nextInt();

        System.out.println("Ucak Firmasini Seciniz\n" + "1- Turk Hava Yollari\n" + "2- Pegasus Hava Yollari\n");
        System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");

        int select = click.nextInt();

        TurkishAirlines turkishAirlines = new TurkishAirlines();
        Pegasus pegasus = new Pegasus();

        switch (select) {
            case 1:

                System.out.println("Turk Hava Yollari Sefer Bilgileri");
                System.out.println("Firma Adi: " + turkishAirlines.getFlightCompanyName());
                System.out.println("Nereden: " + turkishAirlines.getDomestic());
                System.out.println("Nereye: " + turkishAirlines.getAbroad());
                System.out.println("Business Sinifi Fiyatlandirma => " + turkishAirlines.getBusinessSeats() + " | "
                        + " Yurt Disi Yemek Hizmeti: " + turkishAirlines.isAbroadFood());
                System.out.println("Ekonomik Sinifi Fiyatlandirma => " + turkishAirlines.getEconomicSeats() + " | "
                        + " Yurt ici Yemek Hizmeti:  " + turkishAirlines.isDomesticFood());

                IFlightService thyService = new ThyService();
                LinkedList<String> thySeats = new LinkedList<String>();
                TurkishAirlines turkishairlines1 = new TurkishAirlines();
                thySeats.add("C3");
                thySeats.add("F1");
                thyService.buySeats(turkishairlines1, thySeats);

                System.out.println("Kalan Bos Koltuklar");
                thyService.emptySeats(turkishairlines1);

                break;

            case 2:

                System.out.println("Pegasus Hava Yollari Ucus Bilgileri");
                System.out.println("Firma Adi" + pegasus.getFlightCompanyName());
                System.out.println("Nereden: " + pegasus.getDomestic());
                System.out.println("Nereye: " + pegasus.getAbroad());
                System.out.println("Business Sinifi Fiyatlandirma => " + pegasus.getBusinessSeats());
                System.out.println("Ekonomik Sinifi Fiyatlandirma => " + pegasus.getEconomicSeats());
                System.out.println("Yurt Disi Yemek Hizmeti =>  " + pegasus.isAbroadFood());

                IFlightService pegasusService = new PegasusService();
                LinkedList<String> pegasusSeats = new LinkedList<String>();
                Pegasus pegasus1 = new Pegasus();
                pegasusSeats.add("B4");
                pegasusSeats.add("D2");
                pegasusService.buySeats(pegasus1, pegasusSeats);

                System.out.println("Kalan Bos Koltuklar");
                pegasusService.emptySeats(pegasus1);

                break;

        }
        System.out.println("Sistemden çıkış yapmak için 0'a basın");
        System.exit(0);
    }
    }
