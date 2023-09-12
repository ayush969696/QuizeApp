package com.example.quizapp;

public class QuestionAnswer {
    public  static  String question[] = {
            "Which company owns the android ?",
            "Which one is not the programing language?",
            "Which of the following is not a programming language?",
            "Which programming language is known for its use in web development and building dynamic websites?",
            "Which loop is ideal for situations where you want to iterate a specific number of times?",
            "Which HTML tag is used to create an unordered list?",
            "What is the keyword used to explicitly throw an exception in Java?",
            "What does the \"href\" attribute in an anchor tag (<a>) specify?",
            "In Java, what is the keyword used to create a new instance of a class?",
            "What is the format specifier for printing an integer variable in C",
            "How do you declare a two-dimensional array in C?",
            "Which access modifier makes a class or member accessible only within its own package?",
            "What keyword is used to declare a variable in JavaScript?",
            "What does the \"typeof\" operator return in JavaScript?",
            "What is the correct way to declare a class in C++?",
    };

    public static  String choices[][] = {
            {"Google", "Apple", "Nokia", "Samsung"},
            {"Java", "Kotlin", "Notepad", "Python"},
            {"Java", "Python", "Html", "SQL"},
            {"c++", "java", "JavaScript", "C#"},
            {"While loop", "For loop", "do-while loop", "repeat-until loop"},
            {"<list>", "<ul>", "<ol>", " <unordered>"},
            {"raise", "throw", "except", "catch"},
            {" The heading for the linked page", "The color of the link text", "The destination URL of the link", "The size of the link text"},
            {"instance", "new", "create", "alloc"},
            {"%s", "%d", " %f", " %c"},
            {" int arr[2][2];", "nt arr[][];", "int arr = new int[2][2];", "int arr(2)(2);"},
            {"public", "private", "protected", " default (package-private)"},
            {"var", "int", "let", "string"},
            {"The data type of a variable", "The size of an array", "The number of properties in an object", "The value of a variable"},
            {"class MyClass { }", "MyClass { }", "new class MyClass { }", "class = MyClass { }"},
    };
    public static String correctAnswer[] = {
            "Google",
            "Notepad",
            "Html",
            "JavaScript",
            "for loop",
            "<ul>",
            "throw",
            "The destination URL of the link",
            "new",
            "%d",
            "int arr[2][2];",
            "default (package-private)",
            "var",
            "The data type of a variable",
            "class MyClass { }",
    };
}
