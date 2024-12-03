package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;

//Класс для теста метода flatMap
class Faculty {
    String name;
    List<Student> stdOnFaculty;

    public Faculty(String name) {
        this.name = name;
        stdOnFaculty = new ArrayList<>();
    }

    public List<Student> getStdOnFaculty() {
        return stdOnFaculty;
    }

    public void addStdToFaculty(Student st) {
        stdOnFaculty.add(st);
    }
}
