package com.mycompany.fideairlines.Server.Utils;

public enum Category {
    FIRST_CLASS("Primera Clase"),
    BUSINESS("Clase Business"),
    ECONOMY("Clase Turista");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
