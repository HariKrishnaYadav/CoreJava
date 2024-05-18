package com.hky.threads;

public class TicketBooking implements Runnable {
    int ticketsAvailable = 1;

    @Override
    public void run() {
        System.out.println("Waiting for tiket booking:" + Thread.currentThread().getName());
        if (ticketsAvailable > 0) {
            System.out.println("Booking to ticket for:" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticketsAvailable--;
            System.out.println("Ticket BOOKED for : " + Thread.currentThread().getName());
            System.out.println("currently ticketsAvailable = " + ticketsAvailable);
        } else {
            System.out.println("Ticket NOT BOOKED for : " + Thread.currentThread().getName());

        }
    }
}
