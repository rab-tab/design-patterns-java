package Strategy.CompressionAlgorithm;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy{
    @Override
    public void compress(List<File> files, String compressedArchiveFileName) {
        System.out.println("Compressing via zip compressoin type");
    }
}
