package com.app.SpringSecurityApp.dto;

import jakarta.validation.constraints.NotBlank;

public record ConsolidationRequest(Long id,
                                   @NotBlank(message = "{NotBlank.firstname}") String firstName,
                                   @NotBlank(message = "{NotBlank.lastname}")
                                   String lastName,
                                   @NotBlank(message = "{NotBlank.telephone}")
                                   String telephone,
                                   @NotBlank(message = "{NotBlank.address}")
                                   String address,
                                   int age,
                                   boolean attendCell,
                                   String callDay,
                                   String callHour,
                                   String visitDay,
                                   String visitHour,
                                   String whoInvite,
                                   String Consolidator,
                                   String typeDocument,
                                   String NumberDocument,
                                   String civilStatus,
                                   String petition) {
}
