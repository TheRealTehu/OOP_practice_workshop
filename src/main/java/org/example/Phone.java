package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private int charge;
    private final int MAX_CHARGE_LEVEL = 100;
    private final int MIN_CHARGE_LEVEL = 0;
    private List<PhoneApp> installedApps;
    private PhoneApp favoriteApp;
    private List<Person> phoneBook;

    public Phone() {
        charge = MAX_CHARGE_LEVEL;
        installedApps = new ArrayList<>();
        phoneBook = new ArrayList<>();
    }

    public Phone(List<PhoneApp> installedApps) {
        this.installedApps = installedApps;
        charge = MAX_CHARGE_LEVEL;
        phoneBook = new ArrayList<>();
    }

    public int getCharge() {
        return charge;
    }

    public List<Person> getPhoneBook() {
        return phoneBook;
    }

    public void chargePhone() {
        if (charge < MAX_CHARGE_LEVEL) {
            charge++;
        }
    }

    public void drainPhone() {
        if (charge > MIN_CHARGE_LEVEL) {
            charge--;
        }
    }

    public void addApp(PhoneApp app) {
        if (!installedApps.contains(app)) {
            installedApps.add(app);
        }
    }

    public void removeApp(PhoneApp app) {
        installedApps.remove(app);
    }

    public void showInstalledApps() {
        for (PhoneApp app: installedApps) {
            Display.printMessage(app.toString());
        }
        Display.printMessage("Number of currently installed apps: " + installedApps.size());
    }

    public void printFavoriteApp(){
        if(favoriteApp == null){
            Display.printMessage("We don't have a favorite app yet!");
        } else {
            Display.printMessage(favoriteApp.toString());
        }
    }

    public void setFavoriteApp(PhoneApp favoriteApp) {
        this.favoriteApp = favoriteApp;
    }

    public void addPerson(Person person){
        if(!phoneBook.contains(person)){
            phoneBook.add(person);
        }
    }

    public void removePerson(Person person){
        phoneBook.remove(person);
    }

    public PhoneApp findAppByName(String name){
        for (PhoneApp app: installedApps) {
            if(app.getName().equals(name)){
                return app;
            }
        }
        return null;
    }

    public List<PhoneApp> getInstalledApps() {
        return installedApps;
    }

    public void showPhoneBook() {
        for (Person person: phoneBook) {
            Display.printMessage(person.toString());
        }
        Display.printMessage("Number of people in the phonebook: " + phoneBook.size());
    }
}
