package pr241;

public class docFactory {
    public static IDocument getDocument(String name){
        if("Image".equalsIgnoreCase(name)) return new
                ImageDocument(name);
        else if("Text".equalsIgnoreCase(name))
            return new TextDocument(name);
        else if ("Music".equalsIgnoreCase(name))
            return new MusicDocument(name);
        return null;
    }

    public static IDocument openDocument(String name){
        if("Image".equalsIgnoreCase(name)) return new
                ImageDocument(name);
        else if("Text".equalsIgnoreCase(name))
            return new TextDocument(name);
        else if ("Music".equalsIgnoreCase(name))
            return new MusicDocument(name);
        return null;
    }
}
