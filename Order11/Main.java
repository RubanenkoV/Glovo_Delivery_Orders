public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";
        String format = "mp4";

        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec()); // програємо файл не правильним кодеком
        //videoFile.play(new OggCompressionCodec());   // програємо файл правильним кодеком

        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile convertedFile = facade.convert(videoFile, format);

        convertedFile.play(new MPEG4CompressionCodec());
    }
}    