package com.server.controller;

import com.server.entities.Event;
import com.server.entities.Location;

import javax.ejb.Stateless;

/**
 * Created by jp on 02.11.15.
 */
@Stateless
public class TagController {

    public Location[] getNextLocations( int id, int userId, int locationNum ) {
        return new Location[ 0 ];
    }



    public Location[] getNextLocations( int id, int userId, int postNum, int lastPostId ) {
        return new Location[ 0 ];
    }



    public Event[] getNextPosts( int tagid, int userId, int postNum, int lastPostId ) {
        return new Event[0];
    }



    public Event[] getNextPosts( int id, int userId, int postNum ) {
        return new Event[ 0 ];
    }
}
