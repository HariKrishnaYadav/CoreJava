package cmo.hky.java9code;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class CompaniesHouseStreamExample {

    // Replace with your Companies House API key
    private static final String API_KEY = "d4ac8482-faf8-4957-bbfb-24a52242c4f7";

    // Example endpoint: company profile stream
    // Other streams: /filings, /officers, /insolvency, /charges
    private static final String STREAM_URL =
            "https://stream.companieshouse.gov.uk/companies";

    public static void main(String[] args) {
        try {
            consumeStream(STREAM_URL);
        } catch (IOException e) {
            System.err.println("Error consuming stream: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Connects to the Companies House streaming API and continuously reads events.
     */
    private static void consumeStream(String urlString) throws IOException {

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Basic Auth: API key as username, empty password
        String auth = API_KEY + ":";
        String encodedAuth =
                Base64.getEncoder().encodeToString(auth.getBytes());
        connection.setRequestProperty("Authorization", "Basic " + encodedAuth);

        connection.setRequestMethod("GET");
        connection.setDoInput(true);
        connection.setConnectTimeout(15000); // 15 seconds
        connection.setReadTimeout(0); // Infinite read timeout for streaming

        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Failed to connect: HTTP " + responseCode);
        }

        System.out.println(
                "Connected to Companies House stream. Listening for events...");

        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(connection.getInputStream()))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Each event is a JSON object, sometimes preceded by "data:" in SSE format
                if (!line.trim().isEmpty()) {
                    System.out.println("Event: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Stream connection lost: " + e.getMessage());
        }
    }
}
