package pr241;

import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{

        private IDocument documentFactory = new IDocument() {
        };
        public docFactory factory= new docFactory();

        IDocument currentDocument;
        JMenuBar menuBar = new JMenuBar();
        JMenu musicMenu = new JMenu("Music");
        JMenu textMenu = new JMenu("Text");
        JMenu imageMenu = new JMenu("Image");
        JMenuItem saveMusicMenu = new JMenuItem("Save");
        JMenuItem saveImageMenu = new JMenuItem("Save");
        JMenuItem saveTextMenu = new JMenuItem("Save");
        JMenuItem openMusicMenu = new JMenuItem("Open");
        JMenuItem openImageMenu = new JMenuItem("Open");
        JMenuItem openTextMenu = new JMenuItem("Open");
        JMenuItem newMusicMenu = new JMenuItem("New");
        JMenuItem newImageMenu = new JMenuItem("New");
        JMenuItem newTextMenu = new JMenuItem("New");
        JMenuItem exitMusicMenu = new JMenuItem("Exit");
        JMenuItem exitImageMenu = new JMenuItem("Exit");
        JMenuItem exitTextMenu = new JMenuItem("Exit");

        JButton jButton = new JButton("Get type of class");
        public gui(){
            super("factory example");
            setSize(200,100);

            setJMenuBar(menuBar);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            add(jButton);

            menuBar.add(textMenu);
            menuBar.add(imageMenu);
            menuBar.add(musicMenu);

            textMenu.add(newTextMenu);
            textMenu.add(openTextMenu);
            textMenu.add(saveTextMenu);
            textMenu.add(exitTextMenu);

            imageMenu.add(newImageMenu);
            imageMenu.add(openImageMenu);
            imageMenu.add(saveImageMenu);
            imageMenu.add(exitImageMenu);

            musicMenu.add(newMusicMenu);
            musicMenu.add(openMusicMenu);
            musicMenu.add(saveMusicMenu);
            musicMenu.add(exitMusicMenu);

            newTextMenu.addActionListener(e->{
                System.out.println("creating new text file");
                currentDocument = factory.getDocument("Text");
            });
            newImageMenu.addActionListener(e->{
                System.out.println("creating new image file");
                currentDocument = factory.getDocument("Image");
            });
            newMusicMenu.addActionListener(e->{
                System.out.println("creating new music file");

                currentDocument = factory.getDocument("Music");
            });

            openTextMenu.addActionListener(e->{
                System.out.println("opening new text file");
                currentDocument = factory.openDocument("Text");
            });
            openImageMenu.addActionListener(e->{
                System.out.println("opening new image file");

                currentDocument = factory.openDocument("Image");
            });
            openMusicMenu.addActionListener(e->{
                System.out.println("opening new music file");

                currentDocument = factory.openDocument("Music");
            });

            jButton.addActionListener(e->{
                System.out.println("Type " + currentDocument.getClass());
            });
            setVisible(true);
        }


    public static void main(String[] args)
    {
        new gui();
    }
    }