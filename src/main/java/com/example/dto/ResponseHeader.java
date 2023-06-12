package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHeader {
    private String requestId;
    private String requestReceivedTime;
    private String responseCode;
    private String responseMessage;
    private Long responseProcessingTimeInMs;
    private String responseTime;
    private String responseVersion;
    private String traceId;
    private Long hopCount;

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}