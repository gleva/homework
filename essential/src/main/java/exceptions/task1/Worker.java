package exceptions.task1;

public class Worker{
    private String name;
    private String post;
    private int year;

    public Worker(String name, String post, int year) {
        this.name = name;
        this.post = post;
        this.year = year;
    }
    public Worker(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Имя :" + name + " Должность: " + post + " Год начала работы: " + year;
    }
}
