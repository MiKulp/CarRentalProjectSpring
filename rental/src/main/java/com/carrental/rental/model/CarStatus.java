package com.carrental.rental.model;

public enum CarStatus {
    HIRED(false),
    AVAILABLE(true),
    REVIEW(false),
    REPAIR(false);

    private boolean isReady;

    CarStatus(boolean ready) {
        isReady = ready;
    }

    public boolean isStatus() {
        return this.isReady;
    }

}
