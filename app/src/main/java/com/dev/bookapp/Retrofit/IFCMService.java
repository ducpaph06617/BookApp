package com.dev.bookapp.Retrofit;






import com.dev.bookapp.Model.FCMResponse;
import com.dev.bookapp.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAlIhKLCE:APA91bH7WW7M_wPBxPuoU0Bq2VPiS2EPSZt3k4hISA_CbjBFQu_dIp-OGEOPmO7cDG2u__5T4Klh0QCpiBSk3b1N4H4Zep_ApqG9r9d5n6tv_VKjNMv3RO4TH0xdDCCXfvetr_LmmFgI"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
