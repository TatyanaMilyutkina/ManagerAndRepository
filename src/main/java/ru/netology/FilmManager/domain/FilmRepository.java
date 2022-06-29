package ru.netology.FilmManager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class FilmRepository {
    private FilmNew[] films = new FilmNew[0];
    private int filmID;
    private String filmName;

//Метов Save - сохраняет фильм:
    public void save(FilmNew film) {
        int length = films.length + 1;
        FilmNew[] tmp = new FilmNew[length];
        System.arraycopy(films , 0,tmp , 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }
// Метод FindAll - показывает все добавленные фильмы:
    public FilmNew[] findAll() {return films; }

//Метод findLast - показывает n последних добавленных фильмов в обратном порядке:
    public void findLast() {

    }
}
