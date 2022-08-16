package ru.netology.Ticket.service;

import java.util.Arrays;

public class ManagerTicket {
    Repository repository;

    public ManagerTicket(Repository repository) {
        this.repository = repository;

    }

    public void findAll() {
        repository.findAll();
    }

    public void add(Ticket ticket) {
        repository.add(ticket);
    }

    public Ticket[] searchBy(String arrivalAirport, String departureAirport) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getArrivalAirport().contains(arrivalAirport)) {
                if (ticket.getDepartureAirport().contains(departureAirport)) {
                    Ticket[] tmp = new Ticket[result.length + 1];
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];

                    }
                    tmp[tmp.length - 1] = ticket;
                    result = tmp;
                }
            }

        }
        Arrays.sort(result);
        return result;
    }


}
