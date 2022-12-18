package pr241;

public class MusicDocument implements IDocument, ICreateDocument{
    private String name;
    public MusicDocument(String name)
    {
        this.name=name;
    }
    @Override
    public String toString()
    {
        return ("music");
    }

    @Override
    public IDocument CreateNew() {

        return new MusicDocument(name);
    }

    @Override
    public IDocument CreateOpen() {

        return new MusicDocument(name);
    }
}
