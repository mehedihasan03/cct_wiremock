package com.example.controller;

import com.example.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mock")
public class MockApiController {

    @PostMapping(value = "/statement", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Mono<StatementResponse> getStatement(@org.springframework.web.bind.annotation.RequestHeader("Authorization") String authorizationHeader, @RequestBody StatementRequest request) {
        String expectedBearerToken = "af821abf-f6ea-4ef4-996b-3cd49ceebbac";
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ") || !authorizationHeader.substring(7).equals(expectedBearerToken)) {
            throw new RuntimeException("Invalid or missing authorization token");
        }

        // Perform mock processing
        StatementResponse response = new StatementResponse();
        response.setHeader(createResponseHeader(request.getHeader()));
        response.setMeta(request.getMeta());
        response.setBody(createResponseBody(authorizationHeader));

        return Mono.just(response);
    }

    private ResponseHeader createResponseHeader(RequestHeader requestHeader) {
        ResponseHeader responseHeader = new ResponseHeader();
        responseHeader.setRequestId(requestHeader.getRequestId());
        responseHeader.setRequestReceivedTime(requestHeader.getRequestTime());
        responseHeader.setResponseCode("200");
        responseHeader.setResponseMessage("CBS Response found");
        responseHeader.setResponseProcessingTimeInMs(273L);
        responseHeader.setResponseTime("2017-01-17T07:02:08.638Z");
        responseHeader.setResponseVersion("1.0");
        responseHeader.setTraceId(requestHeader.getTraceId());
        responseHeader.setHopCount(0L);

        return responseHeader;
    }

    private ResponseBody createResponseBody(String authorizationHeader) {
        ResponseBody responseBody = new ResponseBody();

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(
                Transaction.builder()
                        .sl(1L)
                        .transactionDate("2017-01-17")
                        .debitAmount(4300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(2L)
                        .transactionDate("2017-01-17")
                        .debitAmount(1000L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(3L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(900L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(4L)
                        .transactionDate("2017-01-17")
                        .debitAmount(300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(5L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(400L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(6L)
                        .transactionDate("2017-01-17")
                        .debitAmount(500L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(7L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(8L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(100L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(9L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(800L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(10L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(300L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(11L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(12L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(600L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(13L)
                        .transactionDate("2017-01-17")
                        .debitAmount(4300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(14L)
                        .transactionDate("2017-01-17")
                        .debitAmount(1000L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(15L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(900L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(16L)
                        .transactionDate("2017-01-17")
                        .debitAmount(300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(17L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(400L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(18L)
                        .transactionDate("2017-01-17")
                        .debitAmount(500L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(19L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(20L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(100L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(21L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(800L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(22L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(300L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(23L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(24L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(600L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );transactions.add(
                Transaction.builder()
                        .sl(25L)
                        .transactionDate("2017-01-17")
                        .debitAmount(4300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(26L)
                        .transactionDate("2017-01-17")
                        .debitAmount(1000L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(27L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(900L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(28L)
                        .transactionDate("2017-01-17")
                        .debitAmount(300L)
                        .creditAmount(0L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(29L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(400L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(30L)
                        .transactionDate("2017-01-17")
                        .debitAmount(500L)
                        .creditAmount(0L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(31L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );        transactions.add(
                Transaction.builder()
                        .sl(32L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(100L)
                        .transactionCode("940")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(33L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(800L)
                        .transactionCode("947")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(34L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(300L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(35L)
                        .transactionDate("2017-01-17")
                        .debitAmount(700L)
                        .creditAmount(0L)
                        .transactionCode("946")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );
        transactions.add(
                Transaction.builder()
                        .sl(36L)
                        .transactionDate("2017-01-17")
                        .debitAmount(0L)
                        .creditAmount(600L)
                        .transactionCode("945")
                        .referenceNo("FT16111YCMZ1")
                        .chequeNo("234567890")
                        .narrative("D CHG-DOER Card")
                        .build()
        );

        responseBody.setTransactions(transactions); // Initialize the transactions list
        responseBody.setBalanceAtStart((long) transactions.size());
        responseBody.setTotalRecord(580L);
        responseBody.setCount(10L);
        return responseBody;
    }


}
