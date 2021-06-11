package aheng.wpapitest.utils;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AHeng
 * @date 2021/05/15 0:54
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class StringEscapeUtils {
    public static final CharSequenceTranslator UNESCAPE_JAVA;
    public static final CharSequenceTranslator UNESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator UNESCAPE_JSON;


    public StringEscapeUtils() {
    }

    public static Builder builder(CharSequenceTranslator translator) {
        return new Builder(translator);
    }


    public static final String unescapeJson(String input) {
        return UNESCAPE_JSON.translate(input);
    }

    static {
        Map<CharSequence, CharSequence> unescapeJavaMap = new HashMap();


        unescapeJavaMap = new HashMap();
        unescapeJavaMap.put("|", "\\|");
        unescapeJavaMap.put("&", "\\&");
        unescapeJavaMap.put(";", "\\;");
        unescapeJavaMap.put("<", "\\<");
        unescapeJavaMap.put(">", "\\>");
        unescapeJavaMap.put("(", "\\(");
        unescapeJavaMap.put(")", "\\)");
        unescapeJavaMap.put("$", "\\$");
        unescapeJavaMap.put("`", "\\`");
        unescapeJavaMap.put("\\", "\\\\");
        unescapeJavaMap.put("\"", "\\\"");
        unescapeJavaMap.put("'", "\\'");
        unescapeJavaMap.put(" ", "\\ ");
        unescapeJavaMap.put("\t", "\\\t");
        unescapeJavaMap.put("\r\n", "");
        unescapeJavaMap.put("\n", "");
        unescapeJavaMap.put("*", "\\*");
        unescapeJavaMap.put("?", "\\?");
        unescapeJavaMap.put("[", "\\[");
        unescapeJavaMap.put("#", "\\#");
        unescapeJavaMap.put("~", "\\~");
        unescapeJavaMap.put("=", "\\=");
        unescapeJavaMap.put("%", "\\%");

        unescapeJavaMap = new HashMap();
        unescapeJavaMap.put("\\\\", "\\");
        unescapeJavaMap.put("\\\"", "\"");
        unescapeJavaMap.put("\\'", "'");
        unescapeJavaMap.put("\\", "");
        UNESCAPE_JAVA = new AggregateTranslator(new CharSequenceTranslator[]{new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE), new LookupTranslator(Collections.unmodifiableMap(unescapeJavaMap))});
        UNESCAPE_ECMASCRIPT = UNESCAPE_JAVA;
        UNESCAPE_JSON = UNESCAPE_JAVA;

    }

    public static final class Builder {
        private final StringBuilder sb;
        private final CharSequenceTranslator translator;

        private Builder(CharSequenceTranslator translator) {
            this.sb = new StringBuilder();
            this.translator = translator;
        }

        public Builder escape(String input) {
            this.sb.append(this.translator.translate(input));
            return this;
        }

        public Builder append(String input) {
            this.sb.append(input);
            return this;
        }

        @Override
        public String toString() {
            return this.sb.toString();
        }
    }

    static class XsiUnescaper extends CharSequenceTranslator {
        private static final char BACKSLASH = '\\';

        XsiUnescaper() {
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index != 0) {
                throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
            } else {
                String s = input.toString();
                int segmentStart = 0;
                int searchOffset = 0;

                while(true) {
                    int pos = s.indexOf(92, searchOffset);
                    if (pos == -1) {
                        if (segmentStart < s.length()) {
                            out.write(s.substring(segmentStart));
                        }

                        return Character.codePointCount(input, 0, input.length());
                    }

                    if (pos > segmentStart) {
                        out.write(s.substring(segmentStart, pos));
                    }

                    segmentStart = pos + 1;
                    searchOffset = pos + 2;
                }
            }
        }
    }
}
