package us.azurius.fishingapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import us.azurius.fishingapi.data.Fisherman;
import us.azurius.fishingapi.data.FishingPassData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class FishingAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishingAPIApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(FishermanRepository fishermanRepository, MongoTemplate mongoTemplate) {
		return args -> {
			Fisherman fisherman = new Fisherman(
					UUID.fromString("969f4549-e061-48dc-89b9-231d2425c6f7"),
					"Tintae",
					932,
					123012,
					1,
					1,
					0,
					3,
					new FishingPassData(
					LocalDateTime.now(),
					LocalDateTime.now().plusDays(1),
					1
			),
					LocalDateTime.now()
			);

			UUID uuid = UUID.fromString("969f4549-e061-48dc-89b9-231d2425c6f7");

			Query query = new Query();
			query.addCriteria(Criteria.where("uuid").is(uuid));

			List<Fisherman> fishermen = mongoTemplate.find(query, Fisherman.class);

			if (fishermen.size() == 0) {
				fishermanRepository.save(fisherman);
			}

		};
	}
}
