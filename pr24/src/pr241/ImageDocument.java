package pr241;

public class ImageDocument implements IDocument, ICreateDocument{
    private String name;
    public ImageDocument(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return ("image");
    }

    @Override
    public IDocument CreateNew() {

        return new ImageDocument(name);
    }

    @Override
    public IDocument CreateOpen() {

        return new ImageDocument(name);
    }
}
