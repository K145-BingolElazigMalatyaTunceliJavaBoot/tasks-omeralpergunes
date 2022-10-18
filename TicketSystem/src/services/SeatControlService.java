package services;

import java.util.LinkedList;
import java.util.List;

public class SeatControlService {

    public static List<String> seatControlService(int seatLong) {
        LinkedList<String> seats = new LinkedList<String>();
        seats.add("A1 Business\n");
        seats.add("A2 Business\n");
        seats.add("A3 Business\n");
        seats.add("B1 Business\n");
        seats.add("B2 Business\n");
        seats.add("B3 Economic\n");
        seats.add("C1 Economic\n");
        seats.add("C2 Economic\n");
        seats.add("C3 Economic\n");
        seats.add("D1 Economic\n");
        seats.add("D2 Economic\n");
        seats.add("D3 Economic\n");
        seats.add("E1 Economic\n");
        seats.add("E2 Economic\n");
        seats.add("E3 Economic\n");
        seats.add("F1 Economic\n");
        seats.add("F2 Economic\n");
        seats.add("F3 Economic\n");

        return seats;
    }
}
