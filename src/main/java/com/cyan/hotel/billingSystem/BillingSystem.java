package com.cyan.hotel.billingSystem;

import com.cyan.hotel.model.Booking;

public class BillingSystem {
  Booking observable;
  int bookingTotal;

  public BillingSystem(Booking booking) {
	this.observable = booking;
  }

//    @Override
//    public void update(Observable o, Object arg) {
//        this.observable = (Booking) observable;
//        String name = this.observable.getObserver().toString();
//
//        if (o == observable) {
//            System.out.println("Booking total changed to: " + observable.getBookingTotal());
//            bookingTotal += observable.getBookingTotal();
//        }
//    }
}
