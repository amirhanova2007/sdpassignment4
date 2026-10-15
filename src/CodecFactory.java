
public class CodecFactory {

    public String getCodec(String format) {
        if (format.equals("mp3")) {
            return "MP3 Codec";
        }

        if (format.equals("mp4")) {
            return "MP4 Codec";
        }

        if (format.equals("wav")) {
            return "WAV Codec";
        }

        throw new IllegalArgumentException(
                "Unsupported format: " + format
        );
    }
}
