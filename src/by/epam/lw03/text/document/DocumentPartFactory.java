package by.epam.lw03.text.document;

import by.epam.lw03.text.Factory;
import by.epam.lw03.text.paragraph.Paragraph;

/**
 */
public class DocumentPartFactory implements Factory<DocumentPart> {

    @Override
    public DocumentPart factory(String type, String text) throws Exception {
        if (Code.ID.equals(type)) {
            return new Code(text);
        }

        if (Paragraph.ID.equals(type)) {
            return new Paragraph(text);
        }

        throw new Exception("Cannot create document part");
    }

}