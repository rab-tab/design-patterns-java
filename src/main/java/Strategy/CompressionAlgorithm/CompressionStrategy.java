package Strategy.CompressionAlgorithm;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {

    void compress(List<File> files, String compressedArchiveFileName);

}
