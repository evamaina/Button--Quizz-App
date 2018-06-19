

package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.QuestionLibrary;


public class QuizActivity extends AppCompatActivity {
    private QuestionLibrary myQuestionLibrary = new QuestionLibrary();

    private TextView myScoreView;
    private TextView myQuestionView;
    private Button myButtonChoice1;
    private Button myButtonChoice2;
    private Button myButtonChoice3;
    private Button myButtonChoice4;

    private String myAnswer;
    private int myScore = 0;
    private int myQuestionNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        myScoreView = (TextView) findViewById(R.id.score);
        myQuestionView = (TextView) findViewById(R.id.question);
        myButtonChoice1 = (Button) findViewById(R.id.choice1);
        myButtonChoice2 = (Button) findViewById(R.id.choice2);
        myButtonChoice3 = (Button) findViewById(R.id.choice3);
        myButtonChoice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();

        // start of button listener for button1
        myButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myButtonChoice1.getText() == myAnswer) {
                    myScore = myScore + 1;
                    updateScore(myScore);
                    updateQuestion();

                    // toasts correct or wrong if the user get the question correct or wrong
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }


        });

        // End of button listener for button1

        // start of button listener for button2
        myButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myButtonChoice2.getText() == myAnswer) {
                    myScore = myScore + 1;
                    updateScore(myScore);
                    updateQuestion();

                    // toasts correct or wrong if the user get the question correct or wrong
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }


        });

        // End of button listener for button2

        // start of button listener for button3
        myButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myButtonChoice3.getText() == myAnswer) {
                    myScore = myScore + 1;
                    updateScore(myScore);
                    updateQuestion();

                    // toasts correct or wrong if the user get the question correct or wrong
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }

        });

        // End of button listener for button3

        // start of button listener for button4
        myButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myButtonChoice4.getText() == myAnswer) {
                    myScore = myScore + 1;
                    updateScore(myScore);
                    updateQuestion();

                    // toasts correct or wrong if the user get the question correct or wrong
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }

        });

        // End of button listener for button4
    }
    private void updateQuestion(){
        if (myQuestionNumber < myQuestionLibrary.getLength()) {
            myQuestionView.setText(myQuestionLibrary.getQuestion(myQuestionNumber));
            myButtonChoice1.setText(myQuestionLibrary.getChoice1(myQuestionNumber));
            myButtonChoice2.setText(myQuestionLibrary.getChoice2(myQuestionNumber));
            myButtonChoice3.setText(myQuestionLibrary.getChoice3(myQuestionNumber));
            myButtonChoice4.setText(myQuestionLibrary.getChoice4(myQuestionNumber));

        myAnswer = myQuestionLibrary.getCorrectAnswer(myQuestionNumber);
        myQuestionNumber++;

        }else {
            Toast.makeText(QuizActivity.this, "Quiz is Over", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateScore(int point) {
        myScoreView.setText("" + myScore);
        }

    }


