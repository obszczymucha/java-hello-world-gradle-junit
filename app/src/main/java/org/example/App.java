package org.example;

import lombok.val;

public class App {
    public String getGreeting(final String who) {
        return String.format("Hello %s!", who == null ? "world" : who);
    }

    public static void main(final String[] args) {
        val who = args.length > 0 ? args[0] : null;
        System.out.println(new App().getGreeting(who));
    }
}
