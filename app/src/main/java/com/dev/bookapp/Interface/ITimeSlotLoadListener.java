package com.dev.bookapp.Interface;



import com.dev.bookapp.Model.TimeSlot;

import java.util.List;

public interface ITimeSlotLoadListener {

    void onTimeSlotLoadSuccess(List<TimeSlot> timeSlotList);

    void onTimeSlotLoadFailed(String message);

    void onTimeSlotLoadEmpty();
}
