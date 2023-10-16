public class Music {
    public String name;
    public String author;
    public int year;
    public double time;

    public Music(String name, String author, int year, double time) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getTime() {
        return time;
    }
}
