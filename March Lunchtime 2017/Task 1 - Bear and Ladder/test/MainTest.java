import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void main() throws Exception {
        String inputPath = "/Users/dinesh/workspace/cp-sample/March Lunchtime 2017/Task 1 - Bear and Ladder/resources/Input0.txt";
        String outputPath = "/Users/dinesh/workspace/cp-sample/March Lunchtime 2017/Task 1 - Bear and Ladder/resources/Output0.txt";
        assertTrue(FileUtils.contentEquals(new File(outputPath), new File(outputPath)));
    }

}