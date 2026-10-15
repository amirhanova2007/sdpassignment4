
public class Main {

    public static void main(String[] args) {
        MediaConversionFacade converter =
                new MediaConversionFacade();

        try {
            String result = converter.convert("song.mp4", "mp3");
            System.out.println();
            System.out.println("Result: " + result);

            System.out.println("\nTesting unsupported format:");

            converter.convert("song.mp4", "avi");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
