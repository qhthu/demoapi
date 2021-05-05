package com.example.demo;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class dictionary {
    @Id @GeneratedValue
    private Integer id;
    private String vi;
    private String en;
    
    public dictionary(Integer id, String vi, String en) {
        this.id = id;
        this.vi = vi;
        this.en = en;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
