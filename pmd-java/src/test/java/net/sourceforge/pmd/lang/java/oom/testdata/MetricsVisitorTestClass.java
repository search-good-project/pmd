/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.oom.testdata;

/**
 * Test data for the metrics visitor
 *
 * @author Clément Fournier
 */
public class MetricsVisitorTestClass {

    public String x;
    private String y;
    protected String z;
    String t;

    public MetricsVisitorTestClass() {

    }

    private MetricsVisitorTestClass(String x) {

    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setX(String n) {
        x = n;
    }

    public void setY(String n) {
        y = n;
    }

    public void mymethod1() {

    }

    private void mymethod2() {

    }

    protected static void mystatic1() {

    }

    private static void mystatic2(String k) {

    }

    private static void mystatic2(String k, String l) {

    }

}
