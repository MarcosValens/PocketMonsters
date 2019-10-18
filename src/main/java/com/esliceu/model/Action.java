package com.esliceu.model;

public abstract class Action  {
    Types type;
    int power;
    Types debility;

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Types getDebility() {
        return debility;
    }

    public void setDebility(Types debility) {
        this.debility = debility;
    }
}
