package com.example.messengerapp.Fragments;

import com.example.messengerapp.Notifications.MyResponse;
import com.example.messengerapp.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAZGAPeA0:APA91bGuDe4NPtHqLrkJ6HCLKbM3KRubTiS8UmuQaegZWOq2zXjv73bCKw5lArfGp9Dvt2ge-I92eY4grs1pSdvfKeaZgHLmqUyzEU0zcK32dSjtkW89ocP75mHSG8wWVXUrySrBCYOl"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
