package pr241;

public class TextDocument implements IDocument, ICreateDocument{
    private String name;
    public TextDocument(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return ("text");
    }

    @Override
    public IDocument CreateNew() {
        return new TextDocument(name);
    }

    @Override
    public IDocument CreateOpen() {
        return new TextDocument(name);
    }


}
