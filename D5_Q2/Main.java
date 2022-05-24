package com.D5_Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		int bookings = input.nextInt();
		
		System.out.println("Enter the available tickets:");
		int available = input.nextInt();
		
		System.out.println("Enter the ticket id:");
		int ticketId = input.nextInt();
		
		System.out.println("Enter the price:");
		int price = input.nextInt();
		
		
		Ticket t1 = new Ticket();
		t1.setPrice(price);
		t1.setTicketid(ticketId);
		t1.setAvailableTickets(available);
		
		int total = t1.calculateTicketCost(bookings);
		
		System.out.println("Total amount: " + total);
		System.out.println("Available ticket after booking: " + t1.getAvailableTickets());
		
		
	}
}
