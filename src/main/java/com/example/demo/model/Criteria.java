package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import java.util.Map;

public abstract class Criteria {
    protected static final ObjectMapper MAPPER = new ObjectMapper();

    public Criteria() {
    }

    public Map<String, Object> toMap() {
        return (Map)MAPPER.convertValue(this, Map.class);
    }

}
