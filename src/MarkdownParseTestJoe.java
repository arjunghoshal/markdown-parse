import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTestJoe {
    @Test
    public void addition() {
        assertEquals(99999999, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("../assets/test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
