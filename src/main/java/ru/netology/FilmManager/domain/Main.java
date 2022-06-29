package ru.netology.FilmManager.domain;

public class Main {
    public static void main(String[] args) {
        FilmNew first = new FilmNew( 1 , "First");
        FilmNew second = new FilmNew(2 ,"Second");
        FilmNew third = new FilmNew( 3 , "Third");

//        FilmRepository repo = new FilmRepository();
//        repo.save(first);
//        repo.save(second);
//        repo.save(third);

        FilmRepository repo = new FilmRepository();
        FilmManager manager = new FilmManager(repo);


    }
}
