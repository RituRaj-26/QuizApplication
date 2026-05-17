// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.util.Scanner;

// public class QuizApp {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int score = 0;
//         int totalQuestions = 0;

//         try {

//             // Database Connection
//             Connection con = DBConnection.getConnection();

//             // SQL Query
//             String query = "SELECT * FROM questions";

//             // Prepared Statement
//             PreparedStatement ps = con.prepareStatement(query);

//             // Execute Query
//             ResultSet rs = ps.executeQuery();

//             System.out.println("\n==============================");
//             System.out.println("      JAVA QUIZ SYSTEM");
//             System.out.println("==============================");

//             // Fetch Questions
//             while (rs.next()) {

//                 totalQuestions++;

//                 int id = rs.getInt("id");

//                 String question = rs.getString("question");

//                 String option1 = rs.getString("option1");

//                 String option2 = rs.getString("option2");

//                 String option3 = rs.getString("option3");

//                 String option4 = rs.getString("option4");

//                 int correctAnswer =
//                         rs.getInt("correct_answer");

//                 // Display Question
//                 System.out.println("\nQuestion " + id + ":");
//                 System.out.println(question);

//                 System.out.println("1. " + option1);
//                 System.out.println("2. " + option2);
//                 System.out.println("3. " + option3);
//                 System.out.println("4. " + option4);

//                 int userAnswer;

//                 while (true) {

//                     System.out.print("Enter Your Answer (1-4): ");

//                     if (sc.hasNextInt()) {

//                         userAnswer = sc.nextInt();

//                         if (userAnswer >= 1 &&
//                                 userAnswer <= 4) {

//                             break;

//                         } else {

//                             System.out.println(
//                               "Please enter between 1 and 4");
//                         }

//                     } else {

//                         System.out.println(
//                           "Invalid Input! Enter number only.");

//                         sc.next();
//                     }
//                 }

//                 // Check Answer
//                 if (userAnswer == correctAnswer) {

//                     System.out.println(
//                       "Correct Answer!");

//                     score++;

//                 } else {

//                     System.out.println(
//                       "Wrong Answer!");

//                     System.out.println(
//                       "Correct Option: "
//                       + correctAnswer);
//                 }
//             }

//             // Final Result
//             System.out.println("\n==============================");
//             System.out.println("          RESULT");
//             System.out.println("==============================");

//             System.out.println(
//               "Total Questions : "
//               + totalQuestions);

//             System.out.println(
//               "Correct Answers : "
//               + score);

//             System.out.println(
//               "Wrong Answers   : "
//               + (totalQuestions - score));

//             double percentage =
//                     ((double) score / totalQuestions) * 100;

//             System.out.println(
//               "Percentage      : "
//               + percentage + "%");

//             // Performance
//             if (percentage >= 80) {

//                 System.out.println("Grade : Excellent");

//             } else if (percentage >= 60) {

//                 System.out.println("Grade : Good");

//             } else if (percentage >= 40) {

//                 System.out.println("Grade : Average");

//             } else {

//                 System.out.println("Grade : Poor");
//             }

//             // Close Resources
//             rs.close();
//             ps.close();
//             con.close();
//             sc.close();

//             System.out.println("\nQuiz Completed!");

//         } catch (Exception e) {

//             e.printStackTrace();
//         }
//     }
// }
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        // ADD QUESTIONS HERE

        // Question 1
        System.out.println("Question 1:");
        System.out.println("What is Java?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Browser");
        System.out.println("4. Operating System");
        System.out.print("Enter Your Answer (1-4): ");

        int ans1 = sc.nextInt();

        if(ans1 == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        // Question 2
        System.out.println("\nQuestion 2:");
        System.out.println("Who developed Java?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");
        System.out.print("Enter Your Answer (1-4): ");

        int ans2 = sc.nextInt();

        if(ans2 == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        // Final Score
        System.out.println("\nFinal Score: " + score);

        sc.close();
    }
}