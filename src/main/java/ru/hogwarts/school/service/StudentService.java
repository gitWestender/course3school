package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.HashMap;

public class StudentService {
    private HashMap<Long, Student> studentMap;
    private Long idCounter = 0l;
}
