import org.junit.jupiter.api.Test;

public class AwsUploaderTest {
    @Test
    public void test(){
        AwsUploader uploader = new AwsUploader();
        uploader.uploadFile("test","./src/main/resources/test.csv");
    }
}
