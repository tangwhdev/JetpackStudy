package com.tangwhdev.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void insertStudent(Student... students);

    @Delete
    void deleteStudent(Student student);

    @Update
    void updateStudent(Student student);

    @Query("select * from Student where id = :id")
    List<Student> queryStudent(int id);

    @Query("select * from Student")
    LiveData<List<Student>> queryAllStudent();
}
