package ntu.hung.bai4_flashquiz;

public class Question {
    private String questionText;
    private String image; // File path to an image or null if no image is provided
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;

    public Question(String questionText, String image, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        System.out.println("Initializing Question: " + questionText);
        this.questionText = questionText;
        this.image = image;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getImage() {
        return image;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
