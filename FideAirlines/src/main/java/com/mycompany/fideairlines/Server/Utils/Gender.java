package com.mycompany.fideairlines.Server.Utils;

public enum Gender {
    MALE("Masculino"),
    FEMALE("Femenino"),
    OTHER("Otro");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}