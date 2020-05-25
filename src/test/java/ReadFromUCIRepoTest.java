import org.junit.jupiter.api.Test;

public class ReadFromUCIRepoTest {
    @Test
    public void test() throws Exception{
//        String[] args = null;
        ReadFromUCIRepo handler = new ReadFromUCIRepo();

        String[] args1 = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/adult/adult.data"};
        handler.createFiles(args1);

        String[] args2 = new String [] {"https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data"};
        String irisCols = "sepal_length,sepal_width,petal_length,petal_width,species";
        handler.setColnames(irisCols);
        handler.createFiles(args2);

    }
}
