package us.azurius.fishingapi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import us.azurius.fishingapi.data.Fisherman;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class FishermanService {

    private final FishermanRepository fishermanRepository;

    public List<Fisherman> getAllFisherman() {
        return fishermanRepository.findAll();
    }

    public Fisherman getFisherman(UUID uuid) {
        Optional<Fisherman> fishermanByUuid = fishermanRepository.findFishermanByUuid(uuid);
        if (fishermanByUuid.isEmpty()) return null;
        return fishermanByUuid.get();
    }

    /**
     * Returns whether a given uuid string fisherman is present in the database.
     * @param uuid
     * @return
     */
    public boolean existsInDatabase(UUID uuid) {
        Optional<Fisherman> fishermanByUuid = fishermanRepository.findFishermanByUuid(uuid);
        return fishermanByUuid.isPresent();
    }

    public void saveToDatabase(Fisherman fisherman) {
        if (existsInDatabase(fisherman.getUuid())) {

        }
        fishermanRepository.save(fisherman);
    }


}
