package com.hky.GroupactivitiesbyuserId;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Gatherers;
//Scenario:
/*You are building an analytics feature for a social media platform. You track daily user activity: each day a user performs an action (like posting, commenting, or liking), it’s recorded as an activity entry with a user ID and a date.

You want to determine the longest streak of consecutive active days for each user.*/
public class LongestStreakFinder {

    private static Map<String, Integer> longestStreakPerUser1(List<Activity> activities){

        Map<String, List<LocalDate>> userToActivityDates =
                activities.stream()
                        .collect(Collectors.groupingBy(
                                Activity::getUserId,
                                Collectors.mapping(Activity::getDate, Collectors.toList())
                        ));

        Map<String, Integer> result = new HashMap<>();

        userToActivityDates.forEach((userId, activityDates) -> {

            var sortedActivityDates = activityDates.stream()
                    .distinct()
                    .sorted()
                    .toList();

            var maxStreak = sortedActivityDates.stream()

                    .gather(Gatherers.windowSliding(2))

                    .map(pair ->
                            pair.getFirst()
                                    .plusDays(1)
                                    .equals(pair.getLast())
                    )

                    .gather(Gatherers.scan(
                            () -> 1,
                            (streak, isConsecutive) ->
                                    isConsecutive ? streak + 1 : 1
                    ))

                    .max(Integer::compareTo)

                    .orElse(1);

            result.put(userId, maxStreak);

        });

        return result;
    }


    private static Map<String, Integer> longestStreakPerUser(List<Activity> activities){

        Map<String, List<LocalDate>> userToActivityDates =
                activities.stream()
                        .collect(Collectors.groupingBy(
                                Activity::getUserId,
                                Collectors.mapping(Activity::getDate, Collectors.toList())
                        ));

        Map<String, Integer> result = new HashMap<>();

        userToActivityDates.forEach((userId, activityDates) -> {

            var sortedActivityDates = activityDates.stream()
                    .distinct()
                    .sorted()
                    .toList();

            int maxStreak = 1;
            int current = 1;

            for(int i = 1; i < sortedActivityDates.size(); i++){

                LocalDate prev = sortedActivityDates.get(i - 1);
                LocalDate curr = sortedActivityDates.get(i);

                if (curr.equals(prev.plusDays(1))) {

                    current++;

                } else {

                    maxStreak = Math.max(maxStreak, current);
                    current = 1;

                }
            }

            maxStreak = Math.max(maxStreak, current);

            result.put(userId, maxStreak);

        });

        return result;
    }
    public static void main(String[] args) {

        List<Activity> activities = DataSet.getDataSet();

        Map<String, Integer> resultJava8 = longestStreakPerUser(activities);
        Map<String, Integer> resultJava24 = longestStreakPerUser1(activities);

        resultJava8 .forEach((user, streak) ->
                System.out.println(user + " longest streak: " + streak));
        System.out.println("-----------------------------");

        resultJava24 .forEach((user, streak) ->
                System.out.println(user + " longest streak: " + streak));
    }
}