package timB.constructors.c1;

public class VipPerson {
    private String name;
    private double creditlimit;
    private String emailAddress;

    public VipPerson(String name, double creditlimit, String emailAddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailAddress = emailAddress;
    }

    public VipPerson(String name, double creditlimit) {
        this(name,creditlimit,"em@em.com");
    }

    public VipPerson() {
        this("Default name", 500000, "dm@gm.com");
    }
}
