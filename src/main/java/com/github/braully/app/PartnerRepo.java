/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.braully.app;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author braully
 */
@Repository
public class PartnerRepo {

    @Autowired
    GenericDAO genericDAO;

    public List searchPartner() {
        List list = null;        
        return list;
    }
}
