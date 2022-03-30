package us.azurius.fishingapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import us.azurius.fishingapi.data.Fisherman;

import java.util.Optional;
import java.util.UUID;

public interface FishermanRepository extends MongoRepository<Fisherman, UUID> {
    Optional<Fisherman> findFishermanByUuid(UUID uuid);

    Optional<Fisherman> findFishermanByDisplayName(String displayName);
}
