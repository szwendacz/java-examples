// &&(AND), ||(OR), !(NOT)

public class IfElse{
    public static void main(String[] args){
        if (2 > 1) {
        System.out.println("2 is greater than 1");
        }
        int goal = 20;
        if (goal < 18) {
        System.out.println("Prawda.");
        } else {
        System.out.println("Falsz.");
        }

        int score = 87;
        char grade;
        if (score > 85 && score <=100) {
            grade = 'A'; 
        }
        else if (score >70 && score <85)
            grade = 'B';
        else if (score >50 && score <70)
            grade = 'C';
        else if (score >= 35 && score < 50)
            grade = 'D';
        else
            grade = 'F';
        System.out.println(grade);    
    }
}