# Media Conversion Facade

## Project Description

This project demonstrates the Facade structural design pattern using a simplified media conversion system.

The system converts media data from one format to another through a single method.

## Design Pattern

The `MediaConversionFacade` provides a simple interface to several subsystem classes.

## Subsystem Classes

- `MetadataReader` — reads the source file format.
- `CodecFactory` — selects the required codec.
- `BitrateReader` — processes media data.
- `AudioMixer` — prepares the output result.


## UML Diagram

The UML class diagram shows the relationship between `Main`, `MediaConversionFacade`, and the subsystem classes.

## Conclusion

The Facade pattern simplifies access to the media conversion subsystem by providing one public conversion method.
