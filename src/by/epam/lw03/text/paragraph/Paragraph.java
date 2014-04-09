package by.epam.lw03.text.paragraph;

import by.epam.lw03.parser.ParseException;
import by.epam.lw03.parser.ParserFactory;
import by.epam.lw03.text.document.DocumentPart;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class Paragraph extends DocumentPart {

    public static final String ID = "paragraph";

    private List<ParagraphPart> parts;

    public Paragraph(String text) throws ParseException {
        super(text);

        ParserFactory factory = new ParserFactory();
        parts = factory.paragraphParser().parse(text);
    }

    public String toString() {
        String result = "";

        for (ParagraphPart part : parts) {
            result += part;
        }

        return result;
    }

    public List<Sentence> getSentences() {
        List<Sentence> list = new LinkedList<Sentence>();

        for (ParagraphPart part : parts) {
            if (part instanceof Sentence) {
                list.add((Sentence) part);
            }
        }

        return list;
    }
}
