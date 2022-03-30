package us.azurius.fishingapi;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import us.azurius.fishingapi.data.Fisherman;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class FishermanController {

    // The Fisherman service allowing us to navigate the database.
    private final FishermanService fishermanService;

    /**
     * Returns all fisherman information the database currently houses.
     * @return
     */
    @GetMapping("/api/v1/fishermans")
    public List<Fisherman> fetchAllFisherman() {
        return fishermanService.getAllFisherman();
    }

    /**
     * Returns the Fisherman Information from UUID given in url.
     * @param uuid
     * @return
     */
    @GetMapping("/api/v1/fisherman/{uuid}")
    public Fisherman fetchFisherman(@PathVariable String uuid) {
        UUID u = UUID.fromString(uuid);

        return fishermanService.getFisherman(u);
    }


}
