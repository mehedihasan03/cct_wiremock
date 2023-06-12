package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestBody {
    private String branchOid;
    private String bankAccountNo;
    private String fromDate;
    private String toDate;
    private Long offset;
    private Long limit;

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}