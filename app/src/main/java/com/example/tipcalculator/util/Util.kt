package com.example.tipcalculator.util

fun calculateTotalTip(
    totalBill: Double, tipPercentage: Int
): Double {
    return if (totalBill > 1 && totalBill.toString().isNotEmpty()) {
        totalBill * (tipPercentage / 100.0)
    } else {
        0.0
    }
}

fun calculateTotalPerPerson(
    totalBill: Double, tipPercentage: Int, splitBy: Int
): Double {
    return if (totalBill > 1 && totalBill.toString().isNotEmpty()) {
        (totalBill + calculateTotalTip(totalBill, tipPercentage)) / splitBy
    } else {
        0.0
    }
}