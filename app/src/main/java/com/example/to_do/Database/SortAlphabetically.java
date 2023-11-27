package com.example.to_do.Database;

import java.util.Comparator;

public class SortAlphabetically implements Comparator<TaskItem>
    {
        // Used for sorting in ascending order of
        // roll number

        @Override
        public int compare(TaskItem taskItem, TaskItem t1) {
            return (taskItem.getName().compareTo(t1.getName()));
        }

    }