package cmo.hky.GroupactivitiesbyuserId;

import java.time.LocalDate;
import java.util.List;

public class DataSet {


    public static List<Activity> getDataSet() {
        return List.of(

                // ----- User u1 -----
                new Activity("u1", LocalDate.of(2025, 1, 1)),
                new Activity("u1", LocalDate.of(2025, 1, 2)),
                new Activity("u1", LocalDate.of(2025, 1, 3)),
                new Activity("u1", LocalDate.of(2025, 1, 5)),  // break in streak
                new Activity("u1", LocalDate.of(2025, 1, 6)),
                new Activity("u1", LocalDate.of(2025, 1, 7)),
                new Activity("u1", LocalDate.of(2025, 2, 1)),  // new month streak starts
                new Activity("u1", LocalDate.of(2025, 2, 2)),

                // ----- User u2 -----
                new Activity("u2", LocalDate.of(2025, 1, 10)),
                new Activity("u2", LocalDate.of(2025, 1, 11)),
                new Activity("u2", LocalDate.of(2025, 1, 12)),
                new Activity("u2", LocalDate.of(2025, 1, 14)), // break
                new Activity("u2", LocalDate.of(2025, 1, 15)),
                new Activity("u2", LocalDate.of(2025, 1, 16)),
                new Activity("u2", LocalDate.of(2025, 2, 1)),
                new Activity("u2", LocalDate.of(2025, 2, 2)),
                new Activity("u2", LocalDate.of(2025, 2, 3)),

                // ----- User u3 -----
                new Activity("u3", LocalDate.of(2024, 12, 29)),
                new Activity("u3", LocalDate.of(2024, 12, 30)),
                new Activity("u3", LocalDate.of(2024, 12, 31)),
                new Activity("u3", LocalDate.of(2025, 1, 1)), // crosses year boundary
                new Activity("u3", LocalDate.of(2025, 1, 2)),
                new Activity("u3", LocalDate.of(2025, 1, 4)), // break

                // ----- User u4: duplicates & scattered -----
                new Activity("u4", LocalDate.of(2025, 3, 10)),
                new Activity("u4", LocalDate.of(2025, 3, 10)), // duplicate
                new Activity("u4", LocalDate.of(2025, 3, 12)),

                // ----- User u5: single day only -----
                new Activity("u5", LocalDate.of(2025, 5, 20)),

                // ----- User u6: long perfect streak -----
                new Activity("u6", LocalDate.of(2025, 4, 1)),
                new Activity("u6", LocalDate.of(2025, 4, 2)),
                new Activity("u6", LocalDate.of(2025, 4, 3)),
                new Activity("u6", LocalDate.of(2025, 4, 4)),
                new Activity("u6", LocalDate.of(2025, 4, 5)),
                new Activity("u6", LocalDate.of(2025, 4, 6)),
                new Activity("u6", LocalDate.of(2025, 4, 7)),
                new Activity("u6", LocalDate.of(2025, 4, 8)),
                new Activity("u6", LocalDate.of(2025, 4, 9)),
                new Activity("u6", LocalDate.of(2025, 4, 10))

        );
    }
}
