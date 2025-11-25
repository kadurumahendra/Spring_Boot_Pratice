package SpringBootAppConfigurationProperties.Task2;

public class Owner {

    private String ownerName;
    private long mobile;

    public Owner() {}

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Owner [ownerName=" + ownerName + ", mobile=" + mobile + "]";
    }
}
