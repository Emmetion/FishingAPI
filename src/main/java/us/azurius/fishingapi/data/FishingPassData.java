package us.azurius.fishingapi.data;

import java.time.LocalDateTime;
import java.util.Date;

public class FishingPassData {

    public LocalDateTime timePurchased;
    public LocalDateTime timeToEnd;
    public int tier;



    public FishingPassData(LocalDateTime timePurchased, LocalDateTime timeToEnd, int tier) {
        this.timePurchased = timePurchased;
        this.timeToEnd = timeToEnd;
        this.tier = tier;
    }

    public LocalDateTime getTimePurchased() {
        return timePurchased;
    }

    public LocalDateTime getTimeToEnd() {
        return timeToEnd;
    }

    public int getTier() {
        return tier;
    }



}
