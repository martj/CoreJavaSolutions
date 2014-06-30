package main;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushJava;
import syntaxhighlighter.theme.ThemeEmacs;

public class InspectorGadget {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
                SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeEmacs());
                highlighter.setFirstLine(0);
                highlighter.setHighlightedLineList(Arrays.asList(13, 27, 28, 38, 42, 43, 53));

                try {
                    highlighter.setContent(new File(
                            "/Users/rmania/Documents/workspace/UseLibraries/src/main/InspectorGadget.java"));
                } catch (IOException ex) {
                    Logger.getLogger(InspectorGadget.class.getName()).log(Level.SEVERE, null, ex);
                }

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(highlighter);
                frame.setLocationByPlatform(true);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
