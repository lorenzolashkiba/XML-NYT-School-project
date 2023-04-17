package org.example.newYorkTimesApi;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={
        "title", "url", "link"
})
@XmlRootElement(name="image")
public class Image
{
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "url")
    private String url;
    @XmlElement(name = "link")
    private String link;

    public Image()
    {

    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getUrl()
    {
        return this.url;
    }
    public void setUrl(String url)
    {
        this.url=url;
    }
    public String getLink()
    {
        return this.link;
    }
    public void setLink(String link)
    {
        this.link=link;
    }

    public String toString()
    {
        String ret="";

        ret+="\nTitolo immagine: "+this.getTitle()+"\nURL immagine: "+this.getUrl()+"\nLink immagine: "+this.getLink()+"\n";

        return ret;
    }
}