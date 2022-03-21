package com.tangwhdev.room;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {
    StudentRepository studentRepository;


    public StudentViewModel(@NonNull Application application) {
        super(application);
        studentRepository = new StudentRepository(application);
    }

    public LiveData<List<Student>>  getAllStudent(){
        return studentRepository.getAllStudents();
    }

    public void addStudent(Student student){
         studentRepository.addStudent(student);
    }
}
