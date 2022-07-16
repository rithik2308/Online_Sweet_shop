package com.capemini.sweet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tableadmin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long AdminId;
    private String username;
    private String password;
    
}