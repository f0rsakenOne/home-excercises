package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        printHistogram(createHistogram(scores));
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static int[] createHistogram(String scores) {
        final int[] histogram = new int[11];
        final List<String> scoreList = List.of(scores.split(" "));
        for (String s : scoreList) {
            histogram[Integer.parseInt(s) / 10] = histogram[Integer.parseInt(s) / 10] + 1;
        }
        return histogram;
    }

    private static void printHistogram(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.println(i + "0-" + i + "9" + " : " + "*".repeat(Math.max(0, array[i])));
            } else {
                System.out.println("  " + i + "0" + " : " + "*".repeat(Math.max(0, array[i])));
            }
        }
    }
}
