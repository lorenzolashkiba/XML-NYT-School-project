package org.example.newYorkTimesApi;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={
        "title", "link", "pubDate", "image", "item"
})
@XmlRootElement(name="channel")
public class Channel
{
    @XmlElement(name="title")
    private String title;

    @XmlElement(name="link")
    private String link;

    @XmlElement(name="pubDate")
    private String pubDate;

    @XmlElement(name="image")
    private List<Image> image;

    @XmlElement(name="item")
    private List<Item> item;

    public Channel()
    {

    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getLink()
    {
        return this.link=link;
    }
    public void setLink(String link)
    {
        this.link=link;
    }
    public String getPubDate()
    {
        return this.pubDate;
    }
    public void setPubDate(String pubDate)
    {
        this.pubDate=pubDate;
    }
    public List<Image> getImage()
    {
        return this.image;
    }
    public void setImage(List<Image> image)
    {
        this.image=image;
    }
    public List<Item> getItem()
    {
        return this.item;
    }
    public void setItem(List<Item> item)
    {
        this.item=item;
    }

    public String toString()
    {
        String ret="";

        ret+="Titolo: "+this.getTitle()+"\nLink: "+this.getLink()+"\nData di pubblicazione: "+this.getPubDate()+"\n\nIMAGE\n"+image.toString()+"\n\nITEM\n"+item.toString();

        return ret;
    }
}