package com.app.SpringSecurityApp.controllers.dto;

import com.app.SpringSecurityApp.persistence.entity.RoleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record Role(
        Long id,
        @Enumerated(EnumType.STRING)
        RoleEnum roleEnum

) {
}
