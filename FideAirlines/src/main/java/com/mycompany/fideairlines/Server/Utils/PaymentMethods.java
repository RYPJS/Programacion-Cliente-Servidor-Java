/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fideairlines.Server.Utils;

public enum PaymentMethods {
    CREDIT_CARD("Tarjeta de crédito"),
    DEBIT_CARD("Tarjeta de débito"),
    CASH("Pago en efectivo");

    private final String methodName;

    PaymentMethods(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}