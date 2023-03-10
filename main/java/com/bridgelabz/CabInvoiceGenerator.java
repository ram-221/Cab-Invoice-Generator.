package com.bridgelabz;


public class CabInvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;


	public  double calculateFare(Double distance, int time) {
		double totalFare =Math.max(MINIMUM_FARE, distance * COST_PER_KILOMETER + time * COST_PER_TIME); 
		return totalFare;

	}

	public double calculateFare(Ride[] rides) {
		double totalFare = 0.0;
		for(Ride ride : rides) {
			totalFare += calculateFare(ride.getDistance(),ride.getTime());
		}
		return totalFare;

	}
	
	public  InvoiceSummary getInvoiceSummary(Ride[] rides) {
		double totalFare = calculateFare(rides);
		int numOfRides = rides.length;
		return new InvoiceSummary(numOfRides, totalFare);
	}

	/*public static void main(String[] args) {

		CabInvoiceGenerator cab = new CabInvoiceGenerator();
		System.out.println(cab.calculateFare(0.3, 1));

	}*/



}
