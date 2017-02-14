import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 54167208T on 07/02/2017.
 */
public class BallBlower {
    private List<Integer> numbers = new ArrayList<>();

    public BallBlower(){
        for (int i = 0; i < 10 ; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
    }
    public Integer deliveredNumbers(){

        return numbers.remove(numbers.size()-1);
    }

    public boolean numbersLeft(){

        return numbers.isEmpty();
    }
}
