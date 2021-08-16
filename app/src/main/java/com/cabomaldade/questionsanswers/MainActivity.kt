package com.cabomaldade.questionsanswers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: QuestionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfQuestions: List<Question> = getQuestionsList() // dumb data - will came from database

        val recyclerView: RecyclerView =  rv_questionnaire

        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = QuestionAdapter(listOfQuestions)
        recyclerView.adapter = adapter
    }

    fun openCard(view: View) {}
}