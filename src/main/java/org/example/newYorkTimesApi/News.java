package org.example.newYorkTimesApi;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={
        "channel"
})
@XmlRootElement(name="rss")
public class News
{
    @XmlElement(name="channel")
    private List<Channel> channel;

    public News()
    {

    };

    public List<Channel> getChannel()
    {
        return this.channel;
    }
    public void setChannel(List<Channel> channel)
    {
        this.channel=channel;
    }

    public String toString()
    {
        String ret="CHANNEL\n"+channel.toString();

        return ret;
    }
}