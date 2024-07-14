package br.com.dio.desafio.dominio;

public class Course {
    private String title;
    private String description;
    private int workLoad;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    public void calculaXp(){

    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
