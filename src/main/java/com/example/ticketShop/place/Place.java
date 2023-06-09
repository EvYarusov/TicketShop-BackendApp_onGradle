package com.example.ticketShop.place;

import com.example.ticketShop.artist.Artist;
import com.example.ticketShop.event.Event;
import com.example.ticketShop.genre.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "places")
public class Place
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String city;

    @OneToMany(mappedBy = "place")
    private List<Event> events;

    @ManyToMany(mappedBy = "places")
    private List<Artist> artists;

}
