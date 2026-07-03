package dev.engripaye.software.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequest(
        @NotBlank
        String firstName,

        @NotBlank
        String lastName,

        @Email
        String email,

        @NotBlank
        String password
) {
}
