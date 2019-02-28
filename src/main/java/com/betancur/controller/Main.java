/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.controller;

import com.betancur.dao.hibernateImpl.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class Main {
    public static void main(String[] args) {
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        
        new GestorDeInscripcion(sf).run();
    }
}
