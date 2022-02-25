import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    
    @Test
    public void snippetTest1() throws IOException {
        assertEquals(List.of("url.com", "`google.com", "google.com"), MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
    }

    @Test
    public void snippetTest2() throws IOException {
        assertEquals(List.of("b.com", "a.com(())"), MarkdownParse.getLinks(Files.readString(Path.of("snippet2.md"))));
    }

    @Test
    public void snippetTest3() throws IOException {
        ArrayList<String> emptyList = new ArrayList<>();
        assertEquals(emptyList, MarkdownParse.getLinks(Files.readString(Path.of("snippet3.md"))));

    }

    
}