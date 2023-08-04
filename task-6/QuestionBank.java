public class QuestionBank {
    private String questionTitle, question, createdBy;

    public QuestionBank() {
    }

    public QuestionBank(String questionTitle, String question, String createdBy) {
        this.questionTitle = questionTitle;
        this.question = question;
        this.createdBy = createdBy;
    }

    public String toString() {
        return "\nQuestion Title: " + questionTitle + ",\nQuestion: " + question + ",\nCreated By: " + createdBy;
    }
}
