package Lab06.ex1;

import Lab06.ex2.Displayable;

abstract class Man implements Displayable {
    private String name;
    private String lastname;

    public Man(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public abstract void display();
}