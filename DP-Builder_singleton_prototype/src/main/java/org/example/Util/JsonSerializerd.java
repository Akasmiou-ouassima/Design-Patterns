package org.example.Util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializerd <T>{
    public String toJson(T object){
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);

        }catch (JsonProcessingException e){
            throw  new RuntimeException(e);
        }

    }
}
