package epam.tasks.task8.nondecreasing.sequences;

public class Sequences {
    public static void printLocationInsert(int [] array1, int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            boolean flagIns = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] < array2[j]) {
                    System.out.printf("%d element of the first mass. insert up to %d elem. second\n", i, j);
                    flagIns = false;
                    break;
                }
            }
            if (flagIns)
                System.out.printf("%d element of the first mass. insert after the last elem. second\n", i);
        }
    }
}
