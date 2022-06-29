package ru.netology.FilmManager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmNew {
    private int filmID;
    private String filmName;
}
