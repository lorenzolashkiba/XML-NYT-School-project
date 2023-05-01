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

    public String htmlString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<title>").append(this.title).append("</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<div style=\"width:100%; height:auto; display:flex; justify-content:center; flex-direction:column;\" >\n");
        sb.append("<a href=\"\"").append(this.getImage().get(0).getLink()).append("\"><img src=\"").append(this.getImage().get(0).getUrl()).append("\"></a>\n");
        sb.append("</div>\n");
        sb.append("<h2>").append(this.title).append("</h2>\n");
        sb.append("<p>").append(this.pubDate).append("</p>\n");
        for( Item it : this.item) {
            sb.append("<h2>").append(it.getTitle()).append("</h2>\n");
            sb.append("<p>").append(it.getDescription()).append("</p>\n");
        }
        sb.append("<br>");



        sb.append("</body>\n");
        sb.append("</html>\n");
        return sb.toString();
    }
}