package Strategy.CompressionAlgorithm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new File("/Users/rabia/Desktop/worm"));

        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        compressionContext.archive(files, "testCompressedZipFile");

        compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        compressionContext.archive(files, "testCompressedRarFile");

    }
}
