import org.junit.jupiter.api.Test;

public class ReadFromUCIRepoTest {
    @Test
    public void test() throws Exception{
//        String[] args = null;
        String[] args = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/adult/"};
//        String[] args = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/iris"};
        ReadFromUCIRepo.main(args);
    }
}
