package epam.tasks.task8.run.task;

import epam.tasks.task5.sequence.Sequence;
import epam.tasks.task8.nondecreasing.sequences.Sequences;

public class Main {
    public static void main(String[] args) {
        Sequences.printLocationInsert(new int[]{1,2,3,3,4,4,5,5,11}, new int[]{-1,3,4,4,5,5,5,6,7,7,9,9,9});
    }
}
