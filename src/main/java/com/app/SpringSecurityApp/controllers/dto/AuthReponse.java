package com.app.SpringSecurityApp.controllers.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"username","message","jwt","status"})
public record AuthReponse(String username,String message, String jwt, boolean status) {
}
