package ntu.hung.bai4_flashquiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionDatabase {
    public static List<Question> getQuestions() {
        System.out.println("Loading Questions...");
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("2+3=?", null, "0", "6", "7", "5", "5"));
        questions.add(new Question("Đất nước ở bên trong hình là gì?", "Pic.png", "Việt Nam", "Campuchia", "Lào", "Thái Lan", "Việt Nam"));
        questions.add(new Question("Thủ đô của Pháp là?", null, "Paris", "Rome", "Berlin", "Madrid", "Paris"));
        questions.add(new Question("5 * 6 = ?", null, "11", "30", "42", "28", "30"));
        questions.add(new Question("Hành tinh nào lớn nhất trong hệ mặt trời", null, "Mars", "Venus", "Jupiter", "Saturn", "Jupiter"));
        questions.add(new Question("Ngôn ngữ nào được biết đến (viết một lần, chạy khắp nơi", null, "C", "Python", "Java", "C++", "Java"));
        questions.add(new Question("Căn bậc 2 của 64?", null, "6", "7", "8", "9", "8"));
        questions.add(new Question("Ai đã vẽ Mona Lisa?", null, "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet", "Leonardo da Vinci"));
        questions.add(new Question("Ký tự hóa học cho nước là ?", null, "O2", "H2", "H2O", "HO2", "H2O"));
        questions.add(new Question("Đất nước ở bên trong hình là gì??", "country.png", "India", "Brazil", "Australia", "Canada", "Australia"));

        // Add more questions here

        System.out.println("Questions Loaded: " + questions.size());
        return questions;
    }
}
