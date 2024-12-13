package ntu.hung.bai4_flashquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.List;

public class Controller
{
    @FXML
    private TextField questionField;
    @FXML
    private Button optionA;
    @FXML
    private Button optionB;
    @FXML
    private Button optionC;
    @FXML
    private Button optionD;
    @FXML
    private TextField scoreField;

    @FXML
    private Button question2Button;

    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    public void initialize()
    {

        System.out.println("Controller initialized!");
        questions = QuestionDatabase.getQuestions(); // Load questions
        System.out.println("Total Questions Available: " + questions.size());
        loadQuestion(); // Load the first question
    }

    private void loadQuestion()
    {
        if (currentQuestionIndex < questions.size())
        {
            Question question = questions.get(currentQuestionIndex);
            System.out.println("Loading Question " + (currentQuestionIndex + 1) + ": " + question.getQuestionText());

            questionField.setText(question.getQuestionText());
            optionA.setText(question.getOptionA());
            optionB.setText(question.getOptionB());
            optionC.setText(question.getOptionC());
            optionD.setText(question.getOptionD());

            resetOptionStyles(); // Reset button styles for the new question
            enableOptions(true); // Enable answer buttons
        }
        else
        {
            System.out.println("Quiz Completed!");
            questionField.setText("Quiz Completed! Your score: " + score + "/" + questions.size());
            disableOptions();
        }
    }

    private void resetOptionStyles()
    {
        optionA.setStyle("-fx-border-color: #FFFFC5; -fx-background-color: transparent;");
        optionB.setStyle("-fx-border-color: #FFFFC5; -fx-background-color: transparent;");
        optionC.setStyle("-fx-border-color: #FFFFC5; -fx-background-color: transparent;");
        optionD.setStyle("-fx-border-color: #FFFFC5; -fx-background-color: transparent;");
    }

    private void enableOptions(boolean enable)
    {
        optionA.setDisable(!enable);
        optionB.setDisable(!enable);
        optionC.setDisable(!enable);
        optionD.setDisable(!enable);
    }

    private void disableOptions()
    {
        enableOptions(false); // Disable all answer buttons
    }

    private void checkAnswer(String selectedAnswer, Button selectedButton)
    {
        System.out.println("Selected Answer: " + selectedAnswer);
        Question currentQuestion = questions.get(currentQuestionIndex);

        if (currentQuestion.getCorrectAnswer().equals(selectedAnswer))
        {
            System.out.println("Correct Answer!");
            selectedButton.setStyle("-fx-border-color: green; -fx-background-color: #C8E6C9;"); // Highlight in green
            score++;
            scoreField.setText("Score: " + score);
        }
        else
        {
            System.out.println("Wrong Answer. Correct was: " + currentQuestion.getCorrectAnswer());
            selectedButton.setStyle("-fx-border-color: red; -fx-background-color: #FFCDD2;"); // Highlight in red

            // Highlight the correct answer
            highlightCorrectAnswer(currentQuestion);
        }

        // Disable buttons after an answer is selected
        enableOptions(false);

        // Move to the next question after a delay
        new Thread(() ->
        {
            try
            {
                Thread.sleep(2000); // 2-second delay
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            currentQuestionIndex++;
            loadQuestion();
        }).start();
    }

    private void highlightCorrectAnswer(Question currentQuestion)
    {
        if (currentQuestion.getCorrectAnswer().equals(optionA.getText()))
        {
            optionA.setStyle("-fx-border-color: green; -fx-background-color: #C8E6C9;");
        }
        else if (currentQuestion.getCorrectAnswer().equals(optionB.getText()))
        {
            optionB.setStyle("-fx-border-color: green; -fx-background-color: #C8E6C9;");
        }
        else if (currentQuestion.getCorrectAnswer().equals(optionC.getText()))
        {
            optionC.setStyle("-fx-border-color: green; -fx-background-color: #C8E6C9;");
        }
        else if (currentQuestion.getCorrectAnswer().equals(optionD.getText()))
        {
            optionD.setStyle("-fx-border-color: green; -fx-background-color: #C8E6C9;");
        }
    }

    @FXML
    private void handleOptionA()
    {
        System.out.println("Option A clicked.");
        checkAnswer(optionA.getText(), optionA);
    }

    @FXML
    private void handleOptionB()
    {
        System.out.println("Option B clicked.");
        checkAnswer(optionB.getText(), optionB);
    }

    @FXML
    private void handleOptionC()
    {
        System.out.println("Option C clicked.");
        checkAnswer(optionC.getText(), optionC);
    }

    @FXML
    private void handleOptionD()
    {
        System.out.println("Option D clicked.");
        checkAnswer(optionD.getText(), optionD);
    }

    @FXML
    private void handleQuestion2()
    {
        System.out.println("Câu 2 button clicked.");
        currentQuestionIndex += 1; // Set to the index of the second question
        loadQuestion(); // Reload the question
    }
}
