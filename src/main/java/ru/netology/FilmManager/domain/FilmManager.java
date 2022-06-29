package ru.netology.FilmManager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmManager {
    private int maxLength = 10;

    public FilmManager (int maxLength) {
        this.maxLength = maxLength;
        this.repository = repository;
    }
    private FilmRepository repository;
    public FilmManager(FilmRepository repository) {
        this.repository = repository;
    }

    public void add(FilmNew film) {
        repository.save(film);
    }

    public FilmNew[] findAllForward(){
        FilmNew[] films = repository.findAll();
        FilmNew[] result = new FilmNew [films.length];
        return result;
    }

    public FilmNew[] findAllBack(int maxLength){
        FilmNew[] films = repository.findAll();
        FilmNew[] result = new FilmNew [films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - 1 - 1;
            result[i] = films[index];
        }
        return result;
    }
}
