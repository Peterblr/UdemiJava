package com.javaforbeginner;

import java.time.LocalDateTime;

public class MainDateOut {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        System.out.printf("today: %1$tD%ntime now: %1$tT%n%1$tA%n", time);
        System.out.printf("%1$th%n", time);
        System.out.printf("%1$tB%n", time);
    }
}
