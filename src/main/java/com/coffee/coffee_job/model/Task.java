package com.coffee.coffee_job.model;

import com.coffee.coffee_job.model.enums.TaskStatus;
import com.coffee.coffee_job.model.enums.TaskType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    private String title;
    private String description;
    private String author;
    private String tecnician;
    private TaskStatus taskStatus;
    private Date openDate;
    private TaskType taskType;
}
