
public class MediaConversionFacade {

    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        metadataReader = new MetadataReader();
        codecFactory = new CodecFactory();
        bitrateReader = new BitrateReader();
        audioMixer = new AudioMixer();
    }

    public String convert(String fileName, String targetFormat) {
        String sourceFormat = metadataReader.readFormat(fileName);
        targetFormat = targetFormat.toLowerCase();

        if (sourceFormat.equals(targetFormat)) {
            throw new IllegalArgumentException(
                    "Source and target formats are the same"
            );
        }

        String sourceCodec = codecFactory.getCodec(sourceFormat);
        String targetCodec = codecFactory.getCodec(targetFormat);

        String data = bitrateReader.process(
                fileName, sourceCodec, targetCodec
        );

        return audioMixer.mix(data, targetFormat);
    }
}
