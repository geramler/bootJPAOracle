/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oracle.entitiy;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Gerardo
 */
@Entity
@Table(name = "myTable")
public class MyEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "mySeqGen", sequenceName = "myDbSeq", initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(generator = "mySeqGen")
    private int myId;

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

}
