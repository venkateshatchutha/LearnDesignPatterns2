package Creational.singleton;

public enum singletonenum {
    instance;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    }
