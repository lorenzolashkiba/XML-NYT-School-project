package org.example.newYorkTimesApi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewyorkTimesApi {
    private URL url;
    private HttpURLConnection conn;

    public NewyorkTimesApi(String args) {
        try {
            url = new URL("https://rss.nytimes.com/services/xml/rss/nyt/Arts.xml");
        } catch (Exception e) {
            System.err.printf("ERROR: " + e);
        }
    }

    public void getXmlFile() {

        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "Arts/xml");

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            FileOutputStream fos = new FileOutputStream("src/main/java/org/example/sendEmail/arts.xml");

            while ((output = br.readLine()) != null) {
                fos.write(output.getBytes());
                fos.write("\n".getBytes());
            }

            br.close();
            conn.disconnect();
        } catch (Exception e) {
            System.err.printf("ERROR: " + e);
        }
    }

    public News readXml() {
        try{
            JAXBContext context = JAXBContext.newInstance(News.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            News news = (News) unmarshaller.unmarshal(new File("src/main/java/org/example/sendEmail/arts.xml"));
            System.out.println(news.toString());
            return news;
        }catch(Exception e) {
            System.err.printf("ERROR: " + e);
        }
        return null;
        }

}