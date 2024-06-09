package br.com.rafaelmuzzi.springbatch.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	public static String convertStringArrayToJson(String[] stringArray) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(stringArray);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
