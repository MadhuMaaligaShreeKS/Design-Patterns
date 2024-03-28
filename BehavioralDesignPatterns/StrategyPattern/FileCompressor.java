package BehavioralDesignPatterns.StrategyPattern;

class FileCompressor {
    private Compression compression;

    public FileCompressor(Compression strategy) {
        this.compression= strategy;
    }

    public void compressFile(String inputFile, String outputFile) {
        compression.compress(inputFile, outputFile);
    }
}