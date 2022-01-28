package src;
import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3 and 4/markdown-parse/assets/test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://something.com", "some-page.html");
        assertEquals(realLinks, links);
    }
}