package ru.netology.FilmManager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmNew first = new FilmNew( 1 , "First");
    FilmNew second = new FilmNew( 2 ,"Second");
    FilmNew third = new FilmNew( 3 , "Third");

    @Test
    public void managerSave(){
        FilmRepository repo = new FilmRepository();
        FilmManager manager = new FilmManager(repo);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        FilmNew[] actual = manager.findAllForward();
        FilmNew[] expected = {first , second , third };
        Assertions.assertArrayEquals(expected, actual);
    }

}
