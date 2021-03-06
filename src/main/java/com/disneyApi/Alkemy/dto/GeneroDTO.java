
package com.disneyApi.Alkemy.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneroDTO {

    private Long id;
    private String name;
    private String image;
    private List<FilmDTO> listFilms = new ArrayList<>();

}
