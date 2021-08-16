package com.cabomaldade.questionsanswers

data class Question(
    val id: Int,
    val title: String,
    val optionOneText: String,
    val optionTwoText: String,
    val optionThreeText: String,
    val optionFourText: String,
)
