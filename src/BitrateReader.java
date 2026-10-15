
public class BitrateReader {

    public String process(String fileName, String sourceCodec,
                          String targetCodec) {
        System.out.println("Reading data with " + sourceCodec);
        System.out.println("Converting data to " + targetCodec);

        return "Processed data from " + fileName;
    }
}
