package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Display.printMessage(String.valueOf(phone.getCharge()));
        phone.drainPhone();
        phone.drainPhone();
        phone.drainPhone();
        phone.drainPhone();
        Display.printMessage(String.valueOf(phone.getCharge()));
        phone.chargePhone();
        phone.chargePhone();
        phone.chargePhone();
        phone.chargePhone();
        phone.chargePhone();
        phone.chargePhone();
        phone.chargePhone();
        Display.printMessage(String.valueOf(phone.getCharge()));
        phone.printFavoriteApp();

        Person person1 = new Person("Bruce Banner", "000001", 30, "Iroda", "Szeged");
        Person person2 = new Person("Bruce Wayne", "000002", 20, "Iroda", "Miskolc");
        Person person3 = new Person("Peter Parker", "000004", 55, "Köztér", "Budapest");
        Person person4 = new Person("Clark Kent", "000005", 31, "Kórház", "Szeged");
        Person person5 = new Person("József Péter", "000007", 15, "Iroda", "Esztergom");

        PhoneApp app1 = new PhoneApp("Szamologep", "Android", "1.0.0.");
        PhoneApp app2 = new PhoneApp("Bongeszo", "Google", "13.4.1234.");

        List<PhoneApp> apps = new ArrayList<>() {{
            add(app1);
            add(app2);
        }};

        Phone phone2 = new Phone(apps);

        phone2.addPerson(person1);
        phone2.addPerson(person2);
        phone2.addPerson(person3);
        phone2.addPerson(person4);
        phone2.addPerson(person5);

        //Filter filter = new Filter(phone2.getPhoneBook());
//        phone2.addApp(filter);

        phone2.addApp(new Filter(phone2.getPhoneBook()));

        phone2.setFavoriteApp(phone2.findAppByName("Filter"));

        phone2.printFavoriteApp();

        //Display.printPersonList(((Filter) phone2.findAppByName("Filter")).getPersonsInAgeRange(25,35));
        Display.printPersonList(((Filter) phone2.findAppByName("Filter")).getPersonsFromGivenWorkplace("Iroda"));

        printAppsThatAreNotFilter(phone2);
    }

    private static void printAppsThatAreNotFilter(Phone phone2) {
        for (PhoneApp app : phone2.getInstalledApps()) {
            if (!app.getName().equals("Filter")) {
                Display.printMessage(app.toString());
            }
        }
    }
}