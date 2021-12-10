package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void duplicate() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenDuplicate = new Citizen("2f44a", "Ivan Zolo");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizenDuplicate);
        assertThat(office.get("2f44a").getUsername(), is("Petr Arsentev"));
    }
}