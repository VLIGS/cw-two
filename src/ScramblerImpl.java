import java.util.HashSet;
import java.util.Set;

public class ScramblerImpl implements  Scrambler{
    @Override
    public Line scramble(Line input) {
        /**
        int size = input.numberOfPegs();
        RandomGenerator randomGenerator = new RandomGeneratorImpl();//Spring
        Line output = new LineImpl(); //Spring
        Set<Integer> usedNumbers = new HashSet<>();
        int random = randomGenerator.generateRandomNumber(size);
        for(int i = 0; i < size; i ++){
            while (usedNumbers.contains(random)) {
                random = randomGenerator.generateRandomNumber(size);
            }
            output.addPeg(input.getPeg(random));
            usedNumbers.add(random);
        }
        return output;
         **/
        int size = input.numberOfPegs();
        /**
         * spring
         */
        Line output = new LineImpl();
        Set<Integer> usedNumbers = new HashSet<>();
        int random = (int)(Math.random()*size);
        for(int i = 0; i < size; i ++){
            while (usedNumbers.contains(random)) {
                random = (int)(Math.random()*size);
            }
            output.addPeg(input.getPeg(random));
            usedNumbers.add(random);
        }
        return output;
    }
}
