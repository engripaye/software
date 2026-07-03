package dev.engripaye.software.user;

public record UserResponse(
        Long id,

        String firstName,

        String lastName,

        String email
) {
}
