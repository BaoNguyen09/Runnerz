package dev.baonguyen.runnerz.Run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime start,
        LocalDateTime end,
        @Positive
        Double miles,
        Location location
) {

//    public Run {
//        if (end() == null || start() == null) {
//            throw new IllegalArgumentException("start and end can't be null");
//        } else if (!end().isAfter(start())) {
//            throw new IllegalArgumentException("end must be after start");
//        }
//    }

}
