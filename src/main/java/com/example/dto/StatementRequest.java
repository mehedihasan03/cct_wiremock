package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatementRequest {
    private RequestHeader header;
    private RequestBody body;
    private Map<String, String> meta = new HashMap<>();

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}
