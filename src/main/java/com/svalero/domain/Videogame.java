package com.svalero.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Videogame {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private LocalDate releaseDate;
    @NonNull
    private double price;
    //TODO LO SIGUIENTE HAY QUE MAPEARLO EN EL MAPPER TAMBIÉN
//    @NonNull
//    private List<Order> orders;
}
