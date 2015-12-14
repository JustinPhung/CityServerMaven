package com.server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Created by jp on 02.11.15.
 */


@NamedQueries( {
        @NamedQuery( name = LocationEntity.GETALL, query = "SELECT l FROM Location l " ),
        @NamedQuery( name = LocationEntity.GET, query = "SELECT l FROM Location l WHERE l.id = :id  " ),
        @NamedQuery( name = LocationEntity.GETCITYLOCATIONS, query = "SELECT l FROM Location l WHERE l.cityId = :cityId" ),
        @NamedQuery( name = LocationEntity.GETBYNAME, query = "SELECT l FROM Location l WHERE l.name = :name" )
} )
@Entity
public class LocationEntity {


    public static final String GETALL           = "Location.getAll";
    public static final String GET              = "Location.get";
    public static final String GETCITYLOCATIONS = "Location.getCityLocations";
    public static final String GETBYNAME        = "Locaiton.getByName";


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    private String name;

    @ManyToOne( optional = false )
    private CityEntity cityEntity;

    private String street;

    private String phoneNumber;

    private int likes;

    private String GPS;

    private String description;

    private String houseNumber;



    public static String getGETALL() {
        return GETALL;
    }



    public static String getGET() {
        return GET;
    }



    public int getId() {
        return id;
    }



    public void setId( int id ) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName( String name ) {
        this.name = name;
    }



    public CityEntity getCityEntity() {
        return cityEntity;
    }



    public void setCityEntity( CityEntity cityEntity ) {
        this.cityEntity = cityEntity;
    }



    public String getStreet() {
        return street;
    }



    public void setStreet( String street ) {
        this.street = street;
    }



    public String getHouseNumber() {
        return houseNumber;
    }



    public void setHouseNumber( String houseNumber ) {
        this.houseNumber = houseNumber;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }



    public int getLikes() {
        return likes;
    }



    public void setLikes( int likes ) {
        this.likes = likes;
    }



    public String getGPS() {
        return GPS;
    }



    public void setGPS( String GPS ) {
        this.GPS = GPS;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription( String description ) {
        this.description = description;
    }
}
