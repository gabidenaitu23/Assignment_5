package com.company;

public class Shaman {
    private String name;
    private int Experience;

    void Sing() {
        System.out.println("Times are coming back\n" +
                "When nights are getting longer\n" +
                "And I can read the promise\n" +
                "In your mind\n" +
                "To yourself again, that you will\n" +
                "Play the strong one\n" +
                "But you burn inside, bleed inside -\n" +
                "And you remain the same!\n" +
                "Someday you'll be gone\n" +
                "Where to, you'll never know...\n" +
                "See you there!");
    }

    public Shaman(String name, int experience) {
        this.name = name;
        Experience = experience;
    }

    void Help() {
        System.out.println("вернуть в физическую реальность");
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "name='" + name + '\'' +
                ", Experience=" + Experience +
                '}';
    }
}
