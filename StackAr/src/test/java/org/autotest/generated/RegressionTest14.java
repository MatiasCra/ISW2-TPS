package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0701");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0702");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) (byte) 1);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isFull();
        int int9 = stackAr5.size();
        int int10 = stackAr5.size();
        int int11 = stackAr5.size();
        boolean boolean12 = stackAr5.isFull();
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackAr1.pop();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0703");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) '#');
        int int7 = stackAr6.size();
        int int8 = stackAr6.size();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isFull();
        int int14 = stackAr10.size();
        int int15 = stackAr10.size();
        int int16 = stackAr10.size();
        boolean boolean17 = stackAr10.isFull();
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean20 = stackAr1.isFull();
        int int21 = stackAr1.size();
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        int int24 = stackAr23.size();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        boolean boolean28 = stackAr26.isFull();
        stackAr23.push((java.lang.Object) stackAr26);
        java.lang.Object obj30 = stackAr23.top();
        java.lang.Object obj31 = stackAr23.top();
        stackAr1.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr23.isFull();
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        boolean boolean36 = stackAr35.isFull();
        java.lang.Object obj37 = null;
        boolean boolean38 = stackAr35.equals(obj37);
        boolean boolean39 = stackAr35.isFull();
        boolean boolean40 = stackAr23.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0704");
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
        java.lang.String str12 = stackAr7.toString();
        boolean boolean13 = stackAr7.isEmpty();
        boolean boolean14 = stackAr7.isFull();
        java.lang.String str15 = stackAr7.toString();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isFull();
        stackAr17.push((java.lang.Object) (short) -1);
        boolean boolean21 = stackAr17.isEmpty();
        stackAr7.push((java.lang.Object) stackAr17);
        java.lang.String str23 = stackAr7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[[-1]]" + "'", str23, "[[-1]]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0705");
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
        boolean boolean17 = stackAr8.isFull();
        int int18 = stackAr8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackAr8.top();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0706");
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
        boolean boolean21 = stackAr18.isEmpty();
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
        int int40 = stackAr23.size();
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr42.isFull();
        int int46 = stackAr42.size();
        boolean boolean47 = stackAr42.isFull();
        java.lang.String str48 = stackAr42.toString();
        boolean boolean49 = stackAr42.isEmpty();
        boolean boolean50 = stackAr23.equals((java.lang.Object) boolean49);
        boolean boolean51 = stackAr18.equals((java.lang.Object) stackAr23);
        int int52 = stackAr18.size();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0707");
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
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        int int50 = stackAr49.size();
        org.autotest.Stack stackAr52 = createStack((int) 'a');
        int int53 = stackAr52.size();
        boolean boolean54 = stackAr52.isFull();
        stackAr49.push((java.lang.Object) stackAr52);
        boolean boolean56 = stackAr52.isFull();
        stackAr31.push((java.lang.Object) stackAr52);
        java.lang.String str58 = stackAr52.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = stackAr52.top();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0708");
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
        org.autotest.Stack stackAr18 = createStack((int) ' ');
        java.lang.String str19 = stackAr18.toString();
        org.autotest.Stack stackAr21 = createStack((int) (byte) 1);
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isEmpty();
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isFull();
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        int int28 = stackAr27.size();
        stackAr21.push((java.lang.Object) int28);
        boolean boolean30 = stackAr18.equals((java.lang.Object) int28);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isEmpty();
        boolean boolean35 = stackAr32.isFull();
        int int36 = stackAr32.size();
        boolean boolean37 = stackAr32.isFull();
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) 1.0d);
        java.lang.String str42 = stackAr39.toString();
        stackAr32.push((java.lang.Object) stackAr39);
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        boolean boolean46 = stackAr45.isFull();
        boolean boolean47 = stackAr39.equals((java.lang.Object) boolean46);
        boolean boolean48 = stackAr39.isFull();
        org.autotest.Stack stackAr50 = createStack((int) (byte) 1);
        int int51 = stackAr50.size();
        int int52 = stackAr50.size();
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        boolean boolean57 = stackAr54.isFull();
        int int58 = stackAr54.size();
        boolean boolean59 = stackAr54.isFull();
        org.autotest.Stack stackAr61 = createStack((int) 'a');
        boolean boolean63 = stackAr61.equals((java.lang.Object) 1.0d);
        java.lang.String str64 = stackAr61.toString();
        stackAr54.push((java.lang.Object) stackAr61);
        stackAr50.push((java.lang.Object) stackAr61);
        int int67 = stackAr50.size();
        stackAr39.push((java.lang.Object) stackAr50);
        boolean boolean69 = stackAr18.equals((java.lang.Object) stackAr50);
        boolean boolean70 = stackAr11.equals((java.lang.Object) boolean69);
        boolean boolean71 = stackAr11.isFull();
        int int72 = stackAr11.size();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0709");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0710");
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
        int int34 = stackAr1.size();
        java.lang.String str35 = stackAr1.toString();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) 1.0d);
        java.lang.String str40 = stackAr37.toString();
        stackAr37.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr44 = createStack((int) (byte) 10);
        boolean boolean45 = stackAr44.isEmpty();
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        stackAr44.push((java.lang.Object) (byte) 1);
        stackAr37.push((java.lang.Object) stackAr44);
        int int50 = stackAr37.size();
        java.lang.Object obj51 = stackAr37.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr37);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[[1]]" + "'", str35, "[[1]]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[1]");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0711");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        java.lang.String str9 = stackAr1.toString();
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
        org.autotest.Stack stackAr38 = createStack((int) (byte) 1);
        int int39 = stackAr38.size();
        boolean boolean40 = stackAr28.equals((java.lang.Object) stackAr38);
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean43 = stackAr42.isFull();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        int int46 = stackAr45.size();
        boolean boolean47 = stackAr45.isEmpty();
        boolean boolean48 = stackAr45.isFull();
        boolean boolean49 = stackAr45.isFull();
        int int50 = stackAr45.size();
        stackAr42.push((java.lang.Object) stackAr45);
        stackAr28.push((java.lang.Object) stackAr42);
        stackAr1.push((java.lang.Object) stackAr42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0712");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        java.lang.String str9 = stackAr1.toString();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        boolean boolean12 = stackAr11.isEmpty();
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
        boolean boolean28 = stackAr11.equals((java.lang.Object) boolean27);
        java.lang.Object obj29 = null;
        boolean boolean30 = stackAr11.equals(obj29);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isEmpty();
        boolean boolean35 = stackAr32.isFull();
        int int36 = stackAr32.size();
        int int37 = stackAr32.size();
        int int38 = stackAr32.size();
        stackAr32.push((java.lang.Object) (short) 1);
        int int41 = stackAr32.size();
        boolean boolean42 = stackAr32.isEmpty();
        boolean boolean43 = stackAr11.equals((java.lang.Object) boolean42);
        boolean boolean44 = stackAr1.equals((java.lang.Object) stackAr11);
        java.lang.String str45 = stackAr11.toString();
        int int46 = stackAr11.size();
        int int47 = stackAr11.size();
        boolean boolean48 = stackAr11.isFull();
        int int49 = stackAr11.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = stackAr11.pop();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0713");
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
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        java.lang.String str19 = stackAr17.toString();
        java.lang.String str20 = stackAr17.toString();
        java.lang.String str21 = stackAr17.toString();
        boolean boolean22 = stackAr17.isFull();
        stackAr1.push((java.lang.Object) boolean22);
        boolean boolean24 = stackAr1.isFull();
        int int25 = stackAr1.size();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0714");
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
        java.lang.Object obj18 = stackAr1.top();
        java.lang.Object obj19 = stackAr1.pop();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0715");
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
        int int15 = stackAr8.size();
        java.lang.String str16 = stackAr8.toString();
        boolean boolean17 = stackAr8.isFull();
        boolean boolean18 = stackAr8.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0716");
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
        java.lang.Object obj33 = stackAr17.pop();
        boolean boolean34 = stackAr17.isFull();
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
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0717");
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
        java.lang.Object obj32 = stackAr17.top();
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
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "[]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0718");
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
        java.lang.String str15 = stackAr1.toString();
        boolean boolean16 = stackAr1.isFull();
        int int17 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0719");
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
        int int21 = stackAr17.size();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        boolean boolean24 = stackAr23.isEmpty();
        int int25 = stackAr23.size();
        boolean boolean26 = stackAr23.isFull();
        java.lang.String str27 = stackAr23.toString();
        int int28 = stackAr23.size();
        stackAr23.push((java.lang.Object) 10.0d);
        java.lang.String str31 = stackAr23.toString();
        stackAr17.push((java.lang.Object) str31);
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        boolean boolean35 = stackAr34.isEmpty();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isFull();
        java.lang.String str38 = stackAr34.toString();
        boolean boolean39 = stackAr34.isFull();
        org.autotest.Stack stackAr41 = createStack((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = stackAr41.toString();
        boolean boolean45 = stackAr41.isFull();
        stackAr34.push((java.lang.Object) boolean45);
        // The following exception was thrown during execution in test generation
        try {
            stackAr17.push((java.lang.Object) stackAr34);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[10.0]" + "'", str31, "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0720");
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
        int int14 = stackAr7.size();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr16.isEmpty();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isFull();
        java.lang.String str20 = stackAr16.toString();
        boolean boolean21 = stackAr16.isFull();
        int int22 = stackAr16.size();
        int int23 = stackAr16.size();
        stackAr7.push((java.lang.Object) int23);
        java.lang.Object obj25 = stackAr7.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackAr7.pop();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0721");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 10);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean4 = stackAr1.equals((java.lang.Object) 1L);
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) 1.0d);
        java.lang.String str11 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr15 = createStack((int) (byte) 1);
        boolean boolean16 = stackAr15.isFull();
        java.lang.String str17 = stackAr15.toString();
        org.autotest.Stack stackAr19 = createStack((int) (byte) 10);
        boolean boolean20 = stackAr19.isEmpty();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        stackAr19.push((java.lang.Object) (byte) 1);
        boolean boolean24 = stackAr15.equals((java.lang.Object) stackAr19);
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        int int30 = stackAr29.size();
        boolean boolean31 = stackAr29.isFull();
        stackAr26.push((java.lang.Object) stackAr29);
        boolean boolean33 = stackAr19.equals((java.lang.Object) stackAr29);
        stackAr8.push((java.lang.Object) boolean33);
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        int int37 = stackAr36.size();
        java.lang.String str38 = stackAr36.toString();
        java.lang.String str39 = stackAr36.toString();
        stackAr8.push((java.lang.Object) stackAr36);
        java.lang.Object obj41 = null;
        boolean boolean42 = stackAr36.equals(obj41);
        boolean boolean43 = stackAr1.equals((java.lang.Object) stackAr36);
        boolean boolean44 = stackAr1.isEmpty();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        boolean boolean47 = stackAr46.isFull();
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr46.equals(obj48);
        boolean boolean50 = stackAr46.isFull();
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        int int53 = stackAr52.size();
        int int54 = stackAr52.size();
        boolean boolean55 = stackAr46.equals((java.lang.Object) stackAr52);
        boolean boolean56 = stackAr52.isEmpty();
        stackAr1.push((java.lang.Object) boolean56);
        boolean boolean58 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0722");
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
        java.lang.Object obj48 = stackAr18.pop();
        int int49 = stackAr18.size();
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isEmpty();
        int int53 = stackAr51.size();
        boolean boolean54 = stackAr51.isFull();
        org.autotest.Stack stackAr56 = createStack((int) 'a');
        int int57 = stackAr56.size();
        org.autotest.Stack stackAr59 = createStack((int) 'a');
        int int60 = stackAr59.size();
        boolean boolean61 = stackAr59.isFull();
        stackAr56.push((java.lang.Object) stackAr59);
        boolean boolean63 = stackAr56.isEmpty();
        boolean boolean64 = stackAr51.equals((java.lang.Object) boolean63);
        int int65 = stackAr51.size();
        boolean boolean66 = stackAr51.isEmpty();
        boolean boolean67 = stackAr18.equals((java.lang.Object) stackAr51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = stackAr18.pop();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "[1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0723");
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
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        int int28 = stackAr24.size();
        boolean boolean29 = stackAr24.isFull();
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        boolean boolean33 = stackAr31.equals((java.lang.Object) 1.0d);
        java.lang.String str34 = stackAr31.toString();
        stackAr24.push((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        boolean boolean38 = stackAr37.isFull();
        boolean boolean39 = stackAr31.equals((java.lang.Object) boolean38);
        boolean boolean40 = stackAr31.isFull();
        java.lang.String str41 = stackAr31.toString();
        boolean boolean42 = stackAr5.equals((java.lang.Object) str41);
        java.lang.Object obj43 = stackAr5.pop();
        boolean boolean44 = stackAr5.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0724");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (byte) 1);
        boolean boolean5 = stackAr4.isFull();
        java.lang.String str6 = stackAr4.toString();
        int int7 = stackAr4.size();
        stackAr4.push((java.lang.Object) (short) 100);
        int int10 = stackAr4.size();
        stackAr1.push((java.lang.Object) stackAr4);
        int int12 = stackAr1.size();
        boolean boolean13 = stackAr1.isFull();
        java.lang.String str14 = stackAr1.toString();
        org.autotest.Stack stackAr16 = createStack((int) 'a');
        java.lang.String str17 = stackAr16.toString();
        stackAr16.push((java.lang.Object) 1.0d);
        boolean boolean20 = stackAr16.isFull();
        java.lang.Object obj21 = stackAr16.top();
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr16);
        java.lang.String str23 = stackAr1.toString();
        org.autotest.Stack stackAr25 = createStack((int) (byte) 1);
        boolean boolean26 = stackAr25.isFull();
        java.lang.String str27 = stackAr25.toString();
        org.autotest.Stack stackAr29 = createStack((int) (byte) 10);
        boolean boolean30 = stackAr29.isEmpty();
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        stackAr29.push((java.lang.Object) (byte) 1);
        boolean boolean34 = stackAr25.equals((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        int int37 = stackAr36.size();
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        int int40 = stackAr39.size();
        boolean boolean41 = stackAr39.isFull();
        stackAr36.push((java.lang.Object) stackAr39);
        boolean boolean43 = stackAr29.equals((java.lang.Object) stackAr39);
        org.autotest.Stack stackAr45 = createStack((int) 'a');
        boolean boolean46 = stackAr45.isFull();
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        int int49 = stackAr48.size();
        boolean boolean50 = stackAr48.isEmpty();
        boolean boolean51 = stackAr48.isFull();
        boolean boolean52 = stackAr48.isFull();
        int int53 = stackAr48.size();
        stackAr45.push((java.lang.Object) stackAr48);
        boolean boolean55 = stackAr39.equals((java.lang.Object) stackAr45);
        boolean boolean56 = stackAr1.equals((java.lang.Object) boolean55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[100]]" + "'", str14, "[[100]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0d + "'", obj21, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[[100]]" + "'", str23, "[[100]]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0725");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        java.lang.String str6 = stackAr1.toString();
        org.autotest.Stack stackAr8 = createStack(100);
        boolean boolean9 = stackAr8.isFull();
        org.autotest.Stack stackAr11 = createStack(10);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean16 = stackAr15.isFull();
        java.lang.Object obj17 = null;
        boolean boolean18 = stackAr15.equals(obj17);
        boolean boolean19 = stackAr15.isFull();
        boolean boolean20 = stackAr11.equals((java.lang.Object) stackAr15);
        stackAr8.push((java.lang.Object) stackAr15);
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr8);
        boolean boolean23 = stackAr8.isFull();
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        int int26 = stackAr25.size();
        org.autotest.Stack stackAr28 = createStack((int) 'a');
        int int29 = stackAr28.size();
        boolean boolean30 = stackAr28.isFull();
        stackAr25.push((java.lang.Object) stackAr28);
        java.lang.String str32 = stackAr25.toString();
        stackAr8.push((java.lang.Object) str32);
        java.lang.String str34 = stackAr8.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[[]]" + "'", str32, "[[]]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[[],[[]]]" + "'", str34, "[[],[[]]]");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0726");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        java.lang.String str9 = stackAr1.toString();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        boolean boolean12 = stackAr11.isEmpty();
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
        boolean boolean28 = stackAr11.equals((java.lang.Object) boolean27);
        java.lang.Object obj29 = null;
        boolean boolean30 = stackAr11.equals(obj29);
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isEmpty();
        boolean boolean35 = stackAr32.isFull();
        int int36 = stackAr32.size();
        int int37 = stackAr32.size();
        int int38 = stackAr32.size();
        stackAr32.push((java.lang.Object) (short) 1);
        int int41 = stackAr32.size();
        boolean boolean42 = stackAr32.isEmpty();
        boolean boolean43 = stackAr11.equals((java.lang.Object) boolean42);
        boolean boolean44 = stackAr1.equals((java.lang.Object) stackAr11);
        int int45 = stackAr11.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0727");
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
        boolean boolean18 = stackAr1.isFull();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        int int21 = stackAr20.size();
        int int22 = stackAr20.size();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean26 = stackAr24.equals((java.lang.Object) 1.0d);
        java.lang.String str27 = stackAr24.toString();
        stackAr20.push((java.lang.Object) str27);
        boolean boolean29 = stackAr20.isEmpty();
        boolean boolean30 = stackAr20.isEmpty();
        boolean boolean31 = stackAr1.equals((java.lang.Object) boolean30);
        java.lang.Object obj32 = stackAr1.top();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0d + "'", obj32, 10.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0728");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0729");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        java.lang.Object obj6 = null;
        boolean boolean7 = stackAr4.equals(obj6);
        stackAr1.push((java.lang.Object) boolean7);
        java.lang.Object obj9 = stackAr1.top();
        int int10 = stackAr1.size();
        java.lang.String str11 = stackAr1.toString();
        int int12 = stackAr1.size();
        stackAr1.push((java.lang.Object) "[[-1]]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[false]" + "'", str11, "[false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0730");
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
        boolean boolean16 = stackAr1.isFull();
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        int int19 = stackAr18.size();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isFull();
        stackAr18.push((java.lang.Object) stackAr21);
        boolean boolean25 = stackAr21.isEmpty();
        java.lang.String str26 = stackAr21.toString();
        boolean boolean27 = stackAr1.equals((java.lang.Object) stackAr21);
        boolean boolean28 = stackAr21.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) -1 + "'", obj6, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0731");
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
        java.lang.Object obj48 = stackAr18.pop();
        org.autotest.Stack stackAr50 = createStack((int) (byte) 1);
        boolean boolean51 = stackAr50.isFull();
        stackAr50.push((java.lang.Object) (short) -1);
        java.lang.Object obj54 = stackAr50.top();
        java.lang.Object obj55 = stackAr50.pop();
        org.autotest.Stack stackAr57 = createStack((int) 'a');
        boolean boolean59 = stackAr57.equals((java.lang.Object) 1.0d);
        java.lang.String str60 = stackAr57.toString();
        boolean boolean61 = stackAr57.isFull();
        int int62 = stackAr57.size();
        int int63 = stackAr57.size();
        boolean boolean64 = stackAr50.equals((java.lang.Object) stackAr57);
        stackAr18.push((java.lang.Object) stackAr57);
        org.autotest.Stack stackAr67 = createStack((int) ' ');
        java.lang.String str68 = stackAr67.toString();
        int int69 = stackAr67.size();
        boolean boolean70 = stackAr67.isFull();
        org.autotest.Stack stackAr72 = createStack((int) (byte) 1);
        int int73 = stackAr72.size();
        int int74 = stackAr72.size();
        org.autotest.Stack stackAr76 = createStack((int) (byte) 1);
        int int77 = stackAr76.size();
        boolean boolean78 = stackAr76.isEmpty();
        boolean boolean79 = stackAr76.isFull();
        int int80 = stackAr76.size();
        boolean boolean81 = stackAr76.isFull();
        org.autotest.Stack stackAr83 = createStack((int) 'a');
        boolean boolean85 = stackAr83.equals((java.lang.Object) 1.0d);
        java.lang.String str86 = stackAr83.toString();
        stackAr76.push((java.lang.Object) stackAr83);
        stackAr72.push((java.lang.Object) stackAr83);
        java.lang.Object obj89 = stackAr72.top();
        boolean boolean90 = stackAr67.equals(obj89);
        stackAr57.push((java.lang.Object) stackAr67);
        java.lang.String str92 = stackAr57.toString();
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
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "[1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) -1 + "'", obj54, (short) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) -1 + "'", obj55, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[]" + "'", str86, "[]");
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "[[]]" + "'", str92, "[[]]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0732");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        org.autotest.Stack stackAr3 = createStack((int) (byte) 1);
        int int4 = stackAr3.size();
        boolean boolean5 = stackAr3.isEmpty();
        boolean boolean6 = stackAr3.isFull();
        int int7 = stackAr3.size();
        boolean boolean8 = stackAr3.isFull();
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) 1.0d);
        java.lang.String str13 = stackAr10.toString();
        stackAr3.push((java.lang.Object) stackAr10);
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr16.isFull();
        boolean boolean18 = stackAr10.equals((java.lang.Object) boolean17);
        org.autotest.Stack stackAr20 = createStack((int) '#');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr10.equals((java.lang.Object) stackAr20);
        org.autotest.Stack stackAr24 = createStack(10);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        org.autotest.Stack stackAr28 = createStack((int) 'a');
        boolean boolean29 = stackAr28.isFull();
        java.lang.Object obj30 = null;
        boolean boolean31 = stackAr28.equals(obj30);
        boolean boolean32 = stackAr28.isFull();
        boolean boolean33 = stackAr24.equals((java.lang.Object) stackAr28);
        stackAr20.push((java.lang.Object) boolean33);
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        java.lang.Object obj38 = null;
        boolean boolean39 = stackAr36.equals(obj38);
        boolean boolean40 = stackAr36.isFull();
        boolean boolean41 = stackAr20.equals((java.lang.Object) boolean40);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0733");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        java.lang.String str9 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0734");
        org.autotest.Stack stackAr1 = createStack(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0735");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr8 = createStack((int) (byte) 10);
        boolean boolean9 = stackAr8.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        stackAr8.push((java.lang.Object) (byte) 1);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.String str14 = stackAr1.toString();
        int int15 = stackAr1.size();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        int int18 = stackAr17.size();
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isFull();
        stackAr17.push((java.lang.Object) stackAr20);
        java.lang.Object obj24 = stackAr17.pop();
        java.lang.String str25 = stackAr17.toString();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        boolean boolean28 = stackAr27.isEmpty();
        org.autotest.Stack stackAr30 = createStack((int) (byte) 1);
        boolean boolean31 = stackAr30.isEmpty();
        int int32 = stackAr30.size();
        boolean boolean33 = stackAr30.isFull();
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        int int36 = stackAr35.size();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        int int39 = stackAr38.size();
        boolean boolean40 = stackAr38.isFull();
        stackAr35.push((java.lang.Object) stackAr38);
        boolean boolean42 = stackAr35.isEmpty();
        boolean boolean43 = stackAr30.equals((java.lang.Object) boolean42);
        boolean boolean44 = stackAr27.equals((java.lang.Object) boolean43);
        java.lang.Object obj45 = null;
        boolean boolean46 = stackAr27.equals(obj45);
        org.autotest.Stack stackAr48 = createStack((int) (byte) 1);
        int int49 = stackAr48.size();
        boolean boolean50 = stackAr48.isEmpty();
        boolean boolean51 = stackAr48.isFull();
        int int52 = stackAr48.size();
        int int53 = stackAr48.size();
        int int54 = stackAr48.size();
        stackAr48.push((java.lang.Object) (short) 1);
        int int57 = stackAr48.size();
        boolean boolean58 = stackAr48.isEmpty();
        boolean boolean59 = stackAr27.equals((java.lang.Object) boolean58);
        boolean boolean60 = stackAr17.equals((java.lang.Object) stackAr27);
        java.lang.String str61 = stackAr27.toString();
        int int62 = stackAr27.size();
        int int63 = stackAr27.size();
        boolean boolean64 = stackAr1.equals((java.lang.Object) int63);
        java.lang.String str65 = stackAr1.toString();
        boolean boolean66 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1,[1]]" + "'", str14, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[1,[1]]" + "'", str65, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0736");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0737");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) (short) 100);
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isEmpty();
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) 1.0d);
        java.lang.String str13 = stackAr10.toString();
        boolean boolean14 = stackAr10.isFull();
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        boolean boolean17 = stackAr16.isFull();
        java.lang.String str18 = stackAr16.toString();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 10);
        boolean boolean21 = stackAr20.isEmpty();
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        stackAr20.push((java.lang.Object) (byte) 1);
        boolean boolean25 = stackAr16.equals((java.lang.Object) stackAr20);
        org.autotest.Stack stackAr27 = createStack((int) 'a');
        int int28 = stackAr27.size();
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        int int31 = stackAr30.size();
        boolean boolean32 = stackAr30.isFull();
        stackAr27.push((java.lang.Object) stackAr30);
        boolean boolean34 = stackAr20.equals((java.lang.Object) stackAr30);
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        org.autotest.Stack stackAr39 = createStack((int) (byte) 1);
        int int40 = stackAr39.size();
        boolean boolean41 = stackAr39.isEmpty();
        boolean boolean42 = stackAr39.isFull();
        boolean boolean43 = stackAr39.isFull();
        int int44 = stackAr39.size();
        stackAr36.push((java.lang.Object) stackAr39);
        boolean boolean46 = stackAr30.equals((java.lang.Object) stackAr36);
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
        stackAr36.push((java.lang.Object) stackAr79);
        boolean boolean91 = stackAr79.isFull();
        boolean boolean92 = stackAr10.equals((java.lang.Object) boolean91);
        boolean boolean93 = stackAr6.equals((java.lang.Object) boolean91);
        boolean boolean94 = stackAr1.equals((java.lang.Object) boolean91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0738");
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
        int int19 = stackAr11.size();
        boolean boolean20 = stackAr11.isEmpty();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isFull();
        java.lang.String str24 = stackAr22.toString();
        int int25 = stackAr22.size();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        int int29 = stackAr27.size();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        boolean boolean33 = stackAr31.isEmpty();
        boolean boolean34 = stackAr31.isFull();
        int int35 = stackAr31.size();
        boolean boolean36 = stackAr31.isFull();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        boolean boolean40 = stackAr38.equals((java.lang.Object) 1.0d);
        java.lang.String str41 = stackAr38.toString();
        stackAr31.push((java.lang.Object) stackAr38);
        stackAr27.push((java.lang.Object) stackAr38);
        int int44 = stackAr27.size();
        stackAr22.push((java.lang.Object) stackAr27);
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
        boolean boolean64 = stackAr22.equals((java.lang.Object) stackAr47);
        int int65 = stackAr22.size();
        java.lang.Object obj66 = stackAr22.top();
        boolean boolean67 = stackAr11.equals((java.lang.Object) stackAr22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = stackAr11.top();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0739");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) '#');
        int int7 = stackAr6.size();
        int int8 = stackAr6.size();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isFull();
        int int14 = stackAr10.size();
        int int15 = stackAr10.size();
        int int16 = stackAr10.size();
        boolean boolean17 = stackAr10.isFull();
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean20 = stackAr1.isFull();
        int int21 = stackAr1.size();
        org.autotest.Stack stackAr23 = createStack((int) 'a');
        int int24 = stackAr23.size();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        boolean boolean28 = stackAr26.isFull();
        stackAr23.push((java.lang.Object) stackAr26);
        java.lang.Object obj30 = stackAr23.top();
        java.lang.Object obj31 = stackAr23.top();
        stackAr1.push((java.lang.Object) stackAr23);
        org.autotest.Stack stackAr34 = createStack((int) (byte) 100);
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        boolean boolean37 = stackAr36.isEmpty();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isFull();
        java.lang.String str40 = stackAr36.toString();
        int int41 = stackAr36.size();
        boolean boolean42 = stackAr36.isFull();
        stackAr34.push((java.lang.Object) boolean42);
        org.autotest.Stack stackAr45 = createStack((int) '#');
        int int46 = stackAr45.size();
        org.autotest.Stack stackAr48 = createStack((int) 'a');
        boolean boolean49 = stackAr48.isFull();
        java.lang.Object obj50 = null;
        boolean boolean51 = stackAr48.equals(obj50);
        stackAr45.push((java.lang.Object) boolean51);
        stackAr34.push((java.lang.Object) stackAr45);
        java.lang.Object obj54 = stackAr45.pop();
        java.lang.String str55 = stackAr45.toString();
        stackAr23.push((java.lang.Object) str55);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0740");
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
        java.lang.String str93 = stackAr88.toString();
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
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "[]" + "'", str93, "[]");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0741");
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
        int int19 = stackAr11.size();
        boolean boolean20 = stackAr11.isEmpty();
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isFull();
        java.lang.String str24 = stackAr22.toString();
        int int25 = stackAr22.size();
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        int int29 = stackAr27.size();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        boolean boolean33 = stackAr31.isEmpty();
        boolean boolean34 = stackAr31.isFull();
        int int35 = stackAr31.size();
        boolean boolean36 = stackAr31.isFull();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        boolean boolean40 = stackAr38.equals((java.lang.Object) 1.0d);
        java.lang.String str41 = stackAr38.toString();
        stackAr31.push((java.lang.Object) stackAr38);
        stackAr27.push((java.lang.Object) stackAr38);
        int int44 = stackAr27.size();
        stackAr22.push((java.lang.Object) stackAr27);
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
        boolean boolean64 = stackAr22.equals((java.lang.Object) stackAr47);
        int int65 = stackAr22.size();
        java.lang.Object obj66 = stackAr22.top();
        boolean boolean67 = stackAr11.equals((java.lang.Object) stackAr22);
        java.lang.String str68 = stackAr22.toString();
        org.autotest.Stack stackAr70 = createStack((int) 'a');
        boolean boolean71 = stackAr70.isFull();
        org.autotest.Stack stackAr73 = createStack((int) (byte) 1);
        int int74 = stackAr73.size();
        boolean boolean75 = stackAr73.isEmpty();
        boolean boolean76 = stackAr73.isFull();
        boolean boolean77 = stackAr73.isFull();
        int int78 = stackAr73.size();
        stackAr70.push((java.lang.Object) stackAr73);
        org.autotest.Stack stackAr81 = createStack((int) 'a');
        java.lang.String str82 = stackAr81.toString();
        int int83 = stackAr81.size();
        boolean boolean84 = stackAr70.equals((java.lang.Object) stackAr81);
        // The following exception was thrown during execution in test generation
        try {
            stackAr22.push((java.lang.Object) stackAr70);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[[[]]]" + "'", str68, "[[[]]]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "[]" + "'", str82, "[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0742");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean8 = stackAr6.equals((java.lang.Object) 1.0d);
        boolean boolean9 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0743");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackAr23.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0744");
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
        int int32 = stackAr1.size();
        boolean boolean33 = stackAr1.isEmpty();
        java.lang.String str34 = stackAr1.toString();
        java.lang.String str35 = stackAr1.toString();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean38 = stackAr37.isFull();
        java.lang.Object obj39 = null;
        boolean boolean40 = stackAr37.equals(obj39);
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr42.isFull();
        int int46 = stackAr42.size();
        java.lang.String str47 = stackAr42.toString();
        stackAr37.push((java.lang.Object) stackAr42);
        stackAr1.push((java.lang.Object) stackAr42);
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        int int52 = stackAr51.size();
        boolean boolean53 = stackAr51.isEmpty();
        boolean boolean54 = stackAr51.isFull();
        int int55 = stackAr51.size();
        boolean boolean56 = stackAr51.isFull();
        java.lang.String str57 = stackAr51.toString();
        boolean boolean58 = stackAr51.isFull();
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        int int61 = stackAr60.size();
        java.lang.String str62 = stackAr60.toString();
        java.lang.String str63 = stackAr60.toString();
        java.lang.String str64 = stackAr60.toString();
        java.lang.String str65 = stackAr60.toString();
        org.autotest.Stack stackAr67 = createStack(100);
        boolean boolean68 = stackAr67.isFull();
        org.autotest.Stack stackAr70 = createStack(10);
        int int71 = stackAr70.size();
        boolean boolean72 = stackAr70.isEmpty();
        org.autotest.Stack stackAr74 = createStack((int) 'a');
        boolean boolean75 = stackAr74.isFull();
        java.lang.Object obj76 = null;
        boolean boolean77 = stackAr74.equals(obj76);
        boolean boolean78 = stackAr74.isFull();
        boolean boolean79 = stackAr70.equals((java.lang.Object) stackAr74);
        stackAr67.push((java.lang.Object) stackAr74);
        boolean boolean81 = stackAr60.equals((java.lang.Object) stackAr67);
        boolean boolean82 = stackAr60.isEmpty();
        boolean boolean83 = stackAr51.equals((java.lang.Object) stackAr60);
        boolean boolean84 = stackAr42.equals((java.lang.Object) stackAr51);
        int int85 = stackAr51.size();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[]" + "'", str63, "[]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0745");
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
        int int32 = stackAr1.size();
        boolean boolean33 = stackAr1.isEmpty();
        java.lang.String str34 = stackAr1.toString();
        java.lang.String str35 = stackAr1.toString();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean38 = stackAr37.isFull();
        java.lang.Object obj39 = null;
        boolean boolean40 = stackAr37.equals(obj39);
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        boolean boolean45 = stackAr42.isFull();
        int int46 = stackAr42.size();
        java.lang.String str47 = stackAr42.toString();
        stackAr37.push((java.lang.Object) stackAr42);
        stackAr1.push((java.lang.Object) stackAr42);
        int int50 = stackAr1.size();
        boolean boolean51 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0746");
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
        org.autotest.Stack stackAr22 = createStack((int) (byte) 1);
        boolean boolean23 = stackAr22.isEmpty();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isFull();
        java.lang.String str26 = stackAr22.toString();
        boolean boolean27 = stackAr22.isFull();
        int int28 = stackAr22.size();
        boolean boolean29 = stackAr17.equals((java.lang.Object) int28);
        int int30 = stackAr17.size();
        int int31 = stackAr17.size();
        java.lang.String str32 = stackAr17.toString();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0747");
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
        java.lang.Object obj18 = stackAr1.top();
        java.lang.Object obj19 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr1.top();
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0748");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.Stack stackAr6 = createStack((int) ' ');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr6.isFull();
        java.lang.String str9 = stackAr6.toString();
        stackAr1.push((java.lang.Object) str9);
        boolean boolean11 = stackAr1.isFull();
        org.autotest.Stack stackAr13 = createStack((int) (byte) 10);
        java.lang.String str14 = stackAr13.toString();
        java.lang.String str15 = stackAr13.toString();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        java.lang.String str21 = stackAr17.toString();
        boolean boolean22 = stackAr17.isFull();
        stackAr17.push((java.lang.Object) 0.0f);
        stackAr13.push((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        int int27 = stackAr17.size();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        boolean boolean30 = stackAr29.isFull();
        java.lang.Object obj31 = null;
        boolean boolean32 = stackAr29.equals(obj31);
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        int int35 = stackAr34.size();
        boolean boolean36 = stackAr34.isEmpty();
        java.lang.String str37 = stackAr34.toString();
        org.autotest.Stack stackAr39 = createStack(10);
        int int40 = stackAr39.size();
        boolean boolean41 = stackAr39.isEmpty();
        org.autotest.Stack stackAr43 = createStack((int) 'a');
        boolean boolean44 = stackAr43.isFull();
        java.lang.Object obj45 = null;
        boolean boolean46 = stackAr43.equals(obj45);
        boolean boolean47 = stackAr43.isFull();
        boolean boolean48 = stackAr39.equals((java.lang.Object) stackAr43);
        stackAr34.push((java.lang.Object) stackAr39);
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isFull();
        java.lang.String str53 = stackAr51.toString();
        org.autotest.Stack stackAr55 = createStack((int) 'a');
        int int56 = stackAr55.size();
        boolean boolean57 = stackAr55.isFull();
        stackAr51.push((java.lang.Object) stackAr55);
        boolean boolean59 = stackAr51.isFull();
        org.autotest.Stack stackAr61 = createStack((int) (byte) 1);
        int int62 = stackAr61.size();
        boolean boolean63 = stackAr61.isEmpty();
        boolean boolean64 = stackAr61.isFull();
        int int65 = stackAr61.size();
        int int66 = stackAr61.size();
        boolean boolean67 = stackAr51.equals((java.lang.Object) stackAr61);
        boolean boolean68 = stackAr39.equals((java.lang.Object) stackAr61);
        boolean boolean69 = stackAr29.equals((java.lang.Object) stackAr61);
        boolean boolean70 = stackAr29.isFull();
        boolean boolean71 = stackAr17.equals((java.lang.Object) boolean70);
        int int72 = stackAr17.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0749");
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
        java.lang.Object obj18 = stackAr1.top();
        boolean boolean19 = stackAr1.isFull();
        boolean boolean21 = stackAr1.equals((java.lang.Object) "");
        java.lang.Object obj22 = stackAr1.pop();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        boolean boolean27 = stackAr24.isFull();
        int int28 = stackAr24.size();
        int int29 = stackAr24.size();
        int int30 = stackAr24.size();
        stackAr24.push((java.lang.Object) (short) 1);
        int int33 = stackAr24.size();
        java.lang.Object obj34 = stackAr24.top();
        int int35 = stackAr24.size();
        boolean boolean36 = stackAr1.equals((java.lang.Object) int35);
        org.autotest.Stack stackAr38 = createStack((int) (byte) 1);
        int int39 = stackAr38.size();
        java.lang.String str40 = stackAr38.toString();
        java.lang.String str41 = stackAr38.toString();
        boolean boolean42 = stackAr38.isFull();
        int int43 = stackAr38.size();
        boolean boolean44 = stackAr38.isEmpty();
        boolean boolean45 = stackAr38.isFull();
        boolean boolean46 = stackAr38.isEmpty();
        java.lang.String str47 = stackAr38.toString();
        boolean boolean48 = stackAr1.equals((java.lang.Object) str47);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test0750");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = stackAr58.pop();
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
    }
}

