package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate data;

    public Mentorship() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", data=" + data +
                '}';
    }
}
