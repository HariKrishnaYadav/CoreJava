package cmo.hky.java11code;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11Test {
    public static void main(String[] args) throws Exception {
        String str = "hare krishna";
        System.out.println(str.isBlank()); //false
        System.out.println("   ".isBlank()); //true
        System.out.println(str.lines().count()); //1
        System.out.println("line1\nline2\nline3".lines().count()); //3
        System.out.println("line1\nline2\nline3".lines().toList()); //[line1, line2, line3]
        System.out.println("line1\nline2\nline3".lines().toArray()); //[Ljava.lang.String;@15db9742
        System.out.println("hi".repeat(3)); //hihihi
        //HTTP Client API (supports HTTP/2 & WebSockets)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/users/all"))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
