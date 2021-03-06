/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.util.fxdesigner.model;

import java.util.Date;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * Log entry of an {@link EventLogger}.
 *
 * @author Clément Fournier
 * @since 6.0.0
 */
public class LogEntry {


    private final Throwable throwable;
    private final Category category;
    private final Date timestamp;


    public LogEntry(Throwable thrown, Category cat) {
        this.throwable = thrown;
        this.category = cat;
        timestamp = new Date();
    }


    public Throwable getThrown() {
        return throwable;
    }

    public String getMessage() {
        return throwable.getMessage();
    }


    public Category getCategory() {
        return category;
    }


    public String getStackTrace() {
        return throwable == null ? "" : ExceptionUtils.getStackTrace(throwable);
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public enum Category {
        PARSE_EXCEPTION("Parse exception"),
        TYPERESOLUTION_EXCEPTION("Type resolution exception"),
        QNAME_RESOLUTION_EXCEPTION("Qualified name resolution exception"),
        SYMBOL_FACADE_EXCEPTION("Symbol façade exception"),
        XPATH_EVALUATION_EXCEPTION("XPath evaluation exception"),
        OTHER("Other"),

        // These are "flag" categories that signal that previous exceptions
        // thrown during code or XPath edition may be discarded as uninteresting
        PARSE_OK("Parsing success"),
        XPATH_OK("XPath evaluation success");

        public final String name;


        Category(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return name;
        }
    }


}
