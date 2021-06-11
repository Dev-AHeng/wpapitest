package aheng.wpapitest.utils;

import java.util.Objects;

/**
 * 提取StringJoiner(为了兼容Android7.0以下)
 */
public class SJ {
    private final String prefix;
    private final String delimiter;
    private final String suffix;
    private StringBuilder value;
    private String emptyValue;

    /**
     * Constructs a {@code StringJoiner} with no characters in it, with no
     * {@code prefix} or {@code suffix}, and a copy of the supplied
     * {@code delimiter}.
     * If no characters are added to the {@code StringJoiner} and methods
     * accessing the value of it are invoked, it will not return a
     * {@code prefix} or {@code suffix} (or properties thereof) in the result,
     * unless {@code setEmptyValue} has first been called.
     *
     * @param  delimiter the sequence of characters to be used between each
     *         element added to the {@code StringJoiner} value
     * @throws NullPointerException if {@code delimiter} is {@code null}
     */
    public SJ(CharSequence delimiter) {
        this(delimiter, "", "");
    }

    /**
     * Constructs a {@code StringJoiner} with no characters in it using copies
     * of the supplied {@code prefix}, {@code delimiter} and {@code suffix}.
     * If no characters are added to the {@code StringJoiner} and methods
     * accessing the string value of it are invoked, it will return the
     * {@code prefix + suffix} (or properties thereof) in the result, unless
     * {@code setEmptyValue} has first been called.
     *
     * @param  delimiter the sequence of characters to be used between each
     *         element added to the {@code StringJoiner}
     * @param  prefix the sequence of characters to be used at the beginning
     * @param  suffix the sequence of characters to be used at the end
     * @throws NullPointerException if {@code prefix}, {@code delimiter}, or
     *         {@code suffix} is {@code null}
     */
    public SJ(CharSequence delimiter,
              CharSequence prefix,
              CharSequence suffix) {
        Objects.requireNonNull(prefix, "The prefix must not be null");
        Objects.requireNonNull(delimiter, "The delimiter must not be null");
        Objects.requireNonNull(suffix, "The suffix must not be null");
        // make defensive copies of arguments
        this.prefix = prefix.toString();
        this.delimiter = delimiter.toString();
        this.suffix = suffix.toString();
        this.emptyValue = this.prefix + this.suffix;
    }

    /**
     * Returns the current value, consisting of the {@code prefix}, the values
     * added so far separated by the {@code delimiter}, and the {@code suffix},
     * unless no elements have been added in which case, the
     * {@code prefix + suffix} or the {@code emptyValue} characters are returned
     *
     * @return the string representation of this {@code StringJoiner}
     */
    @Override
    public String toString() {
        if (value == null) {
            return emptyValue;
        } else {
            if (suffix.equals("")) {
                return value.toString();
            } else {
                int initialLength = value.length();
                String result = value.append(suffix).toString();
                // reset value to pre-append initialLength
                value.setLength(initialLength);
                return result;
            }
        }
    }

    /**
     * Adds a copy of the given {@code CharSequence} value as the next
     * element of the {@code StringJoiner} value. If {@code newElement} is
     * {@code null}, then {@code "null"} is added.
     *
     * @param  newElement The element to add
     * @return a reference to this {@code StringJoiner}
     */
    public SJ add(CharSequence newElement) {
        prepareBuilder().append(newElement);
        return this;
    }

    private StringBuilder prepareBuilder() {
        if (value != null) {
            value.append(delimiter);
        } else {
            value = new StringBuilder().append(prefix);
        }
        return value;
    }

}
