package com.tangwhdev.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDesc  = findViewById(R.id.tvDesc);
    }

    public void add(View view) {

        Student student = new Student(1,"jack",11);
        new AddTask().execute(student);
    }

    class AddTask extends AsyncTask<Student,Void,Void>{

        @Override
        protected Void doInBackground(Student... students) {
            MyDataBase.getInstance(MainActivity.this).studentDao().insertStudent(students);
            return null;
        }
    }

    public void delete(View view) {
        Student student = new Student(1,"jack",11);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                MyDataBase.getInstance(MainActivity.this).studentDao().deleteStudent(student);
            }
        });

    }

    public void update(View view) {
        Student student = new Student(1,"jack12",12);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                MyDataBase.getInstance(MainActivity.this).studentDao().updateStudent(student);
            }
        });

    }

    public void query(View view) {
        new QueryTask().execute(1);

    }

    class QueryTask extends AsyncTask<Integer,Void,List<Student>>{


        @Override
        protected List<Student> doInBackground(Integer... integers) {
           List<Student> list =  MyDataBase.getInstance(MainActivity.this).studentDao().queryStudent(integers[0]);
           return list;

        }

        @Override
        protected void onPostExecute(List<Student> students) {
            StringBuffer sb = new StringBuffer();
            for (Student student : students) {
                sb.append(student.toString()).append(";");
            }
            tvDesc.setText(sb.toString());
        }
    }
}