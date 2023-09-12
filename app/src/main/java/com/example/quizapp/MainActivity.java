package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    int score = 0;
    int totalQuestion = QuestionAnswer.question.length;
    int  currentIndex = 0;
    String selectedAnser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionTextView = findViewById(R.id.total_questions);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionTextView.setText("Total Questions : " + totalQuestion);

        loadnewQuesiton();

    }

    // whatever button will clicl it will show here
    @Override
    public void onClick(View v) {

        Button cliclButton = (Button) v;
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        if(cliclButton.getId() == R.id.submit_btn){
            if(selectedAnser.equals(QuestionAnswer.correctAnswer[currentIndex])){
                score++;        // answer is correct than increase the score
            }
            // load next Question
            currentIndex++;
            loadnewQuesiton();
        }
        else {
            // choices button clicked
            selectedAnser = cliclButton.getText().toString();
            cliclButton.setBackgroundColor(Color.MAGENTA);
        }
    }

    void loadnewQuesiton(){

        if(currentIndex == totalQuestion){
            finishQuize();
            return;
        }

        questionTextView.setText(QuestionAnswer.question[currentIndex]);   //  laoding the question on screen
        ansA.setText(QuestionAnswer.choices[currentIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentIndex][3]);

    }

    void  finishQuize(){
        String passingScore = "";
        if(score > totalQuestion*0.60){
            passingScore = "Passed";
        } else {
            passingScore = "Failed";
        }

       new AlertDialog.Builder(this)
               .setTitle(passingScore)
               .setMessage("Your Score is " + score + " out of " + totalQuestion)
               .setPositiveButton("Restart", ((dialog, which) -> restaQuize()))
               .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       finish();
                   }
               })
               .setCancelable(false)
               .show();
    }

    void  restaQuize(){
        score = 0;
        currentIndex = 0;
        loadnewQuesiton();
    }
}