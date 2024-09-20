public class News implements INews
{

    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    private int[] RateList = new int[3];

    public int getID()
    {
        return ID;
    }

    public void setID(int iD)
    {
        ID = iD;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        Title = title;
    }

    public String getPublishDate()
    {
        return PublishDate;
    }

    public void setPublishDate(String publishDate)
    {
        PublishDate = publishDate;
    }

    public String getAuthor()
    {
        return Author;
    }

    public void setAuthor(String author)
    {
        Author = author;
    }

    public String getContent()
    {
        return Content;
    }

    public void setContent(String content)
    {
        Content = content;
    }

    public float getAverageRate()
    {
        return AverageRate;
    }

    public void setAverageRate(float averageRate)
    {
        AverageRate = averageRate;
    }

    public void Calculate()
    {
        AverageRate = (RateList[0] + RateList[1] + RateList[2]) / 3.0f;
    }

    @Override
    public void Display()
    {
        System.out.println("News [ID=" + ID + ", Title=" + Title + ", PublishDate=" + PublishDate + ", Author=" + Author
                + ", Content=" + Content + ", AverageRate=" + AverageRate);
    }

    public void setRateList(int[] rates)
    {
        if (rates.length == 3)
        {
            RateList = rates;
        }
    }

}
