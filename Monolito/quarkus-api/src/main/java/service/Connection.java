package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Clase que proporciona métodos para establecer una conexión HTTP.
 */
public class Connection {
    private static final String USER_AGENT = "Mozilla/5.0";

    /**
     * Realiza una conexión HTTP GET a la URL especificada.
     * @param url La URL a la que se realizará la conexión.
     * @return La respuesta obtenida como una cadena de texto.
     * @throws IOException Si ocurre un error durante la conexión.
     */
    public static String connection(String url) throws IOException {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            
            return response.toString();
        } else {
            return "GET request not worked";
        }

    }
}