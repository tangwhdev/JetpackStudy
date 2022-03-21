package com.tangwhdev.room;

import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class StudentRepository {
    StudentDao studentDao;
    public StudentRepository(Context context) {
        studentDao = MyDataBase.getInstance(context).studentDao();
    }

    public LiveData<List<Student>> getAllStudents(){
//        try {
//           return new QueryTask().execute().get();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return null;
        return studentDao.queryAllStudent();
    }

    public void addStudent(Student... students){
       new AddTask().execute(students);
    }

    class AddTask extends AsyncTask<Student,Void,Void> {

        @Override
        protected Void doInBackground(Student... students) {
            studentDao.insertStudent(students);
            return null;
        }
    }

    class QueryTask extends AsyncTask<Void,Void,LiveData<List<Student>>>{
        @Override
        protected LiveData<List<Student>> doInBackground(Void... voids) {
            return studentDao.queryAllStudent();
        }


    }
}
