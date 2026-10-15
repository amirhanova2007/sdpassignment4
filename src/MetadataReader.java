
public class MetadataReader {

    public String readFormat(String fileName) {
        int dot = fileName.lastIndexOf(".");

        if (dot == -1 || dot == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid file name");
        }

        String format = fileName.substring(dot + 1).toLowerCase();

        System.out.println("Reading metadata: " + fileName);

        return format;
    }
}
