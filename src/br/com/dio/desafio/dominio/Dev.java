package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContent =  new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();

        if(content.isPresent()){
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You're not enrolled in any content.");
        }
    }

    public double calculateXpTotal(){
        //return this.finishedContent.stream().mapToDouble(content -> content.calculateXp()).sum();
        return this.finishedContent.stream().mapToDouble(Content::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getSubscribedContent(), dev.getSubscribedContent()) && Objects.equals(getFinishedContent(), dev.getFinishedContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubscribedContent(), getFinishedContent());
    }
}
