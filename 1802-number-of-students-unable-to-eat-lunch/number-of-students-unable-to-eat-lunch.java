import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        ArrayList<Integer> student = new ArrayList<>();
        ArrayList<Integer> sandwiche = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            student.add(students[i]);
        }

        for (int i = 0; i < sandwiches.length; i++) {
            sandwiche.add(sandwiches[i]);
        }

        int count = 0;

        while (student.size() != 0 && count < student.size()) {

            if (student.get(0).equals(sandwiche.get(0))) {
                student.remove(0);
                sandwiche.remove(0);
                count = 0;
            } else {
                int temp = student.remove(0);
                student.add(temp);
                count++;
            }
        }

        return student.size();
    }
}
