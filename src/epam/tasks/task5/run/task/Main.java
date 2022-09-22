package epam.tasks.task5.run.task;

import epam.tasks.task5.sequence.Sequence;
import epam.tasks.task5.sequence.Sequence;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        int A[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
        int n = A.length;
        System.out.println("Length of Longest Increasing Subsequence is " + Sequence.LongestIncreasingSubsequenceLength(A, n));
    }
}
