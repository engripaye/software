package dev.engripaye.software.auth;

public record AuthResponse(
        String token,

        String tokenType
) {
}
