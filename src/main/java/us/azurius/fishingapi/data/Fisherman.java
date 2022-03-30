package us.azurius.fishingapi.data;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "userdata")
public class Fisherman {

    @Indexed(unique = true)
    private UUID uuid;
    private String displayName;
    private int totalFishCaught;
    private int totalCollectedXP;
    private int totalCommonFishCaught;
    private int totalRareFishCaught;
    private int totalLegendaryFishCaught;
    private int totalMythicalFishCaught;
    private FishingPassData fishingPassData;

    private LocalDateTime initialDataCreationTime;

    public Fisherman(UUID uuid, String displayName, int totalFishCaught, int totalCollectedXP, int totalCommonFishCaught, int totalRareFishCaught, int totalLegendaryFishCaught, int totalMythicalFishCaught, FishingPassData fishingPassData, LocalDateTime initialDataCreationTime) {
        this.uuid = uuid;
        this.displayName = displayName;
        this.totalFishCaught = totalFishCaught;
        this.totalCollectedXP = totalCollectedXP;
        this.totalCommonFishCaught = totalCommonFishCaught;
        this.totalRareFishCaught = totalRareFishCaught;
        this.totalLegendaryFishCaught = totalLegendaryFishCaught;
        this.totalMythicalFishCaught = totalMythicalFishCaught;
        this.fishingPassData = fishingPassData;
        this.initialDataCreationTime = initialDataCreationTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getTotalFishCaught() {
        return totalFishCaught;
    }

    public int getTotalCollectedXP() {
        return totalCollectedXP;
    }

    public int getTotalCommonFishCaught() {
        return totalCommonFishCaught;
    }

    public int getTotalRareFishCaught() {
        return totalRareFishCaught;
    }

    public int getTotalLegendaryFishCaught() {
        return totalLegendaryFishCaught;
    }

    public int getTotalMythicalFishCaught() {
        return totalMythicalFishCaught;
    }

    public FishingPassData getFishingPassData() {
        return fishingPassData;
    }

    public LocalDateTime getInitialDataCreationTime() {
        return initialDataCreationTime;
    }
}
