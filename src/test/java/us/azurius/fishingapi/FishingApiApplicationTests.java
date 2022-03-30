package us.azurius.fishingapi;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
@AllArgsConstructor
class FishingApiApplicationTests {


	FishermanService service;

	@Test
	void contextLoads() {
		boolean b = service.existsInDatabase(UUID.fromString("969f4549-e061-48dc-89b9-231d2425c6f7"));
		if (b) {
			System.out.println("Tintae exists in database!");
		}

	}


}
