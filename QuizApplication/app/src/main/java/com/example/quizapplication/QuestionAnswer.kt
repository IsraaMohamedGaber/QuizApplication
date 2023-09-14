package com.example.quizapplication

class QuestionAnswer {
    companion object {
        val question = arrayOf(
            "1. Kotlin was developed by?",
            "2. Kotlin is a statically-typed programming language which runs on the",
            "3. feature allows removing the risk of occurrence of NullPointerException in real time",
            "4. Kotlin is interoperable with Java because it uses JVM bytecode.",
            "5. Does Kotlin support primitive Datatypes?",
            "6. Which of the following is true about Kotlin?",
            "7. What is the main advantage of using Kotlin over Java?",
            "8. Which of the following is a feature of Kotlin?",
            "9. Which of the following is true about Kotlin’s null safety?",
            "10. Which of the following is true about Kotlin’s type system?"
        )
        val choices = arrayOf(
            arrayOf("IBM", "NetBeans", "JetBrains", "Oracle"),
            arrayOf("JCM", "JVM", "JPM", "JDM"),
            arrayOf("Null Risk", "Null Safety", "Pointer", "All of the above"),
            arrayOf("Yes", "NO", "Can be yes or no", "Can not say"),
            arrayOf("Yes", "NO", "Can be yes or no", "Can not say"),
            arrayOf("It is a functional programming language","It is an object-oriented programming language","It is a procedural programming language","It is a scripting language"),
            arrayOf("Better performance","Better memory management","More concise syntax","Better support for multi-threading"),
            arrayOf("Checked exceptions","Null pointer exceptions"," Extension functions","Multiple inheritance"),
            arrayOf("Kotlin does not allow null values","Kotlin uses the ! operator to denote nullability","Kotlin uses the ? operator to denote nullability","Kotlin uses the ?? operator to denote nullability"),
            arrayOf("Kotlin’s type system is similar to Java’s","Kotlin’s type system is more strict than Java’s","Kotlin’s type system is less strict than Java’s"," Kotlin’s type system does not allow inheritance")
        )
        val correctAnswers = arrayOf(
            "JetBrains",
            "JVM",
            "Null Safety",
            "Yes",
            "NO",
            "It is an object-oriented programming language",
            "More concise syntax",
            " Extension functions",
            "Kotlin uses the ? operator to denote nullability",
            "Kotlin’s type system is more strict than Java’s"
        )
    }
}