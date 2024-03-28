package BehavioralDesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        // Create instances of compression strategies
        Compression zip = new ZipCompression();
        Compression gzip = new GzipCompression();

        // Compress files using different strategies
        FileCompressor fileCompressor = new FileCompressor(zip);
        fileCompressor.compressFile("input.txt", "output.zip");

        fileCompressor = new FileCompressor(gzip);
        fileCompressor.compressFile("input.txt", "output.gz");
    }
}
