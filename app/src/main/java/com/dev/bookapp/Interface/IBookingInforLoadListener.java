package com.dev.bookapp.Interface;


import com.dev.bookapp.Model.BookingInformation;

public interface IBookingInforLoadListener {
    void onBookingInforLoadEmpty();

    void onBookingInforLoadSuccess(BookingInformation bookingInformation, String documentId);

    void onBookingInforLoadFailed(String message);
}
