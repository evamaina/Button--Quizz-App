package com.example;

public class QuestionLibrary {
    private String myQuestions [] = {
            "1.Which of the following is NOT a type of data structure?",
            "2.The following are all data structures EXCEPT?",
            "3.Which of the following is a Search Algorithm?",
            "4.What is the worst-case time complexity for the merge-sort algorithm?",
            "5.All the following are Internet/Web protocols except ",
            "6.Which of the following is NOT a Python web framework?",
            "7.Which of the following core modules is used to create a web server in Node.js?"
    };

    private String myChoices [] [] ={
            {"Integer","Queue","Graph","Tree"},
            {"Char","Linked list","stack","Tree"},
            {"Bubble search","slow search","Binary search","Quick search"},
            {"O(nlogn)","O(n)","O(2)","O(n2)"},
            {"PING","UDP","TCP/IP","HTTP"},
            {"Flask","Django","Numpy","Bottle"},
            {"fs","url","connect","http"}
    };

    private String myCorrectAnaswer [] = {"Integer","Char","Binary search","O(nlogn)","PING","Numpy","http"};

    public String getQuestion(int a) {
        String question = myQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = myChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = myChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = myChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = myChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = myCorrectAnaswer[a];
        return answer;
    }
    public int getLength(){
        return myQuestions.length;}
}
