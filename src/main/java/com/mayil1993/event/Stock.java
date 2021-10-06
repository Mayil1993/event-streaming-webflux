package com.mayil1993.event;

import java.math.BigDecimal;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    String symbol;
    String name;
    BigDecimal currentPrice;
    long lastUpdated;
}