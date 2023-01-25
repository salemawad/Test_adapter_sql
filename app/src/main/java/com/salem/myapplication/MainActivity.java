package com.salem.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.salem.myapplication.adapter.StudentAdapter;
import com.salem.myapplication.databinding.ActivityMainBinding;
import com.salem.myapplication.model.Student;
import com.salem.myapplication.satabase.DatabaseAdapter;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students  = new ArrayList<>();
    StudentAdapter studentAdapter;



    ActivityMainBinding binding;

    DatabaseAdapter databaseAdapter ;
    private RecyclerView rvStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      rvStudent  = findViewById(R.id.rvStudent);


        databaseAdapter = new DatabaseAdapter(this);


        students.add(new Student("Ahmed" , "https://upload.wikimedia.org/wikipedia/commons/a/a0/Pierre-Person.jpg"));
       students.add(new Student("Mohammed" , "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png"));
       students.add(new Student("Sabri" , "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png"));
        students.add(new Student("Ali" , "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png"));
        students.add(new Student("Salah" , "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png"));





        studentAdapter = new StudentAdapter(students);
        rvStudent.setLayoutManager(new LinearLayoutManager(this));
        rvStudent.setAdapter(studentAdapter);

        

       

    }
}