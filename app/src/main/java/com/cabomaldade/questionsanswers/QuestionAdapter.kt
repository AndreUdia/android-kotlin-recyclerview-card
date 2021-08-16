package com.cabomaldade.questionsanswers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.question_card.view.*

class QuestionAdapter(private val dataSet: List<Question>) :
    RecyclerView.Adapter<QuestionAdapter.ViewHolder>() {

    class ViewHolder(itenView: View) : RecyclerView.ViewHolder(itenView)

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.question_card, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val question = dataSet[position]
        with(holder.itemView) {
            tv_title.text = question.title
            rbtn_option_one.text = question.optionOneText
            rbtn_option_two.text = question.optionTwoText
            rbtn_option_three.text = question.optionThreeText
            rbtn_option_four.text = question.optionFourText
            btn_answer.setOnClickListener {
                println("TODO")
            }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
