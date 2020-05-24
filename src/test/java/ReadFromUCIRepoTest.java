import org.junit.jupiter.api.Test;

public class ReadFromUCIRepoTest {
    @Test
    public void test() throws Exception{
//        String[] args = null;
//        String[] args = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/adult/adult.data"};
        String[] args = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data"};
//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        ReadFromUCIRepo.main(args);
    }
}
