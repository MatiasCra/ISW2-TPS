package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0951");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isFull();
        java.lang.String str6 = stackAr4.toString();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 10);
        boolean boolean9 = stackAr8.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        stackAr8.push((java.lang.Object) (byte) 1);
        boolean boolean13 = stackAr4.equals((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        int int19 = stackAr18.size();
        boolean boolean20 = stackAr18.isFull();
        stackAr15.push((java.lang.Object) stackAr18);
        boolean boolean22 = stackAr8.equals((java.lang.Object) stackAr18);
        java.lang.Object obj23 = stackAr8.top();
        java.lang.String str24 = stackAr8.toString();
        boolean boolean25 = stackAr1.equals((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        int int28 = stackAr27.size();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isFull();
        stackAr27.push((java.lang.Object) stackAr30);
        boolean boolean34 = stackAr30.isEmpty();
        java.lang.String str35 = stackAr30.toString();
        java.lang.Object obj36 = null;
        boolean boolean37 = stackAr30.equals(obj36);
        boolean boolean38 = stackAr1.equals((java.lang.Object) stackAr30);
        java.lang.Object obj39 = null;
        stackAr1.push(obj39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[1]" + "'", str24, "[1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0952");
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
        stackAr1.push((java.lang.Object) (byte) 1);
        int int27 = stackAr1.size();
        int int28 = stackAr1.size();
        java.lang.String str29 = stackAr1.toString();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[1]" + "'", str29, "[1]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0953");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) stackAr11);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        boolean boolean17 = stackAr1.isEmpty();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        boolean boolean22 = stackAr21.isFull();
        java.lang.String str23 = stackAr21.toString();
        boolean boolean24 = stackAr21.isEmpty();
        boolean boolean25 = stackAr19.equals((java.lang.Object) stackAr21);
        org.autotest.Stack stackAr27 = createStack((int) ' ');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr27.isFull();
        boolean boolean30 = stackAr27.isEmpty();
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        boolean boolean33 = stackAr32.isEmpty();
        java.lang.String str34 = stackAr32.toString();
        stackAr27.push((java.lang.Object) stackAr32);
        stackAr21.push((java.lang.Object) stackAr27);
        java.lang.Object obj37 = stackAr21.top();
        boolean boolean38 = stackAr1.equals((java.lang.Object) stackAr21);
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        boolean boolean41 = stackAr40.isEmpty();
        int int42 = stackAr40.size();
        boolean boolean43 = stackAr40.isFull();
        java.lang.String str44 = stackAr40.toString();
        int int45 = stackAr40.size();
        stackAr40.push((java.lang.Object) 10.0d);
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        boolean boolean50 = stackAr49.isFull();
        stackAr49.push((java.lang.Object) (short) -1);
        java.lang.Object obj53 = stackAr49.top();
        java.lang.Object obj54 = stackAr49.pop();
        boolean boolean55 = stackAr40.equals(obj54);
        int int56 = stackAr40.size();
        boolean boolean57 = stackAr40.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) -1 + "'", obj53, (short) -1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) -1 + "'", obj54, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0954");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0955");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 10);
        boolean boolean6 = stackAr5.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        stackAr5.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr5.equals((java.lang.Object) stackAr15);
        java.lang.Object obj20 = stackAr5.top();
        java.lang.String str21 = stackAr5.toString();
        java.lang.Object obj22 = stackAr5.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackAr5.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[1]" + "'", str21, "[1]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 1 + "'", obj22, (byte) 1);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0956");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        boolean boolean12 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) boolean12);
        boolean boolean14 = stackAr1.isEmpty();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr1.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = stackAr1.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        int int24 = stackAr20.size();
        boolean boolean25 = stackAr20.isFull();
        java.lang.String str26 = stackAr20.toString();
        boolean boolean27 = stackAr20.isFull();
        java.lang.String str28 = stackAr20.toString();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isEmpty();
        java.lang.String str33 = stackAr30.toString();
        org.autotest.Stack stackAr35 = createStack(10);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        boolean boolean40 = stackAr39.isFull();
        java.lang.Object obj41 = null;
        boolean boolean42 = stackAr39.equals(obj41);
        boolean boolean43 = stackAr39.isFull();
        boolean boolean44 = stackAr35.equals((java.lang.Object) stackAr39);
        stackAr30.push((java.lang.Object) stackAr35);
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        boolean boolean48 = stackAr47.isFull();
        java.lang.String str49 = stackAr47.toString();
        org.autotest.Stack stackAr51 = createStack((int) 'a');
        int int52 = stackAr51.size();
        boolean boolean53 = stackAr51.isFull();
        stackAr47.push((java.lang.Object) stackAr51);
        boolean boolean55 = stackAr47.isFull();
        org.autotest.Stack stackAr57 = createStack((int) (byte) 1);
        int int58 = stackAr57.size();
        boolean boolean59 = stackAr57.isEmpty();
        boolean boolean60 = stackAr57.isFull();
        int int61 = stackAr57.size();
        int int62 = stackAr57.size();
        boolean boolean63 = stackAr47.equals((java.lang.Object) stackAr57);
        boolean boolean64 = stackAr35.equals((java.lang.Object) stackAr57);
        boolean boolean65 = stackAr20.equals((java.lang.Object) stackAr57);
        org.autotest.Stack stackAr67 = createStack((int) 'a');
        java.lang.String str68 = stackAr67.toString();
        int int69 = stackAr67.size();
        boolean boolean70 = stackAr67.isFull();
        stackAr57.push((java.lang.Object) stackAr67);
        boolean boolean72 = stackAr1.equals((java.lang.Object) stackAr57);
        java.lang.Object obj73 = stackAr57.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "[]");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0957");
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
        boolean boolean16 = stackAr1.isEmpty();
        int int17 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0958");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0959");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        boolean boolean7 = stackAr6.isEmpty();
        org.autotest.Stack stackAr9 = createStack((int) (byte) 1);
        boolean boolean10 = stackAr9.isEmpty();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isFull();
        org.autotest.Stack stackAr14 = createStack((int) 'a');
        int int15 = stackAr14.size();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        int int18 = stackAr17.size();
        boolean boolean19 = stackAr17.isFull();
        stackAr14.push((java.lang.Object) stackAr17);
        boolean boolean21 = stackAr14.isEmpty();
        boolean boolean22 = stackAr9.equals((java.lang.Object) boolean21);
        boolean boolean23 = stackAr6.equals((java.lang.Object) boolean22);
        java.lang.Object obj24 = null;
        boolean boolean25 = stackAr6.equals(obj24);
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        boolean boolean30 = stackAr27.isFull();
        int int31 = stackAr27.size();
        int int32 = stackAr27.size();
        int int33 = stackAr27.size();
        stackAr27.push((java.lang.Object) (short) 1);
        int int36 = stackAr27.size();
        boolean boolean37 = stackAr27.isEmpty();
        boolean boolean38 = stackAr6.equals((java.lang.Object) boolean37);
        boolean boolean39 = stackAr1.equals((java.lang.Object) boolean37);
        boolean boolean40 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0960");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr13 = createStack((int) (byte) 1);
        boolean boolean14 = stackAr13.isFull();
        java.lang.String str15 = stackAr13.toString();
        boolean boolean16 = stackAr13.isEmpty();
        boolean boolean17 = stackAr11.equals((java.lang.Object) stackAr13);
        boolean boolean18 = stackAr13.isEmpty();
        stackAr1.push((java.lang.Object) stackAr13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0961");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        java.lang.String str9 = stackAr1.toString();
        java.lang.String str10 = stackAr1.toString();
        boolean boolean11 = stackAr1.isFull();
        int int12 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10.0]" + "'", str9, "[10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10.0]" + "'", str10, "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0962");
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
        int int12 = stackAr7.size();
        java.lang.String str13 = stackAr7.toString();
        boolean boolean15 = stackAr7.equals((java.lang.Object) 3);
        boolean boolean16 = stackAr7.isFull();
        boolean boolean17 = stackAr7.isFull();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        int int20 = stackAr19.size();
        boolean boolean21 = stackAr19.isEmpty();
        boolean boolean22 = stackAr19.isFull();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr19.isFull();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) 1.0d);
        java.lang.String str29 = stackAr26.toString();
        stackAr19.push((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        boolean boolean33 = stackAr32.isFull();
        boolean boolean34 = stackAr26.equals((java.lang.Object) boolean33);
        org.autotest.Stack stackAr36 = createStack((int) '#');
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr26.equals((java.lang.Object) stackAr36);
        boolean boolean39 = stackAr7.equals((java.lang.Object) stackAr36);
        boolean boolean40 = stackAr7.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0963");
        org.autotest.Stack stackAr1 = createStack(3);
        stackAr1.push((java.lang.Object) 0.0d);
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean7 = stackAr6.isFull();
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr6.equals(obj8);
        boolean boolean10 = stackAr6.isFull();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.isFull();
        int int20 = stackAr16.size();
        boolean boolean21 = stackAr16.isFull();
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        boolean boolean25 = stackAr23.equals((java.lang.Object) 1.0d);
        java.lang.String str26 = stackAr23.toString();
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr12.push((java.lang.Object) stackAr23);
        boolean boolean29 = stackAr6.equals((java.lang.Object) stackAr23);
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isEmpty();
        boolean boolean33 = stackAr31.isFull();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr31.isFull();
        boolean boolean36 = stackAr6.equals((java.lang.Object) stackAr31);
        int int37 = stackAr6.size();
        boolean boolean38 = stackAr6.isEmpty();
        java.lang.String str39 = stackAr6.toString();
        java.lang.String str40 = stackAr6.toString();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr43 = createStack((int) '#');
        int int44 = stackAr43.size();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        boolean boolean47 = stackAr46.isFull();
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr46.equals(obj48);
        stackAr43.push((java.lang.Object) boolean49);
        java.lang.Object obj51 = stackAr43.top();
        boolean boolean52 = stackAr6.equals(obj51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + false + "'", obj51, false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0964");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        int int9 = stackAr1.size();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        org.autotest.Stack stackAr13 = createStack((int) (byte) 1);
        boolean boolean14 = stackAr13.isFull();
        java.lang.String str15 = stackAr13.toString();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 10);
        boolean boolean18 = stackAr17.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        stackAr17.push((java.lang.Object) (byte) 1);
        boolean boolean22 = stackAr13.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        int int25 = stackAr24.size();
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isFull();
        stackAr24.push((java.lang.Object) stackAr27);
        boolean boolean31 = stackAr17.equals((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr33 = createStack((int) ' ');
        java.lang.String str34 = stackAr33.toString();
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        boolean boolean39 = stackAr36.isFull();
        boolean boolean40 = stackAr36.isFull();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        int int43 = stackAr42.size();
        stackAr36.push((java.lang.Object) int43);
        boolean boolean45 = stackAr33.equals((java.lang.Object) int43);
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        int int48 = stackAr47.size();
        boolean boolean49 = stackAr47.isEmpty();
        boolean boolean50 = stackAr47.isFull();
        int int51 = stackAr47.size();
        boolean boolean52 = stackAr47.isFull();
        org.autotest.Stack stackAr54 = createStack((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) 1.0d);
        java.lang.String str57 = stackAr54.toString();
        stackAr47.push((java.lang.Object) stackAr54);
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        boolean boolean61 = stackAr60.isFull();
        boolean boolean62 = stackAr54.equals((java.lang.Object) boolean61);
        boolean boolean63 = stackAr54.isFull();
        org.autotest.Stack stackAr65 = createStack((int) (byte) 1);
        int int66 = stackAr65.size();
        int int67 = stackAr65.size();
        org.autotest.Stack stackAr69 = createStack((int) (byte) 1);
        int int70 = stackAr69.size();
        boolean boolean71 = stackAr69.isEmpty();
        boolean boolean72 = stackAr69.isFull();
        int int73 = stackAr69.size();
        boolean boolean74 = stackAr69.isFull();
        org.autotest.Stack stackAr76 = createStack((int) 'a');
        boolean boolean78 = stackAr76.equals((java.lang.Object) 1.0d);
        java.lang.String str79 = stackAr76.toString();
        stackAr69.push((java.lang.Object) stackAr76);
        stackAr65.push((java.lang.Object) stackAr76);
        int int82 = stackAr65.size();
        stackAr54.push((java.lang.Object) stackAr65);
        boolean boolean84 = stackAr33.equals((java.lang.Object) stackAr65);
        stackAr17.push((java.lang.Object) stackAr33);
        boolean boolean86 = stackAr1.equals((java.lang.Object) stackAr33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = stackAr33.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0965");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isFull();
        java.lang.String str6 = stackAr4.toString();
        int int7 = stackAr4.size();
        stackAr4.push((java.lang.Object) (short) 100);
        int int10 = stackAr4.size();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.pop();
        boolean boolean13 = stackAr4.isFull();
        boolean boolean14 = stackAr4.isFull();
        java.lang.String str15 = stackAr4.toString();
        java.lang.String str16 = stackAr4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0966");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isEmpty();
        int int12 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0967");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 1L);
        int int7 = stackAr1.size();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        boolean boolean10 = stackAr9.isFull();
        java.lang.Object obj11 = null;
        boolean boolean12 = stackAr9.equals(obj11);
        boolean boolean13 = stackAr9.isFull();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        int int16 = stackAr15.size();
        int int17 = stackAr15.size();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        int int20 = stackAr19.size();
        boolean boolean21 = stackAr19.isEmpty();
        boolean boolean22 = stackAr19.isFull();
        int int23 = stackAr19.size();
        boolean boolean24 = stackAr19.isFull();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) 1.0d);
        java.lang.String str29 = stackAr26.toString();
        stackAr19.push((java.lang.Object) stackAr26);
        stackAr15.push((java.lang.Object) stackAr26);
        boolean boolean32 = stackAr9.equals((java.lang.Object) stackAr26);
        java.lang.String str33 = stackAr26.toString();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        boolean boolean36 = stackAr35.isFull();
        java.lang.String str37 = stackAr35.toString();
        org.autotest.Stack stackAr39 = createStack((int) (byte) 10);
        boolean boolean40 = stackAr39.isEmpty();
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        stackAr39.push((java.lang.Object) (byte) 1);
        boolean boolean44 = stackAr35.equals((java.lang.Object) stackAr39);
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        int int47 = stackAr46.size();
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        int int50 = stackAr49.size();
        boolean boolean51 = stackAr49.isFull();
        stackAr46.push((java.lang.Object) stackAr49);
        boolean boolean53 = stackAr39.equals((java.lang.Object) stackAr49);
        java.lang.Object obj54 = stackAr39.top();
        stackAr26.push((java.lang.Object) stackAr39);
        boolean boolean56 = stackAr1.equals((java.lang.Object) stackAr39);
        boolean boolean57 = stackAr39.isFull();
        int int58 = stackAr39.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 1 + "'", obj54, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0968");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0969");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        int int5 = stackAr4.size();
        int int6 = stackAr4.size();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr4.push((java.lang.Object) str11);
        java.lang.Object obj13 = stackAr4.top();
        boolean boolean14 = stackAr4.isEmpty();
        java.lang.String str15 = stackAr4.toString();
        boolean boolean16 = stackAr4.isEmpty();
        java.lang.Object obj17 = stackAr4.top();
        boolean boolean18 = stackAr4.isFull();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        boolean boolean24 = stackAr20.isFull();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        stackAr20.push((java.lang.Object) int27);
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        boolean boolean31 = stackAr30.isEmpty();
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        boolean boolean34 = stackAr33.isEmpty();
        int int35 = stackAr33.size();
        boolean boolean36 = stackAr33.isFull();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        int int39 = stackAr38.size();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        int int42 = stackAr41.size();
        boolean boolean43 = stackAr41.isFull();
        stackAr38.push((java.lang.Object) stackAr41);
        boolean boolean45 = stackAr38.isEmpty();
        boolean boolean46 = stackAr33.equals((java.lang.Object) boolean45);
        boolean boolean47 = stackAr30.equals((java.lang.Object) boolean46);
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr30.equals(obj48);
        boolean boolean50 = stackAr30.isFull();
        boolean boolean51 = stackAr20.equals((java.lang.Object) stackAr30);
        boolean boolean52 = stackAr20.isFull();
        boolean boolean53 = stackAr4.equals((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj55 = stackAr1.pop();
        org.autotest.Stack stackAr57 = createStack((int) 'a');
        boolean boolean59 = stackAr57.equals((java.lang.Object) 1.0d);
        java.lang.String str60 = stackAr57.toString();
        boolean boolean61 = stackAr57.isFull();
        int int62 = stackAr57.size();
        int int63 = stackAr57.size();
        boolean boolean64 = stackAr57.isEmpty();
        boolean boolean65 = stackAr57.isEmpty();
        boolean boolean66 = stackAr57.isFull();
        org.autotest.Stack stackAr68 = createStack((int) (byte) 10);
        boolean boolean69 = stackAr68.isEmpty();
        boolean boolean70 = stackAr68.isFull();
        int int71 = stackAr68.size();
        boolean boolean72 = stackAr68.isFull();
        stackAr57.push((java.lang.Object) stackAr68);
        boolean boolean74 = stackAr1.equals((java.lang.Object) stackAr57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "[]" + "'", obj13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[]]" + "'", str15, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "[]" + "'", obj17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0970");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        stackAr1.push((java.lang.Object) (short) 1);
        int int10 = stackAr1.size();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0971");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = stackAr5.toString();
        stackAr1.push((java.lang.Object) str8);
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        java.lang.Object obj12 = stackAr1.pop();
        boolean boolean13 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "[]" + "'", obj10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "[]" + "'", obj12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0972");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) "[[]]");
        boolean boolean11 = stackAr1.isEmpty();
        org.autotest.Stack stackAr13 = createStack((int) 'a');
        boolean boolean14 = stackAr13.isFull();
        java.lang.Object obj15 = null;
        boolean boolean16 = stackAr13.equals(obj15);
        boolean boolean17 = stackAr13.isFull();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr23.isEmpty();
        boolean boolean26 = stackAr23.isFull();
        int int27 = stackAr23.size();
        boolean boolean28 = stackAr23.isFull();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        boolean boolean32 = stackAr30.equals((java.lang.Object) 1.0d);
        java.lang.String str33 = stackAr30.toString();
        stackAr23.push((java.lang.Object) stackAr30);
        stackAr19.push((java.lang.Object) stackAr30);
        boolean boolean36 = stackAr13.equals((java.lang.Object) stackAr30);
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj38 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "[]");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0973");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        int int7 = stackAr6.size();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        stackAr6.push((java.lang.Object) stackAr9);
        java.lang.Object obj13 = stackAr6.pop();
        java.lang.String str14 = stackAr6.toString();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr16.isEmpty();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        boolean boolean20 = stackAr19.isEmpty();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isFull();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        int int25 = stackAr24.size();
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isFull();
        stackAr24.push((java.lang.Object) stackAr27);
        boolean boolean31 = stackAr24.isEmpty();
        boolean boolean32 = stackAr19.equals((java.lang.Object) boolean31);
        boolean boolean33 = stackAr16.equals((java.lang.Object) boolean32);
        java.lang.Object obj34 = null;
        boolean boolean35 = stackAr16.equals(obj34);
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isEmpty();
        boolean boolean40 = stackAr37.isFull();
        int int41 = stackAr37.size();
        int int42 = stackAr37.size();
        int int43 = stackAr37.size();
        stackAr37.push((java.lang.Object) (short) 1);
        int int46 = stackAr37.size();
        boolean boolean47 = stackAr37.isEmpty();
        boolean boolean48 = stackAr16.equals((java.lang.Object) boolean47);
        boolean boolean49 = stackAr6.equals((java.lang.Object) stackAr16);
        boolean boolean50 = stackAr1.equals((java.lang.Object) boolean49);
        java.lang.String str51 = stackAr1.toString();
        org.autotest.Stack stackAr53 = createStack((int) (byte) 1);
        int int54 = stackAr53.size();
        int int55 = stackAr53.size();
        org.autotest.Stack stackAr57 = createStack((int) (byte) 1);
        int int58 = stackAr57.size();
        boolean boolean59 = stackAr57.isEmpty();
        boolean boolean60 = stackAr57.isFull();
        int int61 = stackAr57.size();
        boolean boolean62 = stackAr57.isFull();
        org.autotest.Stack stackAr64 = createStack((int) 'a');
        boolean boolean66 = stackAr64.equals((java.lang.Object) 1.0d);
        java.lang.String str67 = stackAr64.toString();
        stackAr57.push((java.lang.Object) stackAr64);
        stackAr53.push((java.lang.Object) stackAr64);
        java.lang.Object obj70 = stackAr53.pop();
        java.lang.String str71 = stackAr53.toString();
        int int72 = stackAr53.size();
        java.lang.String str73 = stackAr53.toString();
        boolean boolean74 = stackAr1.equals((java.lang.Object) str73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0974");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr5.equals(obj7);
        boolean boolean9 = stackAr5.isFull();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean11 = stackAr1.isEmpty();
        boolean boolean12 = stackAr1.isEmpty();
        boolean boolean13 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0975");
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
        boolean boolean27 = stackAr18.isEmpty();
        org.autotest.Stack stackAr29 = createStack(10);
        int int30 = stackAr29.size();
        boolean boolean31 = stackAr29.isFull();
        int int32 = stackAr29.size();
        boolean boolean33 = stackAr18.equals((java.lang.Object) int32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr18.pop();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0976");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        java.lang.String str9 = stackAr4.toString();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        boolean boolean12 = stackAr11.isFull();
        java.lang.Object obj13 = null;
        boolean boolean14 = stackAr11.equals(obj13);
        boolean boolean15 = stackAr11.isFull();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr11.equals((java.lang.Object) stackAr17);
        int int21 = stackAr17.size();
        org.autotest.Stack stackAr22 = createStack();
        boolean boolean23 = stackAr22.isEmpty();
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean25 = stackAr17.isFull();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        boolean boolean28 = stackAr27.isFull();
        boolean boolean29 = stackAr27.isEmpty();
        boolean boolean30 = stackAr17.equals((java.lang.Object) stackAr27);
        boolean boolean31 = stackAr4.equals((java.lang.Object) stackAr17);
        boolean boolean32 = stackAr17.isFull();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        boolean boolean35 = stackAr34.isFull();
        stackAr34.push((java.lang.Object) (short) -1);
        java.lang.Object obj38 = stackAr34.top();
        boolean boolean39 = stackAr17.equals(obj38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0977");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 10);
        boolean boolean6 = stackAr5.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        stackAr5.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr5.equals((java.lang.Object) stackAr15);
        java.lang.Object obj20 = stackAr5.top();
        java.lang.String str21 = stackAr5.toString();
        boolean boolean22 = stackAr5.isFull();
        boolean boolean23 = stackAr5.isFull();
        java.lang.Object obj24 = stackAr5.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[1]" + "'", str21, "[1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0978");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) '#');
        stackAr1.push((java.lang.Object) '#');
        boolean boolean8 = stackAr1.isFull();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isFull();
        org.autotest.Stack stackAr16 = createStack((int) 'a');
        boolean boolean17 = stackAr16.isFull();
        int int18 = stackAr16.size();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        int int24 = stackAr20.size();
        boolean boolean25 = stackAr20.isFull();
        java.lang.String str26 = stackAr20.toString();
        boolean boolean27 = stackAr20.isFull();
        stackAr16.push((java.lang.Object) boolean27);
        stackAr16.push((java.lang.Object) 100.0f);
        boolean boolean31 = stackAr16.isEmpty();
        boolean boolean32 = stackAr10.equals((java.lang.Object) stackAr16);
        boolean boolean33 = stackAr16.isEmpty();
        java.lang.Object obj34 = stackAr16.top();
        java.lang.Object obj35 = stackAr16.top();
        boolean boolean36 = stackAr1.equals((java.lang.Object) stackAr16);
        java.lang.Object obj37 = stackAr1.top();
        boolean boolean38 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0979");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) boolean7);
        java.lang.String str9 = stackAr1.toString();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0980");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 10);
        boolean boolean6 = stackAr5.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        stackAr5.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isFull();
        stackAr12.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr5.equals((java.lang.Object) stackAr15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr15.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0981");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        int int7 = stackAr6.size();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        stackAr6.push((java.lang.Object) stackAr9);
        boolean boolean13 = stackAr6.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) boolean13);
        int int15 = stackAr1.size();
        int int16 = stackAr1.size();
        java.lang.String str17 = stackAr1.toString();
        org.autotest.Stack stackAr19 = createStack((int) 'a');
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isEmpty();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        int int26 = stackAr24.size();
        org.autotest.Stack stackAr28 = createStack((int) (byte) 1);
        int int29 = stackAr28.size();
        boolean boolean30 = stackAr28.isEmpty();
        boolean boolean31 = stackAr28.isFull();
        int int32 = stackAr28.size();
        boolean boolean33 = stackAr28.isFull();
        java.lang.String str34 = stackAr28.toString();
        boolean boolean35 = stackAr28.isFull();
        stackAr24.push((java.lang.Object) boolean35);
        stackAr24.push((java.lang.Object) 100.0f);
        boolean boolean39 = stackAr24.isEmpty();
        boolean boolean40 = stackAr19.equals((java.lang.Object) stackAr24);
        org.autotest.Stack stackAr42 = createStack(10);
        int int43 = stackAr42.size();
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        boolean boolean46 = stackAr45.isFull();
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        int int49 = stackAr48.size();
        boolean boolean50 = stackAr48.isEmpty();
        boolean boolean51 = stackAr48.isFull();
        boolean boolean52 = stackAr48.isFull();
        int int53 = stackAr48.size();
        stackAr45.push((java.lang.Object) stackAr48);
        boolean boolean55 = stackAr42.equals((java.lang.Object) stackAr48);
        int int56 = stackAr48.size();
        java.lang.String str57 = stackAr48.toString();
        stackAr19.push((java.lang.Object) stackAr48);
        boolean boolean59 = stackAr1.equals((java.lang.Object) stackAr48);
        boolean boolean60 = stackAr48.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0982");
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
        boolean boolean16 = stackAr12.equals((java.lang.Object) (byte) 1);
        boolean boolean17 = stackAr12.isFull();
        int int18 = stackAr12.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0983");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        int int8 = stackAr6.size();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isFull();
        int int14 = stackAr10.size();
        boolean boolean15 = stackAr10.isFull();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        stackAr10.push((java.lang.Object) stackAr17);
        stackAr6.push((java.lang.Object) stackAr17);
        java.lang.Object obj23 = stackAr6.pop();
        boolean boolean24 = stackAr1.equals(obj23);
        int int25 = stackAr1.size();
        java.lang.String str26 = stackAr1.toString();
        boolean boolean27 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0984");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        int int9 = stackAr1.size();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.String str11 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr1.pop();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0985");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        boolean boolean8 = stackAr7.isFull();
        java.lang.String str9 = stackAr7.toString();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 10);
        boolean boolean12 = stackAr11.isEmpty();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        stackAr11.push((java.lang.Object) (byte) 1);
        boolean boolean16 = stackAr7.equals((java.lang.Object) stackAr11);
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        int int19 = stackAr18.size();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isFull();
        stackAr18.push((java.lang.Object) stackAr21);
        boolean boolean25 = stackAr11.equals((java.lang.Object) stackAr21);
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        boolean boolean28 = stackAr27.isFull();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isEmpty();
        boolean boolean33 = stackAr30.isFull();
        boolean boolean34 = stackAr30.isFull();
        int int35 = stackAr30.size();
        stackAr27.push((java.lang.Object) stackAr30);
        boolean boolean37 = stackAr21.equals((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        boolean boolean40 = stackAr39.isFull();
        java.lang.Object obj41 = null;
        boolean boolean42 = stackAr39.equals(obj41);
        boolean boolean43 = stackAr39.isFull();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        int int46 = stackAr45.size();
        int int47 = stackAr45.size();
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        int int50 = stackAr49.size();
        boolean boolean51 = stackAr49.isEmpty();
        boolean boolean52 = stackAr49.isFull();
        int int53 = stackAr49.size();
        boolean boolean54 = stackAr49.isFull();
        org.autotest.Stack stackAr56 = createStack((int) 'a');
        boolean boolean58 = stackAr56.equals((java.lang.Object) 1.0d);
        java.lang.String str59 = stackAr56.toString();
        stackAr49.push((java.lang.Object) stackAr56);
        stackAr45.push((java.lang.Object) stackAr56);
        boolean boolean62 = stackAr39.equals((java.lang.Object) stackAr56);
        java.lang.Object obj63 = new java.lang.Object();
        boolean boolean64 = stackAr56.equals(obj63);
        org.autotest.Stack stackAr66 = createStack((int) (byte) 1);
        int int67 = stackAr66.size();
        boolean boolean68 = stackAr56.equals((java.lang.Object) stackAr66);
        org.autotest.Stack stackAr70 = createStack((int) 'a');
        boolean boolean71 = stackAr70.isFull();
        org.autotest.Stack stackAr73 = createStack((int) (byte) 1);
        int int74 = stackAr73.size();
        boolean boolean75 = stackAr73.isEmpty();
        boolean boolean76 = stackAr73.isFull();
        boolean boolean77 = stackAr73.isFull();
        int int78 = stackAr73.size();
        stackAr70.push((java.lang.Object) stackAr73);
        stackAr56.push((java.lang.Object) stackAr70);
        stackAr27.push((java.lang.Object) stackAr70);
        boolean boolean82 = stackAr70.isFull();
        boolean boolean83 = stackAr1.equals((java.lang.Object) boolean82);
        org.autotest.Stack stackAr85 = createStack((int) 'a');
        int int86 = stackAr85.size();
        org.autotest.Stack stackAr88 = createStack((int) 'a');
        int int89 = stackAr88.size();
        boolean boolean90 = stackAr88.isFull();
        stackAr85.push((java.lang.Object) stackAr88);
        stackAr1.push((java.lang.Object) stackAr88);
        org.autotest.Stack stackAr94 = createStack((int) 'a');
        java.lang.String str95 = stackAr94.toString();
        stackAr94.push((java.lang.Object) 1.0d);
        java.lang.Object obj98 = stackAr94.top();
        boolean boolean99 = stackAr88.equals(obj98);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "[]" + "'", str95, "[]");
        org.junit.Assert.assertEquals("'" + obj98 + "' != '" + 1.0d + "'", obj98, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0986");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isFull();
        java.lang.String str5 = stackAr3.toString();
        boolean boolean6 = stackAr3.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr3);
        int int8 = stackAr1.size();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        boolean boolean11 = stackAr10.isFull();
        java.lang.String str12 = stackAr10.toString();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 10);
        boolean boolean15 = stackAr14.isEmpty();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        stackAr14.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackAr10.equals((java.lang.Object) stackAr14);
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        int int22 = stackAr21.size();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isFull();
        stackAr21.push((java.lang.Object) stackAr24);
        boolean boolean28 = stackAr14.equals((java.lang.Object) stackAr24);
        java.lang.Object obj29 = stackAr14.top();
        int int30 = stackAr14.size();
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isEmpty();
        boolean boolean35 = stackAr32.isFull();
        int int36 = stackAr32.size();
        boolean boolean37 = stackAr32.isFull();
        java.lang.String str38 = stackAr32.toString();
        boolean boolean39 = stackAr32.isFull();
        boolean boolean40 = stackAr32.isEmpty();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        stackAr32.push((java.lang.Object) stackAr42);
        boolean boolean46 = stackAr32.isEmpty();
        java.lang.String str47 = stackAr32.toString();
        stackAr14.push((java.lang.Object) stackAr32);
        java.lang.String str49 = stackAr14.toString();
        boolean boolean50 = stackAr1.equals((java.lang.Object) str49);
        boolean boolean51 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[[]]" + "'", str47, "[[]]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[1,[[]]]" + "'", str49, "[1,[[]]]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0987");
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
        java.lang.Object obj22 = stackAr1.top();
        java.lang.Object obj23 = stackAr1.pop();
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) 1.0d);
        java.lang.String str28 = stackAr25.toString();
        stackAr25.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        boolean boolean33 = stackAr32.isFull();
        java.lang.String str34 = stackAr32.toString();
        org.autotest.Stack stackAr36 = createStack((int) (byte) 10);
        boolean boolean37 = stackAr36.isEmpty();
        org.autotest.Stack stackAr39 = createStack((int) (byte) 1);
        stackAr36.push((java.lang.Object) (byte) 1);
        boolean boolean41 = stackAr32.equals((java.lang.Object) stackAr36);
        org.autotest.Stack stackAr43 = createStack((int) 'a');
        int int44 = stackAr43.size();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        int int47 = stackAr46.size();
        boolean boolean48 = stackAr46.isFull();
        stackAr43.push((java.lang.Object) stackAr46);
        boolean boolean50 = stackAr36.equals((java.lang.Object) stackAr46);
        stackAr25.push((java.lang.Object) boolean50);
        stackAr25.push((java.lang.Object) "");
        org.autotest.Stack stackAr55 = createStack((int) 'a');
        boolean boolean56 = stackAr55.isFull();
        java.lang.Object obj57 = null;
        boolean boolean58 = stackAr55.equals(obj57);
        boolean boolean59 = stackAr55.isFull();
        org.autotest.Stack stackAr61 = createStack((int) (byte) 1);
        int int62 = stackAr61.size();
        int int63 = stackAr61.size();
        boolean boolean64 = stackAr55.equals((java.lang.Object) stackAr61);
        int int65 = stackAr61.size();
        boolean boolean66 = stackAr61.isFull();
        org.autotest.Stack stackAr68 = createStack((int) (byte) 1);
        boolean boolean69 = stackAr68.isEmpty();
        int int70 = stackAr68.size();
        boolean boolean71 = stackAr68.isFull();
        org.autotest.Stack stackAr73 = createStack((int) 'a');
        int int74 = stackAr73.size();
        org.autotest.Stack stackAr76 = createStack((int) 'a');
        int int77 = stackAr76.size();
        boolean boolean78 = stackAr76.isFull();
        stackAr73.push((java.lang.Object) stackAr76);
        boolean boolean80 = stackAr73.isEmpty();
        boolean boolean81 = stackAr68.equals((java.lang.Object) boolean80);
        stackAr61.push((java.lang.Object) stackAr68);
        boolean boolean83 = stackAr25.equals((java.lang.Object) stackAr68);
        boolean boolean84 = stackAr68.isFull();
        stackAr1.push((java.lang.Object) stackAr68);
        boolean boolean86 = stackAr1.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "[]" + "'", obj22, "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "[]" + "'", obj23, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0988");
        org.autotest.Stack stackAr1 = createStack(3);
        stackAr1.push((java.lang.Object) 0.0d);
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean7 = stackAr6.isFull();
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr6.equals(obj8);
        boolean boolean10 = stackAr6.isFull();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr6.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean18 = stackAr17.isFull();
        java.lang.Object obj19 = null;
        boolean boolean20 = stackAr17.equals(obj19);
        boolean boolean21 = stackAr17.isFull();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        int int25 = stackAr23.size();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        boolean boolean30 = stackAr27.isFull();
        int int31 = stackAr27.size();
        boolean boolean32 = stackAr27.isFull();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) 1.0d);
        java.lang.String str37 = stackAr34.toString();
        stackAr27.push((java.lang.Object) stackAr34);
        stackAr23.push((java.lang.Object) stackAr34);
        boolean boolean40 = stackAr17.equals((java.lang.Object) stackAr34);
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        boolean boolean43 = stackAr42.isEmpty();
        boolean boolean44 = stackAr42.isFull();
        int int45 = stackAr42.size();
        boolean boolean46 = stackAr42.isFull();
        boolean boolean47 = stackAr17.equals((java.lang.Object) stackAr42);
        boolean boolean48 = stackAr12.equals((java.lang.Object) stackAr42);
        org.autotest.Stack stackAr50 = createStack((int) ' ');
        java.lang.String str51 = stackAr50.toString();
        int int52 = stackAr50.size();
        boolean boolean53 = stackAr50.isFull();
        java.lang.Object obj54 = null;
        stackAr50.push(obj54);
        stackAr12.push((java.lang.Object) stackAr50);
        java.lang.Object obj57 = stackAr12.top();
        boolean boolean58 = stackAr1.equals((java.lang.Object) stackAr12);
        int int59 = stackAr12.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "[null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "[null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "[null]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0989");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0990");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        boolean boolean7 = stackAr6.isEmpty();
        int int8 = stackAr6.size();
        boolean boolean9 = stackAr6.isFull();
        java.lang.String str10 = stackAr6.toString();
        int int11 = stackAr6.size();
        stackAr6.push((java.lang.Object) 10.0d);
        int int14 = stackAr6.size();
        java.lang.Object obj15 = stackAr6.top();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        int int18 = stackAr17.size();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isFull();
        stackAr17.push((java.lang.Object) stackAr20);
        boolean boolean24 = stackAr6.equals((java.lang.Object) stackAr17);
        java.lang.Object obj25 = stackAr17.pop();
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.Object obj27 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0991");
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
        stackAr1.push((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = stackAr1.top();
        org.autotest.Stack stackAr29 = createStack(10);
        int int30 = stackAr29.size();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        boolean boolean33 = stackAr32.isFull();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        boolean boolean38 = stackAr35.isFull();
        boolean boolean39 = stackAr35.isFull();
        int int40 = stackAr35.size();
        stackAr32.push((java.lang.Object) stackAr35);
        boolean boolean42 = stackAr29.equals((java.lang.Object) stackAr35);
        int int43 = stackAr35.size();
        boolean boolean44 = stackAr35.isEmpty();
        stackAr1.push((java.lang.Object) stackAr35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = stackAr35.pop();
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
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0992");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        boolean boolean12 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) boolean12);
        boolean boolean14 = stackAr1.isEmpty();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr1.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = stackAr1.top();
        int int19 = stackAr1.size();
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        int int22 = stackAr21.size();
        int int23 = stackAr21.size();
        org.autotest.Stack stackAr25 = createStack((int) (byte) 1);
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        boolean boolean28 = stackAr25.isFull();
        int int29 = stackAr25.size();
        boolean boolean30 = stackAr25.isFull();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) 1.0d);
        java.lang.String str35 = stackAr32.toString();
        stackAr25.push((java.lang.Object) stackAr32);
        stackAr21.push((java.lang.Object) stackAr32);
        int int38 = stackAr21.size();
        int int39 = stackAr21.size();
        org.autotest.Stack stackAr41 = createStack(10);
        int int42 = stackAr41.size();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean45 = stackAr44.isFull();
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        int int48 = stackAr47.size();
        boolean boolean49 = stackAr47.isEmpty();
        boolean boolean50 = stackAr47.isFull();
        boolean boolean51 = stackAr47.isFull();
        int int52 = stackAr47.size();
        stackAr44.push((java.lang.Object) stackAr47);
        boolean boolean54 = stackAr41.equals((java.lang.Object) stackAr47);
        boolean boolean55 = stackAr21.equals((java.lang.Object) stackAr47);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0993");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        boolean boolean11 = stackAr10.isFull();
        stackAr10.push((java.lang.Object) (short) -1);
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.pop();
        boolean boolean16 = stackAr1.equals(obj15);
        java.lang.Object obj17 = stackAr1.pop();
        boolean boolean18 = stackAr1.isFull();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = null;
        boolean boolean23 = stackAr20.equals(obj22);
        boolean boolean24 = stackAr20.isFull();
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        int int27 = stackAr26.size();
        int int28 = stackAr26.size();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isEmpty();
        boolean boolean33 = stackAr30.isFull();
        int int34 = stackAr30.size();
        boolean boolean35 = stackAr30.isFull();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) 1.0d);
        java.lang.String str40 = stackAr37.toString();
        stackAr30.push((java.lang.Object) stackAr37);
        stackAr26.push((java.lang.Object) stackAr37);
        boolean boolean43 = stackAr20.equals((java.lang.Object) stackAr37);
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        boolean boolean47 = stackAr45.equals((java.lang.Object) 1.0d);
        java.lang.String str48 = stackAr45.toString();
        stackAr45.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        boolean boolean53 = stackAr52.isFull();
        java.lang.String str54 = stackAr52.toString();
        org.autotest.Stack stackAr56 = createStack((int) (byte) 10);
        boolean boolean57 = stackAr56.isEmpty();
        org.autotest.Stack stackAr59 = createStack((int) (byte) 1);
        stackAr56.push((java.lang.Object) (byte) 1);
        boolean boolean61 = stackAr52.equals((java.lang.Object) stackAr56);
        org.autotest.Stack stackAr63 = createStack((int) 'a');
        int int64 = stackAr63.size();
        org.autotest.Stack stackAr66 = createStack((int) 'a');
        int int67 = stackAr66.size();
        boolean boolean68 = stackAr66.isFull();
        stackAr63.push((java.lang.Object) stackAr66);
        boolean boolean70 = stackAr56.equals((java.lang.Object) stackAr66);
        stackAr45.push((java.lang.Object) boolean70);
        org.autotest.Stack stackAr73 = createStack((int) (byte) 1);
        int int74 = stackAr73.size();
        java.lang.String str75 = stackAr73.toString();
        java.lang.String str76 = stackAr73.toString();
        stackAr45.push((java.lang.Object) stackAr73);
        boolean boolean78 = stackAr45.isEmpty();
        java.lang.Object obj79 = null;
        boolean boolean80 = stackAr45.equals(obj79);
        java.lang.Object obj81 = stackAr45.pop();
        stackAr20.push(obj81);
        stackAr1.push(obj81);
        java.lang.Object obj84 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0d + "'", obj17, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[]" + "'", str75, "[]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "[]");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "[]");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0994");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        stackAr9.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr9.isEmpty();
        boolean boolean17 = stackAr9.isEmpty();
        java.lang.Object obj18 = stackAr9.top();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj20 = stackAr1.pop();
        boolean boolean21 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0995");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean13 = stackAr12.isFull();
        java.lang.Object obj14 = null;
        boolean boolean15 = stackAr12.equals(obj14);
        boolean boolean16 = stackAr12.isFull();
        org.autotest.Stack stackAr18 = createStack((int) (byte) 1);
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        int int26 = stackAr22.size();
        boolean boolean27 = stackAr22.isFull();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) 1.0d);
        java.lang.String str32 = stackAr29.toString();
        stackAr22.push((java.lang.Object) stackAr29);
        stackAr18.push((java.lang.Object) stackAr29);
        boolean boolean35 = stackAr12.equals((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        boolean boolean38 = stackAr37.isEmpty();
        boolean boolean39 = stackAr37.isFull();
        int int40 = stackAr37.size();
        boolean boolean41 = stackAr37.isFull();
        boolean boolean42 = stackAr12.equals((java.lang.Object) stackAr37);
        boolean boolean43 = stackAr7.equals((java.lang.Object) stackAr37);
        boolean boolean44 = stackAr7.isEmpty();
        org.autotest.Stack stackAr46 = createStack((int) (byte) 1);
        int int47 = stackAr46.size();
        int int48 = stackAr46.size();
        org.autotest.Stack stackAr50 = createStack((int) 'a');
        boolean boolean52 = stackAr50.equals((java.lang.Object) 1.0d);
        java.lang.String str53 = stackAr50.toString();
        stackAr46.push((java.lang.Object) str53);
        java.lang.Object obj55 = stackAr46.top();
        boolean boolean56 = stackAr46.isEmpty();
        java.lang.String str57 = stackAr46.toString();
        stackAr7.push((java.lang.Object) stackAr46);
        int int59 = stackAr7.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "[]" + "'", obj55, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[[]]" + "'", str57, "[[]]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0996");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean7 = stackAr6.isFull();
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr6.equals(obj8);
        boolean boolean10 = stackAr6.isFull();
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.isFull();
        int int20 = stackAr16.size();
        boolean boolean21 = stackAr16.isFull();
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        boolean boolean25 = stackAr23.equals((java.lang.Object) 1.0d);
        java.lang.String str26 = stackAr23.toString();
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr12.push((java.lang.Object) stackAr23);
        boolean boolean29 = stackAr6.equals((java.lang.Object) stackAr23);
        boolean boolean30 = stackAr1.equals((java.lang.Object) stackAr23);
        boolean boolean31 = stackAr23.isEmpty();
        boolean boolean32 = stackAr23.isEmpty();
        org.autotest.Stack stackAr34 = createStack(10);
        int int35 = stackAr34.size();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean38 = stackAr37.isFull();
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isEmpty();
        boolean boolean43 = stackAr40.isFull();
        boolean boolean44 = stackAr40.isFull();
        int int45 = stackAr40.size();
        stackAr37.push((java.lang.Object) stackAr40);
        boolean boolean47 = stackAr34.equals((java.lang.Object) stackAr40);
        boolean boolean48 = stackAr23.equals((java.lang.Object) stackAr40);
        org.autotest.Stack stackAr50 = createStack((int) (byte) 1);
        boolean boolean51 = stackAr50.isEmpty();
        java.lang.String str52 = stackAr50.toString();
        int int53 = stackAr50.size();
        org.autotest.Stack stackAr55 = createStack(10);
        int int56 = stackAr55.size();
        org.autotest.Stack stackAr58 = createStack(10);
        int int59 = stackAr58.size();
        stackAr55.push((java.lang.Object) int59);
        stackAr50.push((java.lang.Object) stackAr55);
        stackAr40.push((java.lang.Object) stackAr50);
        boolean boolean63 = stackAr40.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0997");
        org.autotest.Stack stackAr1 = createStack(10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0998");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test0999");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) "[[]]");
        boolean boolean11 = stackAr1.isEmpty();
        org.autotest.Stack stackAr13 = createStack((int) 'a');
        boolean boolean14 = stackAr13.isFull();
        java.lang.Object obj15 = null;
        boolean boolean16 = stackAr13.equals(obj15);
        boolean boolean17 = stackAr13.isFull();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 1);
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr23.isEmpty();
        boolean boolean26 = stackAr23.isFull();
        int int27 = stackAr23.size();
        boolean boolean28 = stackAr23.isFull();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        boolean boolean32 = stackAr30.equals((java.lang.Object) 1.0d);
        java.lang.String str33 = stackAr30.toString();
        stackAr23.push((java.lang.Object) stackAr30);
        stackAr19.push((java.lang.Object) stackAr30);
        boolean boolean36 = stackAr13.equals((java.lang.Object) stackAr30);
        stackAr1.push((java.lang.Object) stackAr13);
        org.autotest.Stack stackAr39 = createStack((int) ' ');
        boolean boolean40 = stackAr39.isEmpty();
        boolean boolean41 = stackAr39.isFull();
        boolean boolean42 = stackAr13.equals((java.lang.Object) stackAr39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = stackAr39.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test1000");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) stackAr11);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.String str16 = stackAr1.toString();
        java.lang.Object obj17 = stackAr1.pop();
        boolean boolean19 = stackAr1.equals((java.lang.Object) "[true]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }
}

