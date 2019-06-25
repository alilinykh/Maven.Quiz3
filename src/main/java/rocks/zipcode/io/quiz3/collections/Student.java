package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> list;

    public Student() {
        list = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.list = labs;
    }

    public Lab getLab(String labName) {

            for (Lab l: list
                 ) {
                if (l.getName().equals(labName)) {
                    return l;
                }
            }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab l = getLab(labName);
        if (l == null) {
            throw new UnsupportedOperationException();
        }
        l.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        list.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

            for (Lab l : list) {
                if (l.getName().equals(labName)) {
                    return l.getStatus();
                }
            }
        return null;
    }

    @Override
    public String toString() {
        String string = "";
        for (Lab lab: list
             ) {
            string += lab.getName() + " > " + lab.getStatus() + "\n";
        }
        return string.trim();
    }
}
