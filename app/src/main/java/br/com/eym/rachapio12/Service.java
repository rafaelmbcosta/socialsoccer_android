package br.com.eym.rachapio12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by rafael on 24/08/16.
 */
public class Service {
    static String json = "";
    private String dominio = "http://127.0.0.1:3000/";

    public String getJSONFromUrl(String urlString) {
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(urlString);

            urlConnection = (HttpURLConnection) url
                    .openConnection();

            InputStream in = urlConnection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    in, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            in.close();
            json = sb.toString();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

        return json;
    }
}
