package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0101");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0102");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isFull();
        boolean boolean16 = stackAr8.equals((java.lang.Object) boolean15);
        org.autotest.Stack stackAr18 = createStack((int) '#');
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr8.equals((java.lang.Object) stackAr18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackAr8.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0103");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        boolean boolean10 = stackAr5.isFull();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) 1.0d);
        java.lang.String str15 = stackAr12.toString();
        stackAr5.push((java.lang.Object) stackAr12);
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj18 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0104");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 100);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0105");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr7.size();
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isEmpty();
        stackAr7.push((java.lang.Object) stackAr12);
        boolean boolean15 = stackAr7.isFull();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isFull();
        boolean boolean19 = stackAr17.isEmpty();
        boolean boolean20 = stackAr7.equals((java.lang.Object) stackAr17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackAr17.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0106");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isFull();
        int int9 = stackAr4.size();
        stackAr1.push((java.lang.Object) stackAr4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr4.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0107");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0108");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        boolean boolean12 = stackAr11.isEmpty();
        java.lang.String str13 = stackAr11.toString();
        int int14 = stackAr11.size();
        java.lang.String str15 = stackAr11.toString();
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackAr11.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0109");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0110");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean9 = stackAr1.isFull();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        int int16 = stackAr11.size();
        boolean boolean17 = stackAr1.equals((java.lang.Object) stackAr11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackAr11.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0111");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr1.equals((java.lang.Object) int7);
        java.lang.String str9 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0112");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        int int29 = stackAr26.size();
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr26);
        boolean boolean32 = stackAr1.isFull();
        boolean boolean33 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0113");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        boolean boolean10 = stackAr5.isFull();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) 1.0d);
        java.lang.String str15 = stackAr12.toString();
        stackAr5.push((java.lang.Object) stackAr12);
        stackAr1.push((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr19 = createStack((int) 'a');
        boolean boolean20 = stackAr19.isFull();
        java.lang.Object obj21 = null;
        boolean boolean22 = stackAr19.equals(obj21);
        boolean boolean23 = stackAr19.isFull();
        org.autotest.Stack stackAr25 = createStack((int) (byte) 1);
        int int26 = stackAr25.size();
        int int27 = stackAr25.size();
        boolean boolean28 = stackAr19.equals((java.lang.Object) stackAr25);
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        boolean boolean31 = stackAr30.isFull();
        java.lang.Object obj32 = null;
        boolean boolean33 = stackAr30.equals(obj32);
        boolean boolean34 = stackAr30.isFull();
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        int int37 = stackAr36.size();
        int int38 = stackAr36.size();
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isEmpty();
        boolean boolean43 = stackAr40.isFull();
        int int44 = stackAr40.size();
        boolean boolean45 = stackAr40.isFull();
        org.autotest.Stack stackAr47 = createStack((int) 'a');
        boolean boolean49 = stackAr47.equals((java.lang.Object) 1.0d);
        java.lang.String str50 = stackAr47.toString();
        stackAr40.push((java.lang.Object) stackAr47);
        stackAr36.push((java.lang.Object) stackAr47);
        boolean boolean53 = stackAr30.equals((java.lang.Object) stackAr47);
        org.autotest.Stack stackAr55 = createStack((int) (byte) 1);
        boolean boolean56 = stackAr55.isEmpty();
        boolean boolean57 = stackAr55.isFull();
        int int58 = stackAr55.size();
        boolean boolean59 = stackAr55.isFull();
        boolean boolean60 = stackAr30.equals((java.lang.Object) stackAr55);
        boolean boolean61 = stackAr25.equals((java.lang.Object) stackAr55);
        org.autotest.Stack stackAr63 = createStack((int) ' ');
        java.lang.String str64 = stackAr63.toString();
        int int65 = stackAr63.size();
        boolean boolean66 = stackAr63.isFull();
        java.lang.Object obj67 = null;
        stackAr63.push(obj67);
        stackAr25.push((java.lang.Object) stackAr63);
        boolean boolean70 = stackAr25.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0114");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack(10);
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean9 = stackAr8.isFull();
        java.lang.Object obj10 = null;
        boolean boolean11 = stackAr8.equals(obj10);
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr4.equals((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackAr8.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0115");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        org.autotest.Stack stackAr3 = createStack((int) (byte) 10);
        java.lang.String str4 = stackAr3.toString();
        java.lang.String str5 = stackAr3.toString();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        boolean boolean8 = stackAr7.isEmpty();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isFull();
        java.lang.String str11 = stackAr7.toString();
        boolean boolean12 = stackAr7.isFull();
        stackAr7.push((java.lang.Object) 0.0f);
        stackAr3.push((java.lang.Object) stackAr7);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr7);
        org.autotest.Stack stackAr18 = createStack((int) (byte) 1);
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr18.isEmpty();
        boolean boolean21 = stackAr18.isFull();
        int int22 = stackAr18.size();
        boolean boolean23 = stackAr18.isFull();
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) 1.0d);
        java.lang.String str28 = stackAr25.toString();
        stackAr18.push((java.lang.Object) stackAr25);
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isFull();
        boolean boolean33 = stackAr25.equals((java.lang.Object) boolean32);
        boolean boolean34 = stackAr7.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0116");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0117");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isFull();
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        int int11 = stackAr10.size();
        stackAr4.push((java.lang.Object) int11);
        boolean boolean13 = stackAr1.equals((java.lang.Object) int11);
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        boolean boolean18 = stackAr15.isFull();
        int int19 = stackAr15.size();
        boolean boolean20 = stackAr15.isFull();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) 1.0d);
        java.lang.String str25 = stackAr22.toString();
        stackAr15.push((java.lang.Object) stackAr22);
        org.autotest.Stack stackAr28 = createStack((int) (byte) 1);
        boolean boolean29 = stackAr28.isFull();
        boolean boolean30 = stackAr22.equals((java.lang.Object) boolean29);
        boolean boolean31 = stackAr22.isFull();
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        int int34 = stackAr33.size();
        int int35 = stackAr33.size();
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isEmpty();
        boolean boolean40 = stackAr37.isFull();
        int int41 = stackAr37.size();
        boolean boolean42 = stackAr37.isFull();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) 1.0d);
        java.lang.String str47 = stackAr44.toString();
        stackAr37.push((java.lang.Object) stackAr44);
        stackAr33.push((java.lang.Object) stackAr44);
        int int50 = stackAr33.size();
        stackAr22.push((java.lang.Object) stackAr33);
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0118");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        boolean boolean13 = stackAr12.isFull();
        java.lang.String str14 = stackAr12.toString();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 10);
        boolean boolean17 = stackAr16.isEmpty();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        stackAr16.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackAr12.equals((java.lang.Object) stackAr16);
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        int int24 = stackAr23.size();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        boolean boolean28 = stackAr26.isFull();
        stackAr23.push((java.lang.Object) stackAr26);
        boolean boolean30 = stackAr16.equals((java.lang.Object) stackAr26);
        stackAr5.push((java.lang.Object) boolean30);
        java.lang.String str32 = stackAr5.toString();
        boolean boolean33 = stackAr1.equals((java.lang.Object) str32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1,false]" + "'", str32, "[1,false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0119");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        int int29 = stackAr26.size();
        boolean boolean30 = stackAr26.isFull();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr33 = createStack(100);
        boolean boolean34 = stackAr33.isFull();
        org.autotest.Stack stackAr36 = createStack(10);
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        org.autotest.Stack stackAr40 = createStack((int) 'a');
        boolean boolean41 = stackAr40.isFull();
        java.lang.Object obj42 = null;
        boolean boolean43 = stackAr40.equals(obj42);
        boolean boolean44 = stackAr40.isFull();
        boolean boolean45 = stackAr36.equals((java.lang.Object) stackAr40);
        stackAr33.push((java.lang.Object) stackAr40);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0120");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0121");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isEmpty();
        int int6 = stackAr4.size();
        boolean boolean7 = stackAr4.isFull();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        stackAr9.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr4.equals((java.lang.Object) boolean16);
        boolean boolean18 = stackAr1.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        boolean boolean20 = stackAr1.equals(obj19);
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        int int26 = stackAr22.size();
        int int27 = stackAr22.size();
        int int28 = stackAr22.size();
        stackAr22.push((java.lang.Object) (short) 1);
        int int31 = stackAr22.size();
        stackAr1.push((java.lang.Object) stackAr22);
        java.lang.String str33 = stackAr1.toString();
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[[1]]" + "'", str33, "[[1]]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0122");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack(10);
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr1.equals((java.lang.Object) boolean11);
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0123");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean5 = stackAr1.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0124");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0125");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        boolean boolean9 = stackAr8.isFull();
        java.lang.String str10 = stackAr8.toString();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 10);
        boolean boolean13 = stackAr12.isEmpty();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        stackAr12.push((java.lang.Object) (byte) 1);
        boolean boolean17 = stackAr8.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr19 = createStack((int) 'a');
        int int20 = stackAr19.size();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isFull();
        stackAr19.push((java.lang.Object) stackAr22);
        boolean boolean26 = stackAr12.equals((java.lang.Object) stackAr22);
        stackAr1.push((java.lang.Object) boolean26);
        org.autotest.Stack stackAr29 = createStack((int) (byte) 1);
        int int30 = stackAr29.size();
        java.lang.String str31 = stackAr29.toString();
        java.lang.String str32 = stackAr29.toString();
        stackAr1.push((java.lang.Object) stackAr29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr29.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0126");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj13 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0127");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0128");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0129");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0130");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0131");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0132");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0133");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0134");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isEmpty();
        int int6 = stackAr4.size();
        boolean boolean7 = stackAr4.isFull();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        stackAr9.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr4.equals((java.lang.Object) boolean16);
        boolean boolean18 = stackAr1.equals((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0135");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr7.size();
        boolean boolean12 = stackAr7.isFull();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isEmpty();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isFull();
        org.autotest.Stack stackAr19 = createStack((int) 'a');
        int int20 = stackAr19.size();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isFull();
        stackAr19.push((java.lang.Object) stackAr22);
        boolean boolean26 = stackAr19.isEmpty();
        boolean boolean27 = stackAr14.equals((java.lang.Object) boolean26);
        stackAr7.push((java.lang.Object) stackAr14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackAr14.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0136");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        boolean boolean8 = stackAr7.isEmpty();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        boolean boolean12 = stackAr11.isFull();
        java.lang.Object obj13 = null;
        boolean boolean14 = stackAr11.equals(obj13);
        boolean boolean15 = stackAr11.isFull();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        int int19 = stackAr17.size();
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isEmpty();
        boolean boolean24 = stackAr21.isFull();
        int int25 = stackAr21.size();
        boolean boolean26 = stackAr21.isFull();
        org.autotest.Stack stackAr28 = createStack((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) 1.0d);
        java.lang.String str31 = stackAr28.toString();
        stackAr21.push((java.lang.Object) stackAr28);
        stackAr17.push((java.lang.Object) stackAr28);
        boolean boolean34 = stackAr11.equals((java.lang.Object) stackAr28);
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = stackAr28.equals(obj35);
        stackAr7.push((java.lang.Object) stackAr28);
        boolean boolean38 = stackAr28.isFull();
        stackAr1.push((java.lang.Object) stackAr28);
        org.autotest.Stack stackAr41 = createStack((int) (byte) 1);
        boolean boolean42 = stackAr41.isFull();
        java.lang.String str43 = stackAr41.toString();
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        int int46 = stackAr45.size();
        boolean boolean47 = stackAr45.isFull();
        stackAr41.push((java.lang.Object) stackAr45);
        java.lang.Object obj49 = stackAr41.top();
        java.lang.String str50 = stackAr41.toString();
        java.lang.String str51 = stackAr41.toString();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[[]]" + "'", str50, "[[]]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[[]]" + "'", str51, "[[]]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0137");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0138");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0139");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack(10);
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr1.equals((java.lang.Object) boolean11);
        org.autotest.Stack stackAr14 = createStack((int) 'a');
        boolean boolean15 = stackAr14.isEmpty();
        stackAr1.push((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0140");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0141");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        boolean boolean10 = stackAr1.isEmpty();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        java.lang.Object obj19 = stackAr12.pop();
        boolean boolean20 = stackAr12.isFull();
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackAr12.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0142");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr5.equals(obj7);
        boolean boolean9 = stackAr5.isFull();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        int int13 = stackAr11.size();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        boolean boolean18 = stackAr15.isFull();
        int int19 = stackAr15.size();
        boolean boolean20 = stackAr15.isFull();
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) 1.0d);
        java.lang.String str25 = stackAr22.toString();
        stackAr15.push((java.lang.Object) stackAr22);
        stackAr11.push((java.lang.Object) stackAr22);
        boolean boolean28 = stackAr5.equals((java.lang.Object) stackAr22);
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = stackAr22.equals(obj29);
        stackAr1.push((java.lang.Object) stackAr22);
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        boolean boolean36 = stackAr35.isFull();
        java.lang.Object obj37 = null;
        boolean boolean38 = stackAr35.equals(obj37);
        boolean boolean39 = stackAr35.isFull();
        org.autotest.Stack stackAr41 = createStack((int) (byte) 1);
        int int42 = stackAr41.size();
        int int43 = stackAr41.size();
        boolean boolean44 = stackAr35.equals((java.lang.Object) stackAr41);
        int int45 = stackAr41.size();
        int int46 = stackAr41.size();
        boolean boolean47 = stackAr33.equals((java.lang.Object) stackAr41);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0143");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0144");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isEmpty();
        org.autotest.Stack stackAr13 = createStack((int) (byte) 1);
        int int14 = stackAr13.size();
        int int15 = stackAr13.size();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        boolean boolean19 = stackAr17.isEmpty();
        boolean boolean20 = stackAr17.isFull();
        int int21 = stackAr17.size();
        boolean boolean22 = stackAr17.isFull();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean26 = stackAr24.equals((java.lang.Object) 1.0d);
        java.lang.String str27 = stackAr24.toString();
        stackAr17.push((java.lang.Object) stackAr24);
        stackAr13.push((java.lang.Object) stackAr24);
        java.lang.Object obj30 = stackAr13.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0145");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        int int12 = stackAr7.size();
        stackAr4.push((java.lang.Object) stackAr7);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr7);
        boolean boolean15 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0146");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        boolean boolean16 = stackAr11.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr18);
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = stackAr18.equals(obj25);
        org.autotest.Stack stackAr28 = createStack((int) (byte) 1);
        int int29 = stackAr28.size();
        boolean boolean30 = stackAr18.equals((java.lang.Object) stackAr28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = stackAr18.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0147");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isFull();
        boolean boolean11 = stackAr7.isFull();
        int int12 = stackAr7.size();
        stackAr4.push((java.lang.Object) stackAr7);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr7);
        int int15 = stackAr7.size();
        java.lang.String str16 = stackAr7.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0148");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack((int) (byte) 1);
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isFull();
        int int14 = stackAr9.size();
        boolean boolean15 = stackAr4.equals((java.lang.Object) stackAr9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0149");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr7.size();
        boolean boolean12 = stackAr7.isFull();
        boolean boolean13 = stackAr7.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0150");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

