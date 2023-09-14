package com.example.quizapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var totalQuestionsTextView:TextView
    private lateinit var questionTextView:TextView
    private lateinit var ansA:Button
    private lateinit var ansB:Button
    private lateinit var ansC:Button
    private lateinit var ansD:Button
    private lateinit var submitBtn:Button
    var score = 0
    var totalQuestion = QuestionAnswer.question.size
    var currentQuestionIndex = 0
    var selectedAnswer = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);
        ansA.setOnClickListener(this)
        ansB.setOnClickListener(this)
        ansC.setOnClickListener(this)
        ansD.setOnClickListener(this)
        submitBtn.setOnClickListener(this)
        totalQuestionsTextView.setText("Total questions : "+totalQuestion);

        loadNewQuestion();
    }

    override fun onClick(p0: View?) {
        ansA.setBackgroundColor(Color.WHITE)
        ansB.setBackgroundColor(Color.WHITE)
        ansC.setBackgroundColor(Color.WHITE)
        ansD.setBackgroundColor(Color.WHITE)
        val clickedButton = p0 as Button
        if (clickedButton.id == R.id.submit_btn) {
            if (selectedAnswer == QuestionAnswer.correctAnswers[currentQuestionIndex]) {
                score++
            }
            currentQuestionIndex++
            loadNewQuestion()
        } else {
            selectedAnswer = clickedButton.text.toString()
            clickedButton.setBackgroundColor(Color.GRAY)
        }
    }
    fun loadNewQuestion() {
        if (currentQuestionIndex == totalQuestion) {
            finishQuiz()
            return
        }
        questionTextView.text = QuestionAnswer.question[currentQuestionIndex]
        ansA.text = QuestionAnswer.choices[currentQuestionIndex][0]
        ansB.text = QuestionAnswer.choices[currentQuestionIndex][1]
        ansC.text = QuestionAnswer.choices[currentQuestionIndex][2]
        ansD.text = QuestionAnswer.choices[currentQuestionIndex][3]
    }

    fun finishQuiz() {
        var passStatus = ""
        if (score > totalQuestion * 0.60) {
            passStatus = "Passed"
        } else {
            passStatus = "Failed"
        }
        AlertDialog.Builder(this)
            .setTitle(passStatus)
            .setMessage("Score is $score out of $totalQuestion")
            .setPositiveButton("Restart") { dialogInterface, i ->
                restartQuiz()
            }
            .setCancelable(false)
            .show()


    }
    fun restartQuiz() {
        score = 0
        currentQuestionIndex = 0
        loadNewQuestion()
    }

}