package com.food_on.appFoodDelivery.SendNotification;


public class NotificationSender {

    public Data data;
    public String to;

    public NotificationSender(Data data,String to)
    {
        this.data=data;
        this.to=to;
    }

    public NotificationSender()
    {

    }
}
