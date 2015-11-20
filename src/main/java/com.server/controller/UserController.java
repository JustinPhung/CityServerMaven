package com.server.controller;

import com.server.entities.AppUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by jp on 05.11.15.
 */
@Stateless
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;



    public AppUser getUser( int userId) {

        TypedQuery<AppUser> query = entityManager.createNamedQuery( AppUser.GET, AppUser.class );
        query.setParameter("id", userId);
        AppUser appUser = query.getSingleResult();
        return appUser;

    }

    public List<AppUser> getAllUser() {
        TypedQuery<AppUser> query = entityManager.createNamedQuery( AppUser.GETALL, AppUser.class);
        List<AppUser> userList = query.getResultList();

        return  userList;
    }

    public AppUser getUserByDeviceId(String deviceId) {

        TypedQuery<AppUser> query = entityManager.createNamedQuery( AppUser.GETBYDEVICEID, AppUser.class );
        query.setParameter("deviceId", deviceId);
        AppUser appUser = query.getSingleResult();
        return appUser;


    }
}
