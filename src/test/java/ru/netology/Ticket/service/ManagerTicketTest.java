package ru.netology.Ticket.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ManagerTicketTest {
    Repository repo = new Repository();
    ManagerTicket manager = new ManagerTicket(repo);
    Ticket ticket1 = new Ticket(1, "svo", "kzn", 1000, 120);
    Ticket ticket2 = new Ticket(2, "svo", "kzn", 2000, 120);
    Ticket ticket3 = new Ticket(3, "vko", "dxb", 5000, 120);
    Ticket ticket4 = new Ticket(4, "svo", "kzn", 1500, 120);
    Ticket ticket5 = new Ticket(5, "vko", "dxb", 1500, 120);

    @Test
    public void ticketTestFindAll() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket1, ticket4, ticket5, ticket2, ticket3};
        Ticket[] actual = manager.repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketTestSearchBy() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket1, ticket4, ticket2};
        Ticket[] actual = manager.searchBy("svo", "kzn");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketTestSearchBy2() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket5, ticket3};
        Ticket[] actual = manager.searchBy("vko", "dxb");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketTestSearchBy3() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("kuf", "dxb");
        Assertions.assertArrayEquals(expected, actual);
    }
}