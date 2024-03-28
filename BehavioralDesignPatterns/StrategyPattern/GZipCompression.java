package BehavioralDesignPatterns.StrategyPattern;

class GzipCompression implements Compression{
    @Override
    public void compress(String inputFile, String outputFile) {
        // Implement GZIP compression logic
        System.out.println("Compressed " + inputFile + " using GZIP to " + outputFile);
    }
}
