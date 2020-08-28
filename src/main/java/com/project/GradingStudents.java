package com.project;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /**
     * https://www.hackerrank.com/challenges/grading/problem
     */
    public List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList();
        for (Integer grade: grades.subList(1, grades.size())) {
            if (grade >= 38) {
                int roundGrade = 5 - (grade % 5);
                if (roundGrade < 3) {
                    grade += roundGrade;
                }
            }
            result.add(grade);
        }
        return result;
    }
}
