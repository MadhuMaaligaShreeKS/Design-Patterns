package BehavioralDesignPatterns.StrategyPattern;

class ZipCompression implements Compression {
    @Override
    public void compress(String inputFile, String outputFile) {
        // Implement ZIP compression logic
        System.out.println("Compressed " + inputFile + " using ZIP to " + outputFile);
    }
}
