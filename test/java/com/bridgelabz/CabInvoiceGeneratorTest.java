package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
	
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoice = new CabInvoiceGenerator();
		Double distance = 6.0;
		int time = 10;
		Double fare = cabInvoice.calculateFare(distance,time);
		Assertions.assertEquals(70, fare);
	}
	
	@Test
	public void givenDistanceAndTime_ShouldreturnMinimumFare() {
		CabInvoiceGenerator cabInvoice = new CabInvoiceGenerator();
		Double distance = 0.1;
		int time = 1;
		Double fare = cabInvoice.calculateFare(distance,time);
		Assertions.assertEquals(5, fare);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoice = new CabInvoiceGenerator();
		Ride[] rides = {new Ride(2.0,5),new Ride(0.1,1),new Ride(7.0,9)};
		double fare = cabInvoice.calculateFare(rides);
		Assertions.assertEquals(109, fare);
	}
	
	 @Test
	    public void givenMultipleRidesShouldReturnRideSummary() {
		 CabInvoiceGenerator cabInvoice = new CabInvoiceGenerator();
	        Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
	        InvoiceSummary summary = cabInvoice.getInvoiceSummary(rides) ;
	        InvoiceSummary expectedSummary = new InvoiceSummary(2, 30.0);
	        Assertions.assertEquals(expectedSummary, summary);
	 }
}
