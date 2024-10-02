package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0851");
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
        java.lang.String str57 = stackAr39.toString();
        boolean boolean58 = stackAr39.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[1]" + "'", str57, "[1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0852");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0853");
        org.autotest.Stack stackAr1 = createStack(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0854");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        boolean boolean9 = stackAr1.isEmpty();
        int int10 = stackAr1.size();
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
        java.lang.Object obj29 = stackAr12.top();
        java.lang.Object obj30 = stackAr12.pop();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr12);
        boolean boolean32 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0855");
        org.autotest.Stack stackAr1 = createStack(1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0856");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isFull();
        java.lang.String str5 = stackAr3.toString();
        boolean boolean6 = stackAr3.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr9 = createStack((int) ' ');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr9.isFull();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        boolean boolean15 = stackAr14.isEmpty();
        java.lang.String str16 = stackAr14.toString();
        stackAr9.push((java.lang.Object) stackAr14);
        stackAr3.push((java.lang.Object) stackAr9);
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        java.lang.String str22 = stackAr20.toString();
        java.lang.String str23 = stackAr20.toString();
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        boolean boolean26 = stackAr25.isFull();
        java.lang.Object obj27 = null;
        boolean boolean28 = stackAr25.equals(obj27);
        boolean boolean29 = stackAr25.isFull();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        int int33 = stackAr31.size();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        boolean boolean38 = stackAr35.isFull();
        int int39 = stackAr35.size();
        boolean boolean40 = stackAr35.isFull();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) 1.0d);
        java.lang.String str45 = stackAr42.toString();
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr31.push((java.lang.Object) stackAr42);
        boolean boolean48 = stackAr25.equals((java.lang.Object) stackAr42);
        boolean boolean49 = stackAr20.equals((java.lang.Object) stackAr42);
        boolean boolean50 = stackAr42.isEmpty();
        boolean boolean51 = stackAr42.isFull();
        boolean boolean52 = stackAr42.isFull();
        boolean boolean53 = stackAr3.equals((java.lang.Object) boolean52);
        java.lang.Object obj54 = stackAr3.pop();
        java.lang.String str55 = stackAr3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "[[]]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0857");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (byte) 1);
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr7);
        int int11 = stackAr1.size();
        boolean boolean12 = stackAr1.isFull();
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0858");
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
        int int18 = stackAr11.size();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        int int24 = stackAr20.size();
        java.lang.String str25 = stackAr20.toString();
        boolean boolean26 = stackAr20.isEmpty();
        boolean boolean27 = stackAr11.equals((java.lang.Object) stackAr20);
        int int28 = stackAr11.size();
        int int29 = stackAr11.size();
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        int int32 = stackAr31.size();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isFull();
        stackAr31.push((java.lang.Object) stackAr34);
        boolean boolean38 = stackAr34.isEmpty();
        java.lang.String str39 = stackAr34.toString();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        boolean boolean42 = stackAr41.isFull();
        java.lang.Object obj43 = null;
        boolean boolean44 = stackAr41.equals(obj43);
        boolean boolean45 = stackAr41.isFull();
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        int int48 = stackAr47.size();
        int int49 = stackAr47.size();
        boolean boolean50 = stackAr41.equals((java.lang.Object) stackAr47);
        int int51 = stackAr47.size();
        org.autotest.Stack stackAr52 = createStack();
        boolean boolean53 = stackAr52.isEmpty();
        stackAr47.push((java.lang.Object) stackAr52);
        boolean boolean55 = stackAr47.isFull();
        org.autotest.Stack stackAr57 = createStack((int) (byte) 1);
        boolean boolean58 = stackAr57.isFull();
        boolean boolean59 = stackAr57.isEmpty();
        boolean boolean60 = stackAr47.equals((java.lang.Object) stackAr57);
        boolean boolean61 = stackAr34.equals((java.lang.Object) stackAr47);
        boolean boolean62 = stackAr11.equals((java.lang.Object) stackAr47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = stackAr11.top();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0859");
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
        int int13 = stackAr1.size();
        boolean boolean14 = stackAr1.isEmpty();
        java.lang.String str15 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[]]" + "'", str15, "[[]]");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0860");
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
        boolean boolean16 = stackAr7.isEmpty();
        boolean boolean17 = stackAr7.isFull();
        java.lang.String str18 = stackAr7.toString();
        java.lang.String str19 = stackAr7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0861");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0862");
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
        java.lang.String str17 = stackAr7.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0.0]" + "'", str17, "[0.0]");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0863");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isFull();
        boolean boolean12 = stackAr9.isEmpty();
        int int13 = stackAr9.size();
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        boolean boolean16 = stackAr15.isFull();
        java.lang.String str17 = stackAr15.toString();
        int int18 = stackAr15.size();
        stackAr15.push((java.lang.Object) (short) 100);
        int int21 = stackAr15.size();
        stackAr9.push((java.lang.Object) int21);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean24 = stackAr9.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0864");
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
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean22 = stackAr21.isFull();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        boolean boolean28 = stackAr24.isFull();
        int int29 = stackAr24.size();
        stackAr21.push((java.lang.Object) stackAr24);
        boolean boolean31 = stackAr15.equals((java.lang.Object) stackAr21);
        int int32 = stackAr15.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackAr15.pop();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0865");
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
        boolean boolean32 = stackAr22.isFull();
        java.lang.String str33 = stackAr22.toString();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        boolean boolean36 = stackAr35.isEmpty();
        java.lang.String str37 = stackAr35.toString();
        int int38 = stackAr35.size();
        int int39 = stackAr35.size();
        boolean boolean40 = stackAr35.isEmpty();
        boolean boolean41 = stackAr22.equals((java.lang.Object) stackAr35);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0866");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        org.autotest.Stack stackAr3 = createStack((int) 'a');
        boolean boolean4 = stackAr3.isFull();
        java.lang.Object obj5 = null;
        boolean boolean6 = stackAr3.equals(obj5);
        boolean boolean7 = stackAr3.isFull();
        org.autotest.Stack stackAr9 = createStack((int) (byte) 1);
        int int10 = stackAr9.size();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr3.equals((java.lang.Object) stackAr9);
        int int13 = stackAr9.size();
        int int14 = stackAr9.size();
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr9);
        org.autotest.Stack stackAr17 = createStack(100);
        boolean boolean18 = stackAr17.isFull();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        boolean boolean21 = stackAr20.isFull();
        java.lang.String str22 = stackAr20.toString();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 10);
        boolean boolean25 = stackAr24.isEmpty();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        stackAr24.push((java.lang.Object) (byte) 1);
        boolean boolean29 = stackAr20.equals((java.lang.Object) stackAr24);
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        int int32 = stackAr31.size();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isFull();
        stackAr31.push((java.lang.Object) stackAr34);
        boolean boolean38 = stackAr24.equals((java.lang.Object) stackAr34);
        java.lang.Object obj39 = stackAr24.top();
        java.lang.String str40 = stackAr24.toString();
        boolean boolean41 = stackAr17.equals((java.lang.Object) stackAr24);
        stackAr24.push((java.lang.Object) (-1));
        stackAr9.push((java.lang.Object) stackAr24);
        int int45 = stackAr24.size();
        int int46 = stackAr24.size();
        org.autotest.Stack stackAr48 = createStack((int) 'a');
        boolean boolean49 = stackAr48.isFull();
        java.lang.Object obj50 = null;
        boolean boolean51 = stackAr48.equals(obj50);
        boolean boolean52 = stackAr48.isFull();
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        int int55 = stackAr54.size();
        int int56 = stackAr54.size();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        int int59 = stackAr58.size();
        boolean boolean60 = stackAr58.isEmpty();
        boolean boolean61 = stackAr58.isFull();
        int int62 = stackAr58.size();
        boolean boolean63 = stackAr58.isFull();
        org.autotest.Stack stackAr65 = createStack((int) 'a');
        boolean boolean67 = stackAr65.equals((java.lang.Object) 1.0d);
        java.lang.String str68 = stackAr65.toString();
        stackAr58.push((java.lang.Object) stackAr65);
        stackAr54.push((java.lang.Object) stackAr65);
        boolean boolean71 = stackAr48.equals((java.lang.Object) stackAr65);
        java.lang.Object obj72 = new java.lang.Object();
        boolean boolean73 = stackAr65.equals(obj72);
        org.autotest.Stack stackAr75 = createStack((int) (byte) 1);
        int int76 = stackAr75.size();
        boolean boolean77 = stackAr65.equals((java.lang.Object) stackAr75);
        org.autotest.Stack stackAr79 = createStack((int) 'a');
        boolean boolean80 = stackAr79.isFull();
        org.autotest.Stack stackAr82 = createStack((int) (byte) 1);
        int int83 = stackAr82.size();
        boolean boolean84 = stackAr82.isEmpty();
        boolean boolean85 = stackAr82.isFull();
        boolean boolean86 = stackAr82.isFull();
        int int87 = stackAr82.size();
        stackAr79.push((java.lang.Object) stackAr82);
        stackAr65.push((java.lang.Object) stackAr79);
        java.lang.Object obj90 = stackAr79.pop();
        boolean boolean91 = stackAr24.equals((java.lang.Object) stackAr79);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[1]" + "'", str40, "[1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0867");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (short) -1);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.pop();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        boolean boolean12 = stackAr8.isFull();
        int int13 = stackAr8.size();
        int int14 = stackAr8.size();
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr8);
        int int16 = stackAr8.size();
        org.autotest.Stack stackAr18 = createStack((int) (byte) 100);
        boolean boolean19 = stackAr8.equals((java.lang.Object) stackAr18);
        boolean boolean21 = stackAr8.equals((java.lang.Object) (byte) 1);
        boolean boolean22 = stackAr8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackAr8.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) -1 + "'", obj6, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0868");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean6 = stackAr4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = stackAr4.toString();
        stackAr4.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr11 = createStack((int) (byte) 10);
        boolean boolean12 = stackAr11.isEmpty();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        stackAr11.push((java.lang.Object) (byte) 1);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) 10L);
        stackAr1.push((java.lang.Object) 10L);
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) 1.0d);
        java.lang.String str24 = stackAr21.toString();
        stackAr21.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr28 = createStack((int) (byte) 10);
        boolean boolean29 = stackAr28.isEmpty();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        stackAr28.push((java.lang.Object) (byte) 1);
        stackAr21.push((java.lang.Object) stackAr28);
        stackAr21.push((java.lang.Object) 10L);
        java.lang.Object obj36 = stackAr21.top();
        stackAr1.push((java.lang.Object) stackAr21);
        java.lang.String str38 = stackAr21.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10L + "'", obj36, 10L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[1,[1],10]" + "'", str38, "[1,[1],10]");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0869");
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
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        boolean boolean28 = stackAr24.isFull();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        int int32 = stackAr30.size();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isEmpty();
        boolean boolean37 = stackAr34.isFull();
        int int38 = stackAr34.size();
        boolean boolean39 = stackAr34.isFull();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = stackAr41.toString();
        stackAr34.push((java.lang.Object) stackAr41);
        stackAr30.push((java.lang.Object) stackAr41);
        boolean boolean47 = stackAr24.equals((java.lang.Object) stackAr41);
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        boolean boolean50 = stackAr49.isEmpty();
        boolean boolean51 = stackAr49.isFull();
        int int52 = stackAr49.size();
        boolean boolean53 = stackAr49.isFull();
        boolean boolean54 = stackAr24.equals((java.lang.Object) stackAr49);
        int int55 = stackAr24.size();
        boolean boolean56 = stackAr5.equals((java.lang.Object) stackAr24);
        org.autotest.Stack stackAr58 = createStack((int) 'a');
        boolean boolean60 = stackAr58.equals((java.lang.Object) 1.0d);
        java.lang.String str61 = stackAr58.toString();
        boolean boolean62 = stackAr58.isFull();
        int int63 = stackAr58.size();
        int int64 = stackAr58.size();
        boolean boolean65 = stackAr58.isEmpty();
        boolean boolean66 = stackAr58.isEmpty();
        boolean boolean67 = stackAr58.isEmpty();
        boolean boolean68 = stackAr5.equals((java.lang.Object) stackAr58);
        boolean boolean69 = stackAr5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = stackAr5.top();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0870");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0871");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0872");
        org.autotest.Stack stackAr1 = createStack(4);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0873");
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
        int int17 = stackAr1.size();
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
        int int31 = stackAr19.size();
        boolean boolean32 = stackAr1.equals((java.lang.Object) int31);
        boolean boolean33 = stackAr1.isEmpty();
        java.lang.Object obj34 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0874");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) boolean8);
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0875");
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
        java.lang.String str45 = stackAr7.toString();
        boolean boolean46 = stackAr7.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0876");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        java.lang.Object obj7 = null;
        boolean boolean8 = stackAr1.equals(obj7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0877");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.top();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 100);
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        boolean boolean13 = stackAr12.isEmpty();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr12.isFull();
        java.lang.String str16 = stackAr12.toString();
        int int17 = stackAr12.size();
        boolean boolean18 = stackAr12.isFull();
        stackAr10.push((java.lang.Object) boolean18);
        org.autotest.Stack stackAr21 = createStack((int) '#');
        int int22 = stackAr21.size();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        stackAr21.push((java.lang.Object) boolean27);
        stackAr10.push((java.lang.Object) stackAr21);
        boolean boolean30 = stackAr21.isFull();
        boolean boolean31 = stackAr1.equals((java.lang.Object) boolean30);
        java.lang.Object obj32 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "[]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0878");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        boolean boolean4 = stackAr3.isFull();
        java.lang.String str5 = stackAr3.toString();
        boolean boolean6 = stackAr3.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0879");
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
        int int21 = stackAr5.size();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr23.isEmpty();
        boolean boolean26 = stackAr23.isFull();
        int int27 = stackAr23.size();
        boolean boolean28 = stackAr23.isFull();
        java.lang.String str29 = stackAr23.toString();
        boolean boolean30 = stackAr23.isFull();
        boolean boolean31 = stackAr23.isEmpty();
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        int int34 = stackAr33.size();
        boolean boolean35 = stackAr33.isEmpty();
        stackAr23.push((java.lang.Object) stackAr33);
        boolean boolean37 = stackAr23.isEmpty();
        java.lang.String str38 = stackAr23.toString();
        stackAr5.push((java.lang.Object) stackAr23);
        boolean boolean40 = stackAr23.isFull();
        boolean boolean41 = stackAr23.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[[]]" + "'", str38, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0880");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        boolean boolean10 = stackAr5.isFull();
        java.lang.String str11 = stackAr5.toString();
        boolean boolean12 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean12);
        stackAr1.push((java.lang.Object) 100.0f);
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        int int18 = stackAr17.size();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isFull();
        stackAr17.push((java.lang.Object) stackAr20);
        org.autotest.Stack stackAr25 = createStack(10);
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        boolean boolean28 = stackAr17.equals((java.lang.Object) boolean27);
        boolean boolean29 = stackAr17.isFull();
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean31 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0881");
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
        org.autotest.Stack stackAr20 = createStack(100);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        int int23 = stackAr20.size();
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr20);
        java.lang.String str25 = stackAr20.toString();
        boolean boolean26 = stackAr20.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackAr20.top();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0882");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0883");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        java.lang.String str8 = stackAr6.toString();
        java.lang.String str9 = stackAr6.toString();
        java.lang.String str10 = stackAr6.toString();
        java.lang.String str11 = stackAr6.toString();
        org.autotest.Stack stackAr13 = createStack(100);
        boolean boolean14 = stackAr13.isFull();
        org.autotest.Stack stackAr16 = createStack(10);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = null;
        boolean boolean23 = stackAr20.equals(obj22);
        boolean boolean24 = stackAr20.isFull();
        boolean boolean25 = stackAr16.equals((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        boolean boolean27 = stackAr6.equals((java.lang.Object) stackAr13);
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        int int31 = stackAr30.size();
        int int32 = stackAr30.size();
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) 1.0d);
        java.lang.String str37 = stackAr34.toString();
        stackAr30.push((java.lang.Object) str37);
        java.lang.Object obj39 = stackAr30.top();
        int int40 = stackAr30.size();
        java.lang.Object obj41 = stackAr30.pop();
        org.autotest.Stack stackAr43 = createStack((int) 'a');
        int int44 = stackAr43.size();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        int int47 = stackAr46.size();
        boolean boolean48 = stackAr46.isFull();
        stackAr43.push((java.lang.Object) stackAr46);
        boolean boolean50 = stackAr43.isEmpty();
        java.lang.String str51 = stackAr43.toString();
        boolean boolean52 = stackAr30.equals((java.lang.Object) stackAr43);
        org.autotest.Stack stackAr54 = createStack((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) 1.0d);
        java.lang.String str57 = stackAr54.toString();
        stackAr54.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr61 = createStack((int) (byte) 10);
        boolean boolean62 = stackAr61.isEmpty();
        org.autotest.Stack stackAr64 = createStack((int) (byte) 1);
        stackAr61.push((java.lang.Object) (byte) 1);
        stackAr54.push((java.lang.Object) stackAr61);
        java.lang.String str67 = stackAr54.toString();
        org.autotest.Stack stackAr69 = createStack((int) (byte) 1);
        int int70 = stackAr69.size();
        boolean boolean71 = stackAr69.isEmpty();
        boolean boolean72 = stackAr69.isFull();
        int int73 = stackAr69.size();
        int int74 = stackAr69.size();
        int int75 = stackAr69.size();
        boolean boolean76 = stackAr54.equals((java.lang.Object) int75);
        int int77 = stackAr54.size();
        java.lang.Object obj78 = stackAr54.pop();
        java.lang.Object obj79 = null;
        stackAr54.push(obj79);
        boolean boolean81 = stackAr43.equals((java.lang.Object) stackAr54);
        boolean boolean82 = stackAr6.equals((java.lang.Object) boolean81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "[]" + "'", obj39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "[]" + "'", obj41, "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[[]]" + "'", str51, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[1,[1]]" + "'", str67, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "[1]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0884");
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
        boolean boolean21 = stackAr7.isEmpty();
        int int22 = stackAr7.size();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        int int28 = stackAr24.size();
        boolean boolean29 = stackAr24.isFull();
        java.lang.String str30 = stackAr24.toString();
        boolean boolean31 = stackAr24.isFull();
        boolean boolean32 = stackAr7.equals((java.lang.Object) boolean31);
        java.lang.String str33 = stackAr7.toString();
        boolean boolean34 = stackAr7.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[[]]" + "'", str33, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0885");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0886");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        boolean boolean8 = stackAr6.isEmpty();
        boolean boolean9 = stackAr6.isFull();
        int int10 = stackAr6.size();
        java.lang.String str11 = stackAr6.toString();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        int int15 = stackAr14.size();
        boolean boolean16 = stackAr14.isEmpty();
        boolean boolean17 = stackAr14.isFull();
        int int18 = stackAr14.size();
        int int19 = stackAr14.size();
        int int20 = stackAr14.size();
        stackAr14.push((java.lang.Object) (short) 1);
        java.lang.Object obj23 = stackAr14.pop();
        boolean boolean24 = stackAr6.equals((java.lang.Object) stackAr14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 1 + "'", obj23, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0887");
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
        org.autotest.Stack stackAr13 = createStack(100);
        int int14 = stackAr13.size();
        boolean boolean15 = stackAr13.isEmpty();
        java.lang.String str16 = stackAr13.toString();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        int int26 = stackAr22.size();
        boolean boolean27 = stackAr22.isFull();
        java.lang.String str28 = stackAr22.toString();
        boolean boolean29 = stackAr22.isFull();
        stackAr18.push((java.lang.Object) boolean29);
        stackAr18.push((java.lang.Object) 100.0f);
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        int int35 = stackAr34.size();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isFull();
        stackAr34.push((java.lang.Object) stackAr37);
        org.autotest.Stack stackAr42 = createStack(10);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr34.equals((java.lang.Object) boolean44);
        boolean boolean46 = stackAr34.isFull();
        stackAr18.push((java.lang.Object) stackAr34);
        java.lang.Object obj48 = stackAr34.pop();
        stackAr13.push(obj48);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10.0]" + "'", str9, "[10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10.0]" + "'", str10, "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "[]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0888");
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
        boolean boolean32 = stackAr22.isEmpty();
        boolean boolean33 = stackAr22.isEmpty();
        boolean boolean34 = stackAr22.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackAr22.top();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0889");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        boolean boolean8 = stackAr6.isEmpty();
        boolean boolean9 = stackAr6.isFull();
        int int10 = stackAr6.size();
        java.lang.String str11 = stackAr6.toString();
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0890");
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
        java.lang.String str25 = stackAr18.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        boolean boolean30 = stackAr29.isFull();
        java.lang.Object obj31 = null;
        boolean boolean32 = stackAr29.equals(obj31);
        boolean boolean33 = stackAr29.isFull();
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        int int37 = stackAr35.size();
        boolean boolean38 = stackAr29.equals((java.lang.Object) stackAr35);
        int int39 = stackAr35.size();
        int int40 = stackAr35.size();
        boolean boolean41 = stackAr27.equals((java.lang.Object) stackAr35);
        stackAr18.push((java.lang.Object) stackAr27);
        boolean boolean43 = stackAr27.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = stackAr27.pop();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0891");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0892");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
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
        java.lang.Object obj23 = stackAr6.top();
        boolean boolean24 = stackAr1.equals(obj23);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isFull();
        java.lang.String str28 = stackAr26.toString();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isFull();
        stackAr26.push((java.lang.Object) stackAr30);
        boolean boolean34 = stackAr26.isFull();
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        boolean boolean39 = stackAr36.isFull();
        int int40 = stackAr36.size();
        int int41 = stackAr36.size();
        boolean boolean42 = stackAr26.equals((java.lang.Object) stackAr36);
        int int43 = stackAr36.size();
        stackAr1.push((java.lang.Object) int43);
        boolean boolean45 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0893");
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
        boolean boolean44 = stackAr37.isEmpty();
        java.lang.String str45 = stackAr37.toString();
        int int46 = stackAr37.size();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0894");
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
        java.lang.String str25 = stackAr18.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        boolean boolean28 = stackAr27.isFull();
        java.lang.String str29 = stackAr27.toString();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 10);
        boolean boolean32 = stackAr31.isEmpty();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        stackAr31.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackAr27.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        int int39 = stackAr38.size();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        int int42 = stackAr41.size();
        boolean boolean43 = stackAr41.isFull();
        stackAr38.push((java.lang.Object) stackAr41);
        boolean boolean45 = stackAr31.equals((java.lang.Object) stackAr41);
        java.lang.Object obj46 = stackAr31.top();
        stackAr18.push((java.lang.Object) stackAr31);
        java.lang.String str48 = stackAr31.toString();
        java.lang.String str49 = stackAr31.toString();
        java.lang.Object obj50 = stackAr31.pop();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[1]" + "'", str48, "[1]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[1]" + "'", str49, "[1]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0895");
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
        int int15 = stackAr7.size();
        java.lang.String str16 = stackAr7.toString();
        java.lang.Object obj17 = stackAr7.top();
        org.autotest.Stack stackAr19 = createStack(100);
        boolean boolean20 = stackAr19.isFull();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isFull();
        java.lang.String str24 = stackAr22.toString();
        org.autotest.Stack stackAr26 = createStack((int) (byte) 10);
        boolean boolean27 = stackAr26.isEmpty();
        org.autotest.Stack stackAr29 = createStack((int) (byte) 1);
        stackAr26.push((java.lang.Object) (byte) 1);
        boolean boolean31 = stackAr22.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        int int34 = stackAr33.size();
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isFull();
        stackAr33.push((java.lang.Object) stackAr36);
        boolean boolean40 = stackAr26.equals((java.lang.Object) stackAr36);
        java.lang.Object obj41 = stackAr26.top();
        java.lang.String str42 = stackAr26.toString();
        boolean boolean43 = stackAr19.equals((java.lang.Object) stackAr26);
        boolean boolean44 = stackAr26.isFull();
        java.lang.Object obj45 = stackAr26.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr7.push(obj45);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 1 + "'", obj41, (byte) 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[1]" + "'", str42, "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0896");
        org.autotest.Stack stackAr1 = createStack((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isEmpty();
        java.lang.String str6 = stackAr4.toString();
        int int7 = stackAr4.size();
        boolean boolean8 = stackAr4.isEmpty();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0897");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        stackAr1.push((java.lang.Object) (byte) 1);
        org.autotest.Stack stackAr7 = createStack((int) 'a');
        boolean boolean8 = stackAr7.isFull();
        java.lang.Object obj9 = null;
        boolean boolean10 = stackAr7.equals(obj9);
        boolean boolean11 = stackAr7.isFull();
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
        boolean boolean30 = stackAr7.equals((java.lang.Object) stackAr24);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isFull();
        int int35 = stackAr32.size();
        boolean boolean36 = stackAr32.isFull();
        boolean boolean37 = stackAr7.equals((java.lang.Object) stackAr32);
        boolean boolean38 = stackAr1.equals((java.lang.Object) stackAr7);
        org.autotest.Stack stackAr40 = createStack((int) 'a');
        boolean boolean41 = stackAr40.isFull();
        java.lang.Object obj42 = null;
        boolean boolean43 = stackAr40.equals(obj42);
        boolean boolean44 = stackAr40.isFull();
        org.autotest.Stack stackAr46 = createStack((int) (byte) 1);
        int int47 = stackAr46.size();
        int int48 = stackAr46.size();
        org.autotest.Stack stackAr50 = createStack((int) (byte) 1);
        int int51 = stackAr50.size();
        boolean boolean52 = stackAr50.isEmpty();
        boolean boolean53 = stackAr50.isFull();
        int int54 = stackAr50.size();
        boolean boolean55 = stackAr50.isFull();
        org.autotest.Stack stackAr57 = createStack((int) 'a');
        boolean boolean59 = stackAr57.equals((java.lang.Object) 1.0d);
        java.lang.String str60 = stackAr57.toString();
        stackAr50.push((java.lang.Object) stackAr57);
        stackAr46.push((java.lang.Object) stackAr57);
        boolean boolean63 = stackAr40.equals((java.lang.Object) stackAr57);
        java.lang.Object obj64 = new java.lang.Object();
        boolean boolean65 = stackAr57.equals(obj64);
        boolean boolean66 = stackAr7.equals((java.lang.Object) boolean65);
        boolean boolean67 = stackAr7.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0898");
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
        org.autotest.Stack stackAr21 = createStack((int) ' ');
        java.lang.String str22 = stackAr21.toString();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        boolean boolean28 = stackAr24.isFull();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        int int31 = stackAr30.size();
        stackAr24.push((java.lang.Object) int31);
        boolean boolean33 = stackAr21.equals((java.lang.Object) int31);
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        boolean boolean38 = stackAr35.isFull();
        int int39 = stackAr35.size();
        boolean boolean40 = stackAr35.isFull();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) 1.0d);
        java.lang.String str45 = stackAr42.toString();
        stackAr35.push((java.lang.Object) stackAr42);
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        boolean boolean49 = stackAr48.isFull();
        boolean boolean50 = stackAr42.equals((java.lang.Object) boolean49);
        boolean boolean51 = stackAr42.isFull();
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
        int int70 = stackAr53.size();
        stackAr42.push((java.lang.Object) stackAr53);
        boolean boolean72 = stackAr21.equals((java.lang.Object) stackAr53);
        stackAr5.push((java.lang.Object) stackAr21);
        java.lang.String str74 = stackAr21.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0899");
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
        org.autotest.Stack stackAr16 = createStack((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) 1.0d);
        java.lang.String str19 = stackAr16.toString();
        stackAr16.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        boolean boolean24 = stackAr23.isFull();
        java.lang.String str25 = stackAr23.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 10);
        boolean boolean28 = stackAr27.isEmpty();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        stackAr27.push((java.lang.Object) (byte) 1);
        boolean boolean32 = stackAr23.equals((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr34 = createStack((int) 'a');
        int int35 = stackAr34.size();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isFull();
        stackAr34.push((java.lang.Object) stackAr37);
        boolean boolean41 = stackAr27.equals((java.lang.Object) stackAr37);
        stackAr16.push((java.lang.Object) boolean41);
        java.lang.Object obj43 = stackAr16.pop();
        boolean boolean44 = stackAr7.equals((java.lang.Object) stackAr16);
        org.autotest.Stack stackAr46 = createStack((int) '#');
        int int47 = stackAr46.size();
        boolean boolean48 = stackAr46.isFull();
        int int49 = stackAr46.size();
        boolean boolean50 = stackAr46.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr7.push((java.lang.Object) boolean50);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0900");
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
        boolean boolean58 = stackAr39.isFull();
        java.lang.Object obj59 = null;
        stackAr39.push(obj59);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }
}

