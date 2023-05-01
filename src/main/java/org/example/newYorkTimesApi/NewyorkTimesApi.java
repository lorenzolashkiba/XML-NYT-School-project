package org.example.newYorkTimesApi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewyorkTimesApi {
    private URL url;
    private HttpURLConnection conn;
    private News news;
    public NewyorkTimesApi() {

    }

    public Boolean getXmlFile(String theme) {

        try {
            url = new URL("https://rss.nytimes.com/services/xml/rss/nyt/"+theme+".xml");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", theme+"/xml");

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            String content = new String();
            while ((output = br.readLine()) != null) {

                content += output;
            }

            br.close();
            conn.disconnect();
            JAXBContext context = JAXBContext.newInstance(News.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            news = (News) unmarshaller.unmarshal(new StringReader(content));
            //System.out.println(news.toString());
            return true;
        } catch (Exception e) {
            System.err.printf("ERROR:-" + e);
            return false;
        }
    }

    public News getContent() {
        return news;
    }
}