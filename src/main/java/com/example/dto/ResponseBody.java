package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody {
    private Long balanceAtStart;
    private Long totalRecord;
    private Long count;
    private List<Transaction> transactions;

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}