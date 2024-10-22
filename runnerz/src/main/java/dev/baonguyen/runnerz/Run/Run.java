package dev.baonguyen.runnerz.Run;

import java.time.LocalDateTime;

public record Run(
        int id,
        String title,
        LocalDateTime start,
        LocalDateTime end,
        Double mile,
        Location location
) {
}
