import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @Test
    public void personCanAddProblemsToHisListOfProblemsTest() {
        Person simon = new Person();
        Problem alex = new Problem("schoolFee", Type.FINANCIAL);
        simon.addProblems(alex);
        assertEquals(1, simon.recountedProblems().size());
    }

    @Test
    public void personCanSolveProblemsToHisListOfProblemsTest() {
        Person simon = new Person();
        Problem prob1 = new Problem("schoolFee", Type.FINANCIAL);
        Problem prob2 = new Problem("profitLoss", Type.BUSINESS);
        Problem prob3 = new Problem("Iliteracy", Type.EDUCATION);
        simon.addProblems(prob1);
        simon.addProblems(prob2);
        simon.addProblems(prob3);
        assertEquals(3, simon.recountedProblems().size());
        simon.solvedProblems(prob3);
        assertEquals(2, simon.recountedProblems().size());
    }

    @Test
    public void TestTheProblemPersonWantToSolveExist() {
        Person simon = new Person();
        Problem prob1 = new Problem("schoolFee", Type.FINANCIAL);
        Problem prob2 = new Problem("profitLoss", Type.BUSINESS);
        Problem prob3 = new Problem("Iliteracy", Type.EDUCATION);
        simon.addProblems(prob1);
        simon.addProblems(prob2);
        simon.addProblems(prob3);
        assertEquals(3, simon.recountedProblems().size());
        simon.solvedProblems(prob3);
        assertEquals(2, simon.recountedProblems().size());
    }
    /*@Test
    public void TestTheProblemExist_elseThrowException(){
        Person simon = new Person();
        Problem prob1 = new Problem("schoolFee",Type.FINANCIAL);
        Problem prob2 = new Problem("profitLoss",Type.BUSINESS);
        Problem prob3 = new Problem("illiteracy",Type.EDUCATION);
        simon.addProblems(prob1);
        simon.addProblems(prob2);
        simon.addProblems(prob3);
        assertEquals(3,simon.recountedProblems().size());
        simon.solvedProblems(prob3);
        assertEquals(2,simon.recountedProblems().size());*/

}


