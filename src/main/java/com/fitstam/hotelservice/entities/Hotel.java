package com.fitstam.hotelservice.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="hotels")
public class Hotel {
    @Id
    @Column(name="hotelid")
    private String hotelId;
    @Column(name="hotelname")
    private String hotelName;
    @Column(name="location")
    private String location;
    @Column(name="about")
    private String about;
}
