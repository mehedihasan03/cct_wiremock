package com.example.dto;

import com.google.gson.GsonBuilder;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private Long sl;
    private String transactionDate;
    private Long debitAmount;
    private Long creditAmount;
    private String transactionCode;
    private String referenceNo;
    private String chequeNo;
    private String narrative;


    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this);
    }
}