package org.example;

public class PhoneApp {
    private String name;
    private String developer;
    private String version;

    public PhoneApp(String name, String developer, String version) {
        this.name = name;
        this.developer = developer;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return name + " " + version;
    }
}
