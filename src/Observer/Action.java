package Observer;

public class Action {

    private String title;
    private String content;

    public Action(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Action{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
