package utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.RockBand;

public class MapperUtil {

	private static final ObjectMapper objectMapper = new ObjectMapper();

    public static RockBand deserializeRockBand(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, RockBand.class);
    }
}
