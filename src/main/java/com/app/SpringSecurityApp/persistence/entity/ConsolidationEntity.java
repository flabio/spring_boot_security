package com.app.SpringSecurityApp.persistence.entity;

import jakarta.persistence.*;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="consolidations")
public class ConsolidationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAttendCell() {
        return attendCell;
    }

    public void setAttendCell(boolean attendCell) {
        this.attendCell = attendCell;
    }

    public String getCallDay() {
        return callDay;
    }

    public void setCallDay(String callDay) {
        this.callDay = callDay;
    }

    public String getCallHour() {
        return callHour;
    }

    public void setCallHour(String callHour) {
        this.callHour = callHour;
    }

    public String getVisitDay() {
        return visitDay;
    }

    public void setVisitDay(String visitDay) {
        this.visitDay = visitDay;
    }

    public String getVisitHour() {
        return visitHour;
    }

    public void setVisitHour(String visitHour) {
        this.visitHour = visitHour;
    }

    public String getWhoInvite() {
        return whoInvite;
    }

    public void setWhoInvite(String whoInvite) {
        this.whoInvite = whoInvite;
    }

    public String getConsolidator() {
        return Consolidator;
    }

    public void setConsolidator(String consolidator) {
        Consolidator = consolidator;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return NumberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        NumberDocument = numberDocument;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getPetition() {
        return petition;
    }

    public void setPetition(String petition) {
        this.petition = petition;
    }
}
