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
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://something.com", "some-page.html");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinksBreaking() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/breaking_tests.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://google.com/(())a()shd", "https://something()test()");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://something.com", "some-page.html");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("C:/Users/arjun/Downloads/Work/School/Year 1/Winter 2022/CSE 15L/Labs/Lab 3, 4, 5/markdown-parse/assets/test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("a link on the first line");
        assertEquals(realLinks, links);
    }
}