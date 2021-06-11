package aheng.wpapitest.utils;

import java.io.IOException;
import java.io.Writer;

public class UnicodeUnescaper extends CharSequenceTranslator {
    public UnicodeUnescaper() {
    }

    @Override
    public int translate(CharSequence input, int index, Writer out) throws IOException {
        if (input.charAt(index) == '\\' && index + 1 < input.length() && input.charAt(index + 1) == 'u') {
            int i;
            for(i = 2; index + i < input.length() && input.charAt(index + i) == 'u'; ++i) {
            }

            if (index + i < input.length() && input.charAt(index + i) == '+') {
                ++i;
            }

            if (index + i + 4 <= input.length()) {
                CharSequence unicode = input.subSequence(index + i, index + i + 4);

                try {
                    int value = Integer.parseInt(unicode.toString(), 16);
                    out.write((char)value);
                } catch (NumberFormatException var7) {
                    throw new IllegalArgumentException("Unable to parse unicode value: " + unicode, var7);
                }

                return i + 4;
            } else {
                throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + input.subSequence(index, input.length()) + "' due to end of CharSequence");
            }
        } else {
            return 0;
        }
    }
}
