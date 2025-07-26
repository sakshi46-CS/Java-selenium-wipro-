package Day6;

import java.io.FileWriter;
import java.io.IOException;

public class WriteXML {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\filewriter.xml";

        try {
            FileWriter writer = new FileWriter(filePath);

            // Manually writing XML content
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<employees>\n");

            writer.write("    <employee>\n");
            writer.write("        <id>101</id>\n");
            writer.write("        <name>Sakshi</name>\n");
            writer.write("        <age>22</age>\n");
            writer.write("        <department>HR</department>\n");
            writer.write("    </employee>\n");

            writer.write("    <employee>\n");
            writer.write("        <id>102</id>\n");
            writer.write("        <name>Omkar</name>\n");
            writer.write("        <age>30</age>\n");
            writer.write("        <department>IT</department>\n");
            writer.write("    </employee>\n");

            writer.write("</employees>\n");

            writer.flush();
            writer.close();

            System.out.println("XML file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing XML: " + e.getMessage());
        }
    }
}
