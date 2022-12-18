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
}
