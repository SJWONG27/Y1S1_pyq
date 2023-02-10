
package Y2017_1;

public class GradedActivity {
    protected int score;
    protected char grade;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public int getScore(int a, int b, int c, int d){
        score = a+b+c+d;
        if(score >=90)
            return grade = 'A';
        else if (score>= 80)
            return grade='B';
        else if (score>=70)
            return grade='C';
        else if (score>=60)
            return grade='D';
        else if (score< 60)
            return grade ='F';
        return score;
    }
    @Override
    public String toString(){
        return "Total score: " + score + "\nEssay grade: " + grade;
    }
}
