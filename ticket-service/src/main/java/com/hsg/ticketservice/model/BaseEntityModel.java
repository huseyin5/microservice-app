package com.hsg.ticketservice.model;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntityModel implements Serializable {

    @CreatedDate
    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
