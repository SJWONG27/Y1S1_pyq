
package Y2017_1;

public class Essay extends GradedActivity {
    protected int grammar;
    protected int spelling;
    protected int length;
    protected int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    
    @Override
    public String toString(){
        return "Essay score: \nGrammar: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content ;
    }
}
