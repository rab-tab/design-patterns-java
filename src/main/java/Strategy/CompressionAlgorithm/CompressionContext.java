package Strategy.CompressionAlgorithm;

import java.io.File;
import java.util.List;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void archive(List<File> files, String compressedArchiveFileName) {
        compressionStrategy.compress(files, compressedArchiveFileName);
    }
}
