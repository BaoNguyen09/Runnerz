package dev.baonguyen.runnerz.Run;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

public enum Location {
    OUTDOOR,
    INDOOR;

    public static class RunRepository {

        private List<Run> runs = new ArrayList<>();

        List<Run> findAll() {
            return runs;
        }

        @PostConstruct
        private void init() {
            runs.add(new Run (

            ));
        }

    }
}
