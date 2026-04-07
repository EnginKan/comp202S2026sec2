package Memento;
//Originator
public class MyDocument {

    //internal state
    private String content="";
    private ContentManager manager=new ContentManager();

    //append the text into existing content
    public void setContent(String text){
        content=content+" "+text;
    }

    public void save(){
        manager.saveContent(new ContentHistory(this.content));
    }

    public void undo(){
        this.content = manager.undoHistory().getContent();

    }

    public void redo(){
        this.content = manager.redoHistory().getContent();
    }

    public String getContent() {
        return content;
    }
}
