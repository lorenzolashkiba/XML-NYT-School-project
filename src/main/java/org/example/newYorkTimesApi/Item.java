package org.example.newYorkTimesApi;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={
        "title", "link", "description", "pubDate", "category"
})
@XmlRootElement(name="item")
public class Item
{
    @XmlElement(name="title")
    private String title;
    @XmlElement(name="link")
    private String link;
    @XmlElement(name="description")
    private String description;
    @XmlElement(name="pubDate")
    private String pubDate;
    @XmlElement(name="category")
    private String category;

    public Item()
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
        return this.link;
    }
    public void setLink(String link)
    {
        this.link=link;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public String getPubDate()
    {
        return this.pubDate;
    }
    public void setPubDate(String pubDate)
    {
        this.pubDate=pubDate;
    }
    public String getCategory()
    {
        return this.category;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }

    public String toString()
    {
        String ret="";

        ret+="\nTitolo item: "+this.getTitle()+"\nLink item: "+this.getLink()+"\nDescrizione item: "+this.getDescription()+
                "\nData di pubblicazione: "+this.getPubDate()+"\nCategoria item: "+this.getCategory()+"\n";

        return ret;
    }
}