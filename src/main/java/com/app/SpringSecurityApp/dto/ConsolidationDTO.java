package com.app.SpringSecurityApp.dto;

import jakarta.validation.constraints.NotBlank;

public record ConsolidationDTO(Long id,
                               @NotBlank(message = "The first name is required") String firstName,
                               @NotBlank(message = "The last name is required")
                                   String lastName,
                               @NotBlank(message = "The telephone is required")
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
