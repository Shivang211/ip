package tasks;

import tasks.Task;

public class Deadline extends Task {

    String time;
    
    public Deadline(String description, String time) {
        super(description);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    @Override
     public String toString() {
         return String.format("[D] %s (by: %s)", super.toString(), time);
     }
    }