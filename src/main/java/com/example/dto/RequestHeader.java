package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestHeader {
    private String requestClient;
    private String requestId;
    private Long requestRetryCount;
    private String requestSource;
    private String requestSourceService;
    private String requestTime;
    private Long requestTimeoutInSeconds;
    private String requestType;
    private String requestVersion;
    private String traceId;

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}