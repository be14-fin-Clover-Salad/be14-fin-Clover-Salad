package com.clover.salad.salesDashboard.query.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SalesMonthlyTrendResponseDTO {
	private final int year;
	private final int month;
	private final int totalAmount;
}
