public class VideoConversionFacade {
    public VideoFile convert(VideoFile file, String format) {
        System.out.println("======= VideoConversionFacade: conversion started. =======");

        // Визначаємо кодек, яким стиснено вхідний файл
        Codec sourceCodec = CodecFactory.extract(file);

        // Визначаємо кодек, яким будемо стискувати файл у новому форматі
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        // Розкодовуємо відеофайл
        Buffer buffer = BitrateReader.read(file, sourceCodec);

        // Конвертуємо відеофайл у новий формат
        VideoFile videoFileConverted = BitrateReader.convert(buffer, file.getName(), destinationCodec);

        // Виконуємо мікшування звукової доріжки, якщо є доступний аудіобуфер
        if (file.getAudioBuffer() != null) {
            AudioMixer audioMixer = new AudioMixer();
            audioMixer.fix(videoFileConverted, file.getAudioBuffer());
        }

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        return videoFileConverted;
    }
}