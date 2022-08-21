import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class CSVPrinterTest {
    static Iterable<CSVRecord> it;
    @AfterAll
    public static void read() throws IOException {
        CSVPrinter printer = new CSVPrinter("sample.csv");
        it = printer.read();
        System.out.println(1);
    }
    @Test
    public void testReadFile() throws IOException {
        CSVPrinter printer = new CSVPrinter("sample.csv");
        Iterable<CSVRecord> it = printer.read();
        int size = 0;
        for(CSVRecord r: it){
            size++;
        }
        Assertions.assertEquals(1, size);
    }
}
