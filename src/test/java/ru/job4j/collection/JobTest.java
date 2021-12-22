package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpPriorityName.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void ascendingName() {
        List<Job> jobs = Arrays.asList(
                new Job("Task", 0),
                new Job("Fix", 1),
                new Job("Exit", 2)
        );
        jobs.sort(new JobAscByName());
        List<Job> expected = Arrays.asList(
                new Job("Exit", 2),
                new Job("Fix", 1),
                new Job("Task", 0)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void ascendingPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Task", 0),
                new Job("Fix", 1),
                new Job("Exit", 2)
        );
        jobs.sort(new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Task", 0),
                new Job("Fix", 1),
                new Job("Exit", 2)
        );
        assertThat(jobs, is(expected));
    }

        @Test
        public void descendingName() {
            List<Job> jobs = Arrays.asList(
                    new Job("Task",0),
                    new Job("Fix", 1),
                    new Job("Exit", 2)
            );
            jobs.sort(new JobDescByName());
            List<Job> expected = Arrays.asList(
                    new Job("Task",0),
                    new Job("Fix", 1),
                    new Job("Exit", 2)
            );
            assertThat(jobs, is(expected));
    }
    @Test
    public void descendingPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Task", 0),
                new Job("Fix", 1),
                new Job("Exit", 2)
        );
        jobs.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Exit", 2),
                new Job("Fix", 1),
                new Job("Task", 0)
        );
        assertThat(jobs, is(expected));
    }
}