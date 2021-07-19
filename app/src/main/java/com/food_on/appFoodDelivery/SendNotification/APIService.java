package com.food_on.appFoodDelivery.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAnXq6SEE:APA91bE_-xxn5gq-HuacMeuDsixkr6DKNgOma6H5EACcgWvDm-s-Ded5JIIO0J9NVYIV5a4ZyP8mfsIph8wBVwrJ94ZjQAPasJJt4Mlw5P7zdRu2VBeFg2r_YB_j6WORNDQHhuV1UB7P"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
