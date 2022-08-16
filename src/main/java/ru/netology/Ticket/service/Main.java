package ru.netology.Ticket.service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1, "svo", "kzn", 1000, 120);
        Ticket ticket2 = new Ticket(2, "svo", "kzn", 2000, 120);
        Ticket ticket3 = new Ticket(3, "svo", "kzn", 500, 120);
        System.out.println(ticket1.compareTo(ticket2));
        Ticket[] tickets = {ticket1, ticket2, ticket3};
        Arrays.sort(tickets);
        System.out.println(tickets);
    }

}
