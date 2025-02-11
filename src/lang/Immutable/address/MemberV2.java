package lang.Immutable.address;

import java.util.Objects;

public class MemberV2 {
    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MemberV2 memberV1 = (MemberV2) o;
        return Objects.equals(name, memberV1.name) && Objects.equals(address, memberV1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
