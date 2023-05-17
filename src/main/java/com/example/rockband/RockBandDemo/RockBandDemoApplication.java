package com.example.rockband.RockBandDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.RockBand;
import com.fasterxml.jackson.core.type.TypeReference;

@SpringBootApplication
public class RockBandDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RockBandDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<RockBand>> typeReference = new TypeReference<List<RockBand>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/data/venues.json");
			try {
				List<RockBand> rockbandList = mapper.readValue(inputStream, typeReference);

				List<RockBand> rockBandListNew = rockbandList.stream().filter(p -> p.getCapacity() <= 15000
						&& p.getCapacity() > 0 && p.getMinimum_tour_duration_in_days() <= 3)
						.collect(Collectors.toList());
				rockBandListNew.sort(new MyCapacitySort());
				for (RockBand rockband : rockBandListNew) {
					LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
					linkedHashMap.put(rockband.getCity(), rockband.getId());
					System.out.println(linkedHashMap);
				}

			} catch (IOException e) {
				System.out.println("exception: " + e.getMessage());
			}
		};
	}

}
