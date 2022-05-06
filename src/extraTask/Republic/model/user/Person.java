package extraTask.Republic.model.user;

import extraTask.Republic.model.area.Address;

public abstract class Person {
    private Integer id;
    private String firstname;
    private String lastname;
    private Address address;

    public Person() {
    }

    public Person(Integer id, String firstname, String lastname, Address address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName(){
        return this.getFirstname() + " " + this.getLastname();
    }
}
