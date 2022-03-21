package com.tangwhdev.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.List;

public class RepositoryActivity extends AppCompatActivity {
    StudentViewModel studentViewModel;
    RepAdapter repAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);

        studentViewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()))
                .get(StudentViewModel.class);
        studentViewModel.getAllStudent().observe(this, new Observer<List<Student>>() {
            @Override
            public void onChanged(List<Student> students) {
                repAdapter.setList(students);
            }
        });

        repAdapter = new RepAdapter(studentViewModel.getAllStudent().getValue());
        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setAdapter(repAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    int i = 10;
    public void add(View view) {
        i++;
        studentViewModel.addStudent(new Student("name"+i,i+10));
    }
}