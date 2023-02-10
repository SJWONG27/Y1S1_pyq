
package Y2020_1;

public class Job {
    private String jobName;
    private int task;
    private int memory;

    public String getJobName() {
        return jobName;
    }

    public int getTask() {
        return task;
    }

    public int getMemory() {
        return memory;
    }

    public Job(String jobName, int task, int memory) {
        this.jobName = jobName;
        this.task = task;
        this.memory = memory;
    }
    @Override
    public String toString(){
        return "Job Name: " + jobName + " Memory = " + memory + " Number of task = " + task;
    }
}
