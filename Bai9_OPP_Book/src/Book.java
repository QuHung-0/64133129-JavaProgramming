import java.util.Arrays;

class Book implements IBook
{

    private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private float averagePrice;

    //
    private int[] priceList = new int[5];

    public Book(int id, String name, String publishDate, String author, String language, int[] priceList)
    {
        this.id = id;
        this.name = name;

        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
        this.priceList = priceList;
        this.averagePrice = calculate();
    }

    //
    @Override
    public void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Average Price: " + averagePrice);
    }

    public float calculate()
    {
        int sum = 0;
        for (int price : priceList)
        {
            sum += price;

        }
        return sum / (float) priceList.length;
    }
}
