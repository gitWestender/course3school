package ru.hogwarts.school.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@Service
public class StudentService {
    private final HashMap<Long, Student> studentMap = new HashMap<>();
    private Long idCounter = 0l;

    public Student createStudent(Student student) {
        student.setId(++idCounter);
        studentMap.put(idCounter, student);
        return student;
    }

    public Student findStudent(Long id) {
        return studentMap.get(id);
    }

    public Student editStudent(Student student) {
        if (studentMap.containsKey(student.getId())) {
            studentMap.put(student.getId(), student);
            return student;
        }
        return null;
    }

    public Student deleteStudent(Long id) {
        return studentMap.remove(id);
    }

    public Collection<Student> findByAge(int age) {
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : studentMap.values()) {
            if (student.getAge() == age) {
                temp.add(student);
            }
        }
        return temp;
    }
}
