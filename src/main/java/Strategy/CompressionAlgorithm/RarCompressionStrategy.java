package Strategy.CompressionAlgorithm;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy{
    @Override
    public void compress(List<File> files, String compressedArchiveFileName) {
        System.out.println("rar compression strategy");
    }
}
