package entities;

import java.util.Random;

public class Customer {
    private Random rdm = new Random();
    private long id = rdm.nextLong(10000, 99999999);
    private String name;
    private Integer tier;

    //costruttore

    public Customer(String name, Integer tier) {
        this.name = name;
        this.tier = tier;
    }
    //to string

    @Override
    public String toString() {
        return "Customer{" +
                "rdm=" + rdm +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }


    //getter e setter

    public Random getRdm() {
        return rdm;
    }

    public void setRdm(Random rdm) {
        this.rdm = rdm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }
}
