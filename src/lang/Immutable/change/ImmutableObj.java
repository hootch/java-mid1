package lang.Immutable.change;

import lang.Immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public ImmutableObj(int value) {
        this.value = value;
    }
}
