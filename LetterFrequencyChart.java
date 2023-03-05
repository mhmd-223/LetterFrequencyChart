
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class for generating a bar chart of letter frequencies in a text document.
 */
public class LetterFrequencyChart {
    private final String document;
    private final int[] frequencies;

    /**
     * Constructs a LetterFrequencyChart object with the specified text document.
     *
     * @param document the path to the text document
     * @throws IOException if an I/O error occurs while reading the document
     */
    public LetterFrequencyChart(String document) throws IOException {
        this.document = document;
        frequencies = new int[26];
        readDocument();
    }

    /**
     * Reads the text document and updates the letter frequency counts.
     *
     * @throws IOException if an I/O error occurs while reading the document
     */
    private void readDocument() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(document))) {
            int letter;
            while ((letter = reader.read()) > 0) {
                char currLetter = (char) letter;
                if (Character.isLetter(currLetter)) {
                    currLetter = Character.toUpperCase(currLetter);
                    frequencies[currLetter - 'A']++;
                }
            }
        }
    }

    /**
     * Generates a bar chart of the letter frequencies.
     */
    public void plotBarChart() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.printf("%c |%s%n", letter, "=".repeat(frequencies[letter - 'A']));
        }
    }
}
