package com.app.SpringSecurityApp.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="consolidations")
public class ConsolidationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String telephone;
    private String address;
    private int age;
    @Column(name="attend_cell")
    private boolean attendCell;
    @Column(name="call_day")
    private String callDay;
    @Column(name="call_hour")
    private String callHour;
    @Column(name="visit_day")
    private String visitDay;
    @Column(name="visit_hour")
    private String visitHour;
    @Column(name="who_invite")
    private String whoInvite;
    private String Consolidator;
    @Column(name="type_document")
    private String typeDocument;
    @Column(name="number_document")
    private String NumberDocument;
    @Column(name="civil_status")
    private String civilStatus;
    private String petition;
}
