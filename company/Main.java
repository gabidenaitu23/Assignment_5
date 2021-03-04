package com.company;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SpirituallyMovable SpirituallyMovable = new SpirituallyMovable() {
            @Override
            public void Icaros_singing() {
                System.out.println("I woke today\n" +
                        "Inside the train of dreams\n" +
                        "the rain poured down in black and white\n" +
                        "I stood and stared\n" +
                        "the rest of what remains\n" +
                        "My own world crumbling around");
            }
        };
        final Shaman Shaman1 = Shaman.class.getConstructor(String.class, int.class).newInstance("Saanomah",25);
        System.out.println(Shaman1);
        final User User1 = User.class.getConstructor(String.class, int.class).newInstance("Alvarez",3);
        System.out.println(User1);
    }
}
