package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1251");
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
        boolean boolean17 = stackAr1.isEmpty();
        org.autotest.Stack stackAr19 = createStack((int) '#');
        int int20 = stackAr19.size();
        boolean boolean21 = stackAr19.isFull();
        int int22 = stackAr19.size();
        stackAr1.push((java.lang.Object) stackAr19);
        int int24 = stackAr1.size();
        java.lang.Object obj25 = stackAr1.top();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1252");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.String str8 = stackAr4.toString();
        boolean boolean9 = stackAr4.isEmpty();
        int int10 = stackAr4.size();
        boolean boolean11 = stackAr4.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1253");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        java.lang.String str12 = stackAr10.toString();
        java.lang.String str13 = stackAr10.toString();
        java.lang.String str14 = stackAr10.toString();
        java.lang.String str15 = stackAr10.toString();
        org.autotest.Stack stackAr17 = createStack(100);
        boolean boolean18 = stackAr17.isFull();
        org.autotest.Stack stackAr20 = createStack(10);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        boolean boolean28 = stackAr24.isFull();
        boolean boolean29 = stackAr20.equals((java.lang.Object) stackAr24);
        stackAr17.push((java.lang.Object) stackAr24);
        boolean boolean31 = stackAr10.equals((java.lang.Object) stackAr17);
        boolean boolean32 = stackAr10.isEmpty();
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr10);
        int int34 = stackAr1.size();
        boolean boolean35 = stackAr1.isFull();
        org.autotest.Stack stackAr37 = createStack((int) ' ');
        java.lang.String str38 = stackAr37.toString();
        org.autotest.Stack stackAr40 = createStack((int) (byte) 1);
        int int41 = stackAr40.size();
        boolean boolean42 = stackAr40.isEmpty();
        boolean boolean43 = stackAr40.isFull();
        boolean boolean44 = stackAr40.isFull();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        int int47 = stackAr46.size();
        stackAr40.push((java.lang.Object) int47);
        boolean boolean49 = stackAr37.equals((java.lang.Object) int47);
        int int50 = stackAr37.size();
        boolean boolean51 = stackAr37.isFull();
        boolean boolean52 = stackAr1.equals((java.lang.Object) boolean51);
        org.autotest.Stack stackAr54 = createStack((int) (byte) 1);
        boolean boolean55 = stackAr54.isFull();
        stackAr54.push((java.lang.Object) (short) -1);
        java.lang.Object obj58 = stackAr54.top();
        java.lang.Object obj59 = stackAr54.pop();
        org.autotest.Stack stackAr61 = createStack((int) 'a');
        boolean boolean63 = stackAr61.equals((java.lang.Object) 1.0d);
        java.lang.String str64 = stackAr61.toString();
        boolean boolean65 = stackAr61.isFull();
        int int66 = stackAr61.size();
        int int67 = stackAr61.size();
        boolean boolean68 = stackAr54.equals((java.lang.Object) stackAr61);
        boolean boolean69 = stackAr54.isFull();
        org.autotest.Stack stackAr71 = createStack((int) (byte) 1);
        int int72 = stackAr71.size();
        int int73 = stackAr71.size();
        org.autotest.Stack stackAr75 = createStack((int) 'a');
        boolean boolean77 = stackAr75.equals((java.lang.Object) 1.0d);
        java.lang.String str78 = stackAr75.toString();
        stackAr71.push((java.lang.Object) str78);
        java.lang.Object obj80 = stackAr71.top();
        stackAr54.push((java.lang.Object) stackAr71);
        int int82 = stackAr71.size();
        java.lang.String str83 = stackAr71.toString();
        stackAr1.push((java.lang.Object) str83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) -1 + "'", obj59, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[]" + "'", str78, "[]");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + "[]" + "'", obj80, "[]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[[]]" + "'", str83, "[[]]");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1254");
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
        java.lang.String str40 = stackAr1.toString();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        java.lang.String str43 = stackAr42.toString();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        boolean boolean46 = stackAr45.isFull();
        java.lang.String str47 = stackAr45.toString();
        int int48 = stackAr45.size();
        stackAr45.push((java.lang.Object) (short) 100);
        int int51 = stackAr45.size();
        stackAr42.push((java.lang.Object) stackAr45);
        int int53 = stackAr42.size();
        boolean boolean54 = stackAr42.isFull();
        java.lang.String str55 = stackAr42.toString();
        org.autotest.Stack stackAr57 = createStack((int) 'a');
        java.lang.String str58 = stackAr57.toString();
        stackAr57.push((java.lang.Object) 1.0d);
        boolean boolean61 = stackAr57.isFull();
        java.lang.Object obj62 = stackAr57.top();
        boolean boolean63 = stackAr42.equals((java.lang.Object) stackAr57);
        java.lang.String str64 = stackAr42.toString();
        boolean boolean65 = stackAr1.equals((java.lang.Object) str64);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[[100]]" + "'", str55, "[[100]]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1.0d + "'", obj62, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[[100]]" + "'", str64, "[[100]]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1255");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        boolean boolean11 = stackAr10.isEmpty();
        int int12 = stackAr10.size();
        boolean boolean13 = stackAr10.isFull();
        java.lang.String str14 = stackAr10.toString();
        int int15 = stackAr10.size();
        stackAr10.push((java.lang.Object) 10.0d);
        java.lang.Object obj18 = stackAr10.top();
        java.lang.Object obj19 = stackAr10.pop();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        java.lang.String str22 = stackAr21.toString();
        stackAr21.push((java.lang.Object) 1.0d);
        boolean boolean25 = stackAr10.equals((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr10.isEmpty();
        org.autotest.Stack stackAr28 = createStack((int) 'a');
        int int29 = stackAr28.size();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        boolean boolean32 = stackAr28.isEmpty();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 0);
        boolean boolean35 = stackAr28.equals((java.lang.Object) stackAr34);
        stackAr10.push((java.lang.Object) boolean35);
        int int37 = stackAr10.size();
        boolean boolean38 = stackAr4.equals((java.lang.Object) int37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0d + "'", obj18, 10.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1256");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.pop();
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
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1257");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) 1.0d);
        java.lang.String str13 = stackAr10.toString();
        stackAr10.push((java.lang.Object) 1L);
        org.autotest.Stack stackAr17 = createStack((int) (byte) 10);
        boolean boolean18 = stackAr17.isEmpty();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        stackAr17.push((java.lang.Object) (byte) 1);
        stackAr10.push((java.lang.Object) stackAr17);
        java.lang.String str23 = stackAr10.toString();
        int int24 = stackAr10.size();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        int int27 = stackAr26.size();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        int int30 = stackAr29.size();
        boolean boolean31 = stackAr29.isFull();
        stackAr26.push((java.lang.Object) stackAr29);
        java.lang.Object obj33 = stackAr26.pop();
        java.lang.String str34 = stackAr26.toString();
        org.autotest.Stack stackAr36 = createStack((int) (byte) 1);
        boolean boolean37 = stackAr36.isEmpty();
        org.autotest.Stack stackAr39 = createStack((int) (byte) 1);
        boolean boolean40 = stackAr39.isEmpty();
        int int41 = stackAr39.size();
        boolean boolean42 = stackAr39.isFull();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        int int45 = stackAr44.size();
        org.autotest.Stack stackAr47 = createStack((int) 'a');
        int int48 = stackAr47.size();
        boolean boolean49 = stackAr47.isFull();
        stackAr44.push((java.lang.Object) stackAr47);
        boolean boolean51 = stackAr44.isEmpty();
        boolean boolean52 = stackAr39.equals((java.lang.Object) boolean51);
        boolean boolean53 = stackAr36.equals((java.lang.Object) boolean52);
        java.lang.Object obj54 = null;
        boolean boolean55 = stackAr36.equals(obj54);
        org.autotest.Stack stackAr57 = createStack((int) (byte) 1);
        int int58 = stackAr57.size();
        boolean boolean59 = stackAr57.isEmpty();
        boolean boolean60 = stackAr57.isFull();
        int int61 = stackAr57.size();
        int int62 = stackAr57.size();
        int int63 = stackAr57.size();
        stackAr57.push((java.lang.Object) (short) 1);
        int int66 = stackAr57.size();
        boolean boolean67 = stackAr57.isEmpty();
        boolean boolean68 = stackAr36.equals((java.lang.Object) boolean67);
        boolean boolean69 = stackAr26.equals((java.lang.Object) stackAr36);
        java.lang.String str70 = stackAr36.toString();
        int int71 = stackAr36.size();
        int int72 = stackAr36.size();
        boolean boolean73 = stackAr10.equals((java.lang.Object) int72);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[1,[1]]" + "'", str23, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1258");
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
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        org.autotest.Stack stackAr20 = createStack((int) (byte) 1);
        boolean boolean21 = stackAr20.isFull();
        java.lang.String str22 = stackAr20.toString();
        int int23 = stackAr20.size();
        stackAr20.push((java.lang.Object) (short) 100);
        int int26 = stackAr20.size();
        stackAr17.push((java.lang.Object) stackAr20);
        int int28 = stackAr17.size();
        boolean boolean29 = stackAr7.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        boolean boolean32 = stackAr31.isEmpty();
        org.autotest.Stack stackAr34 = createStack((int) (byte) 1);
        boolean boolean35 = stackAr34.isEmpty();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isFull();
        org.autotest.Stack stackAr39 = createStack((int) 'a');
        int int40 = stackAr39.size();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isFull();
        stackAr39.push((java.lang.Object) stackAr42);
        boolean boolean46 = stackAr39.isEmpty();
        boolean boolean47 = stackAr34.equals((java.lang.Object) boolean46);
        boolean boolean48 = stackAr31.equals((java.lang.Object) boolean47);
        java.lang.Object obj49 = null;
        boolean boolean50 = stackAr31.equals(obj49);
        org.autotest.Stack stackAr52 = createStack((int) (byte) 1);
        int int53 = stackAr52.size();
        boolean boolean54 = stackAr52.isEmpty();
        boolean boolean55 = stackAr52.isFull();
        int int56 = stackAr52.size();
        int int57 = stackAr52.size();
        int int58 = stackAr52.size();
        stackAr52.push((java.lang.Object) (short) 1);
        int int61 = stackAr52.size();
        boolean boolean62 = stackAr52.isEmpty();
        boolean boolean63 = stackAr31.equals((java.lang.Object) boolean62);
        boolean boolean64 = stackAr31.isFull();
        boolean boolean65 = stackAr7.equals((java.lang.Object) stackAr31);
        boolean boolean66 = stackAr7.isEmpty();
        java.lang.String str67 = stackAr7.toString();
        org.autotest.Stack stackAr69 = createStack(100);
        boolean boolean70 = stackAr69.isFull();
        org.autotest.Stack stackAr72 = createStack(100);
        boolean boolean73 = stackAr72.isFull();
        org.autotest.Stack stackAr75 = createStack(10);
        int int76 = stackAr75.size();
        boolean boolean77 = stackAr75.isEmpty();
        org.autotest.Stack stackAr79 = createStack((int) 'a');
        boolean boolean80 = stackAr79.isFull();
        java.lang.Object obj81 = null;
        boolean boolean82 = stackAr79.equals(obj81);
        boolean boolean83 = stackAr79.isFull();
        boolean boolean84 = stackAr75.equals((java.lang.Object) stackAr79);
        stackAr72.push((java.lang.Object) stackAr79);
        boolean boolean86 = stackAr79.isEmpty();
        stackAr69.push((java.lang.Object) stackAr79);
        boolean boolean88 = stackAr79.isFull();
        boolean boolean89 = stackAr7.equals((java.lang.Object) stackAr79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1259");
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
        int int14 = stackAr7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackAr7.pop();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1260");
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
        stackAr1.push((java.lang.Object) "");
        boolean boolean30 = stackAr1.isEmpty();
        java.lang.Object obj31 = stackAr1.pop();
        java.lang.Object obj32 = stackAr1.pop();
        boolean boolean33 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1261");
        org.autotest.Stack stackAr1 = createStack(100);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        java.lang.String str8 = stackAr5.toString();
        org.autotest.Stack stackAr10 = createStack((int) ' ');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr10.isFull();
        java.lang.String str13 = stackAr10.toString();
        stackAr5.push((java.lang.Object) str13);
        java.lang.Object obj15 = stackAr5.top();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr17);
        boolean boolean24 = stackAr1.equals((java.lang.Object) boolean23);
        org.autotest.Stack stackAr26 = createStack((int) ' ');
        java.lang.String str27 = stackAr26.toString();
        org.autotest.Stack stackAr29 = createStack((int) (byte) 1);
        int int30 = stackAr29.size();
        boolean boolean31 = stackAr29.isEmpty();
        boolean boolean32 = stackAr29.isFull();
        boolean boolean33 = stackAr29.isFull();
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        int int36 = stackAr35.size();
        stackAr29.push((java.lang.Object) int36);
        boolean boolean38 = stackAr26.equals((java.lang.Object) int36);
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
        org.autotest.Stack stackAr53 = createStack((int) (byte) 1);
        boolean boolean54 = stackAr53.isFull();
        boolean boolean55 = stackAr47.equals((java.lang.Object) boolean54);
        boolean boolean56 = stackAr47.isFull();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        int int59 = stackAr58.size();
        int int60 = stackAr58.size();
        org.autotest.Stack stackAr62 = createStack((int) (byte) 1);
        int int63 = stackAr62.size();
        boolean boolean64 = stackAr62.isEmpty();
        boolean boolean65 = stackAr62.isFull();
        int int66 = stackAr62.size();
        boolean boolean67 = stackAr62.isFull();
        org.autotest.Stack stackAr69 = createStack((int) 'a');
        boolean boolean71 = stackAr69.equals((java.lang.Object) 1.0d);
        java.lang.String str72 = stackAr69.toString();
        stackAr62.push((java.lang.Object) stackAr69);
        stackAr58.push((java.lang.Object) stackAr69);
        int int75 = stackAr58.size();
        stackAr47.push((java.lang.Object) stackAr58);
        boolean boolean77 = stackAr26.equals((java.lang.Object) stackAr58);
        stackAr1.push((java.lang.Object) stackAr26);
        java.lang.Object obj79 = null;
        stackAr26.push(obj79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "[]" + "'", obj15, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1262");
        org.autotest.Stack stackAr1 = createStack(100);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1263");
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
        stackAr1.push((java.lang.Object) "");
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        boolean boolean32 = stackAr31.isFull();
        java.lang.Object obj33 = null;
        boolean boolean34 = stackAr31.equals(obj33);
        boolean boolean35 = stackAr31.isFull();
        org.autotest.Stack stackAr37 = createStack((int) (byte) 1);
        int int38 = stackAr37.size();
        int int39 = stackAr37.size();
        boolean boolean40 = stackAr31.equals((java.lang.Object) stackAr37);
        int int41 = stackAr37.size();
        boolean boolean42 = stackAr37.isFull();
        org.autotest.Stack stackAr44 = createStack((int) (byte) 1);
        boolean boolean45 = stackAr44.isEmpty();
        int int46 = stackAr44.size();
        boolean boolean47 = stackAr44.isFull();
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        int int50 = stackAr49.size();
        org.autotest.Stack stackAr52 = createStack((int) 'a');
        int int53 = stackAr52.size();
        boolean boolean54 = stackAr52.isFull();
        stackAr49.push((java.lang.Object) stackAr52);
        boolean boolean56 = stackAr49.isEmpty();
        boolean boolean57 = stackAr44.equals((java.lang.Object) boolean56);
        stackAr37.push((java.lang.Object) stackAr44);
        boolean boolean59 = stackAr1.equals((java.lang.Object) stackAr44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = stackAr44.pop();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1264");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack(100);
        int int6 = stackAr5.size();
        boolean boolean7 = stackAr5.isEmpty();
        int int8 = stackAr5.size();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr5);
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1265");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1266");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        stackAr1.push((java.lang.Object) 10.0d);
        java.lang.String str9 = stackAr1.toString();
        java.lang.String str10 = stackAr1.toString();
        java.lang.Object obj11 = stackAr1.top();
        int int12 = stackAr1.size();
        java.lang.Object obj13 = stackAr1.pop();
        boolean boolean14 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10.0]" + "'", str9, "[10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10.0]" + "'", str10, "[10.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1267");
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
        boolean boolean66 = stackAr1.isEmpty();
        boolean boolean67 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1268");
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
        int int20 = stackAr1.size();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1269");
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
        boolean boolean20 = stackAr11.isFull();
        boolean boolean21 = stackAr11.isFull();
        boolean boolean22 = stackAr11.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1270");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) 1.0d);
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) (byte) 1);
        int int7 = stackAr6.size();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) boolean8);
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1271");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack(10);
        int int7 = stackAr6.size();
        org.autotest.Stack stackAr9 = createStack(10);
        int int10 = stackAr9.size();
        stackAr6.push((java.lang.Object) int10);
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean13 = stackAr6.isEmpty();
        boolean boolean14 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1272");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1273");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        stackAr1.push((java.lang.Object) (short) 1);
        org.autotest.Stack stackAr11 = createStack((int) ' ');
        java.lang.String str12 = stackAr11.toString();
        boolean boolean13 = stackAr11.isFull();
        boolean boolean14 = stackAr11.isEmpty();
        stackAr11.push((java.lang.Object) 10.0d);
        org.autotest.Stack stackAr18 = createStack((int) ' ');
        java.lang.String str19 = stackAr18.toString();
        boolean boolean20 = stackAr18.isFull();
        java.lang.String str21 = stackAr18.toString();
        java.lang.String str22 = stackAr18.toString();
        java.lang.String str23 = stackAr18.toString();
        stackAr11.push((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        int int27 = stackAr26.size();
        boolean boolean28 = stackAr26.isEmpty();
        boolean boolean29 = stackAr26.isFull();
        int int30 = stackAr26.size();
        boolean boolean31 = stackAr26.isFull();
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) 1.0d);
        java.lang.String str36 = stackAr33.toString();
        stackAr26.push((java.lang.Object) stackAr33);
        org.autotest.Stack stackAr39 = createStack((int) (byte) 1);
        boolean boolean40 = stackAr39.isFull();
        boolean boolean41 = stackAr33.equals((java.lang.Object) boolean40);
        org.autotest.Stack stackAr43 = createStack((int) '#');
        int int44 = stackAr43.size();
        boolean boolean45 = stackAr33.equals((java.lang.Object) stackAr43);
        org.autotest.Stack stackAr47 = createStack((int) (byte) 1);
        boolean boolean48 = stackAr47.isFull();
        java.lang.String str49 = stackAr47.toString();
        org.autotest.Stack stackAr51 = createStack(10);
        boolean boolean52 = stackAr51.isEmpty();
        java.lang.Object obj53 = null;
        boolean boolean54 = stackAr51.equals(obj53);
        stackAr47.push(obj53);
        boolean boolean56 = stackAr43.equals((java.lang.Object) stackAr47);
        java.lang.Object obj57 = stackAr47.pop();
        boolean boolean58 = stackAr47.isFull();
        stackAr18.push((java.lang.Object) stackAr47);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr47);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1274");
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
        java.lang.String str45 = stackAr1.toString();
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
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1275");
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
        java.lang.Object obj34 = stackAr1.pop();
        java.lang.Object obj35 = stackAr1.pop();
        boolean boolean36 = stackAr1.isFull();
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1276");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        java.lang.String str9 = stackAr4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr4.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1277");
        org.autotest.Stack stackAr1 = createStack(3);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1278");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        boolean boolean9 = stackAr1.isFull();
        org.autotest.Stack stackAr11 = createStack((int) (byte) 1);
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isFull();
        int int15 = stackAr11.size();
        org.autotest.Stack stackAr17 = createStack((int) (byte) 1);
        int int18 = stackAr17.size();
        java.lang.String str19 = stackAr17.toString();
        java.lang.String str20 = stackAr17.toString();
        boolean boolean21 = stackAr17.isFull();
        java.lang.String str22 = stackAr17.toString();
        boolean boolean23 = stackAr11.equals((java.lang.Object) str22);
        stackAr1.push((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1279");
        org.autotest.Stack stackAr1 = createStack(10);
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack(10);
        int int5 = stackAr4.size();
        stackAr1.push((java.lang.Object) int5);
        org.autotest.Stack stackAr8 = createStack(10);
        int int9 = stackAr8.size();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        boolean boolean12 = stackAr11.isFull();
        org.autotest.Stack stackAr14 = createStack((int) (byte) 1);
        int int15 = stackAr14.size();
        boolean boolean16 = stackAr14.isEmpty();
        boolean boolean17 = stackAr14.isFull();
        boolean boolean18 = stackAr14.isFull();
        int int19 = stackAr14.size();
        stackAr11.push((java.lang.Object) stackAr14);
        boolean boolean21 = stackAr8.equals((java.lang.Object) stackAr14);
        org.autotest.Stack stackAr23 = createStack((int) (byte) 1);
        org.autotest.Stack stackAr25 = createStack((int) 'a');
        boolean boolean26 = stackAr25.isFull();
        java.lang.Object obj27 = null;
        boolean boolean28 = stackAr25.equals(obj27);
        boolean boolean29 = stackAr25.isFull();
        org.autotest.Stack stackAr31 = createStack((int) (byte) 1);
        int int32 = stackAr31.size();
        int int33 = stackAr31.size();
        boolean boolean34 = stackAr25.equals((java.lang.Object) stackAr31);
        int int35 = stackAr31.size();
        int int36 = stackAr31.size();
        boolean boolean37 = stackAr23.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr39 = createStack(100);
        boolean boolean40 = stackAr39.isFull();
        org.autotest.Stack stackAr42 = createStack((int) (byte) 1);
        boolean boolean43 = stackAr42.isFull();
        java.lang.String str44 = stackAr42.toString();
        org.autotest.Stack stackAr46 = createStack((int) (byte) 10);
        boolean boolean47 = stackAr46.isEmpty();
        org.autotest.Stack stackAr49 = createStack((int) (byte) 1);
        stackAr46.push((java.lang.Object) (byte) 1);
        boolean boolean51 = stackAr42.equals((java.lang.Object) stackAr46);
        org.autotest.Stack stackAr53 = createStack((int) 'a');
        int int54 = stackAr53.size();
        org.autotest.Stack stackAr56 = createStack((int) 'a');
        int int57 = stackAr56.size();
        boolean boolean58 = stackAr56.isFull();
        stackAr53.push((java.lang.Object) stackAr56);
        boolean boolean60 = stackAr46.equals((java.lang.Object) stackAr56);
        java.lang.Object obj61 = stackAr46.top();
        java.lang.String str62 = stackAr46.toString();
        boolean boolean63 = stackAr39.equals((java.lang.Object) stackAr46);
        stackAr46.push((java.lang.Object) (-1));
        stackAr31.push((java.lang.Object) stackAr46);
        int int67 = stackAr46.size();
        stackAr8.push((java.lang.Object) int67);
        boolean boolean69 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.String str70 = stackAr8.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) 1 + "'", obj61, (byte) 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[1]" + "'", str62, "[1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[2]" + "'", str70, "[2]");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1280");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1281");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr1.pop();
        int int9 = stackAr1.size();
        java.lang.String str10 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1282");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
        org.autotest.Stack stackAr8 = createStack((int) (byte) 1);
        boolean boolean9 = stackAr8.isEmpty();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        java.lang.String str12 = stackAr8.toString();
        int int13 = stackAr8.size();
        stackAr8.push((java.lang.Object) 10.0d);
        java.lang.String str16 = stackAr8.toString();
        java.lang.String str17 = stackAr8.toString();
        boolean boolean19 = stackAr8.equals((java.lang.Object) false);
        java.lang.Object obj20 = stackAr8.top();
        java.lang.String str21 = stackAr8.toString();
        org.autotest.Stack stackAr23 = createStack((int) ' ');
        int int24 = stackAr23.size();
        boolean boolean25 = stackAr8.equals((java.lang.Object) stackAr23);
        boolean boolean26 = stackAr1.equals((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[10.0]" + "'", str16, "[10.0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[10.0]" + "'", str17, "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10.0]" + "'", str21, "[10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1283");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.Stack stackAr10 = createStack((int) (byte) 1);
        int int11 = stackAr10.size();
        java.lang.String str12 = stackAr10.toString();
        java.lang.String str13 = stackAr10.toString();
        java.lang.String str14 = stackAr10.toString();
        java.lang.String str15 = stackAr10.toString();
        org.autotest.Stack stackAr17 = createStack(100);
        boolean boolean18 = stackAr17.isFull();
        org.autotest.Stack stackAr20 = createStack(10);
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        org.autotest.Stack stackAr24 = createStack((int) 'a');
        boolean boolean25 = stackAr24.isFull();
        java.lang.Object obj26 = null;
        boolean boolean27 = stackAr24.equals(obj26);
        boolean boolean28 = stackAr24.isFull();
        boolean boolean29 = stackAr20.equals((java.lang.Object) stackAr24);
        stackAr17.push((java.lang.Object) stackAr24);
        boolean boolean31 = stackAr10.equals((java.lang.Object) stackAr17);
        boolean boolean32 = stackAr10.isEmpty();
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr10);
        int int34 = stackAr1.size();
        org.autotest.Stack stackAr36 = createStack((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        int int38 = stackAr36.size();
        java.lang.Object obj39 = null;
        boolean boolean40 = stackAr36.equals(obj39);
        boolean boolean41 = stackAr1.equals(obj39);
        boolean boolean42 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1284");
        org.autotest.Stack stackAr1 = createStack(100);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        java.lang.String str8 = stackAr5.toString();
        org.autotest.Stack stackAr10 = createStack((int) ' ');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr10.isFull();
        java.lang.String str13 = stackAr10.toString();
        stackAr5.push((java.lang.Object) str13);
        java.lang.Object obj15 = stackAr5.top();
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr17);
        boolean boolean24 = stackAr1.equals((java.lang.Object) boolean23);
        org.autotest.Stack stackAr26 = createStack((int) (byte) 1);
        boolean boolean27 = stackAr26.isEmpty();
        int int28 = stackAr26.size();
        boolean boolean29 = stackAr26.isFull();
        java.lang.String str30 = stackAr26.toString();
        int int31 = stackAr26.size();
        stackAr26.push((java.lang.Object) 10.0d);
        java.lang.Object obj34 = stackAr26.top();
        java.lang.Object obj35 = stackAr26.pop();
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        java.lang.String str38 = stackAr37.toString();
        stackAr37.push((java.lang.Object) 1.0d);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr37);
        stackAr1.push((java.lang.Object) stackAr37);
        java.lang.String str43 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "[]" + "'", obj15, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0d + "'", obj35, 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[[1.0]]" + "'", str43, "[[1.0]]");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1285");
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
        int int22 = stackAr5.size();
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        boolean boolean25 = stackAr24.isEmpty();
        int int26 = stackAr24.size();
        boolean boolean27 = stackAr24.isFull();
        org.autotest.Stack stackAr29 = createStack((int) 'a');
        int int30 = stackAr29.size();
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        int int33 = stackAr32.size();
        boolean boolean34 = stackAr32.isFull();
        stackAr29.push((java.lang.Object) stackAr32);
        boolean boolean36 = stackAr29.isEmpty();
        boolean boolean37 = stackAr24.equals((java.lang.Object) boolean36);
        int int38 = stackAr24.size();
        int int39 = stackAr24.size();
        org.autotest.Stack stackAr41 = createStack((int) '#');
        int int42 = stackAr41.size();
        int int43 = stackAr41.size();
        java.lang.String str44 = stackAr41.toString();
        boolean boolean45 = stackAr24.equals((java.lang.Object) stackAr41);
        java.lang.Object obj46 = null;
        boolean boolean47 = stackAr24.equals(obj46);
        java.lang.String str48 = stackAr24.toString();
        boolean boolean49 = stackAr5.equals((java.lang.Object) stackAr24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = stackAr24.pop();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1286");
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
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        boolean boolean34 = stackAr33.isFull();
        java.lang.String str35 = stackAr33.toString();
        boolean boolean36 = stackAr33.isEmpty();
        int int37 = stackAr33.size();
        boolean boolean38 = stackAr26.equals((java.lang.Object) stackAr33);
        boolean boolean39 = stackAr33.isEmpty();
        java.lang.String str40 = stackAr33.toString();
        java.lang.String str41 = stackAr33.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = stackAr33.top();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1287");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1288");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
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
        org.autotest.Stack stackAr30 = createStack((int) 'a');
        boolean boolean31 = stackAr30.isFull();
        org.autotest.Stack stackAr33 = createStack((int) (byte) 1);
        int int34 = stackAr33.size();
        boolean boolean35 = stackAr33.isEmpty();
        boolean boolean36 = stackAr33.isFull();
        boolean boolean37 = stackAr33.isFull();
        int int38 = stackAr33.size();
        stackAr30.push((java.lang.Object) stackAr33);
        boolean boolean40 = stackAr24.equals((java.lang.Object) stackAr30);
        int int41 = stackAr24.size();
        stackAr1.push((java.lang.Object) int41);
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean45 = stackAr44.isFull();
        java.lang.Object obj46 = null;
        boolean boolean47 = stackAr44.equals(obj46);
        boolean boolean48 = stackAr44.isFull();
        org.autotest.Stack stackAr50 = createStack((int) (byte) 1);
        int int51 = stackAr50.size();
        int int52 = stackAr50.size();
        boolean boolean53 = stackAr44.equals((java.lang.Object) stackAr50);
        int int54 = stackAr50.size();
        java.lang.String str55 = stackAr50.toString();
        boolean boolean56 = stackAr50.isEmpty();
        boolean boolean57 = stackAr50.isFull();
        java.lang.String str58 = stackAr50.toString();
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        boolean boolean61 = stackAr60.isFull();
        stackAr60.push((java.lang.Object) (short) -1);
        boolean boolean64 = stackAr60.isEmpty();
        stackAr50.push((java.lang.Object) stackAr60);
        java.lang.String str66 = stackAr60.toString();
        boolean boolean67 = stackAr60.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr60);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[-1]" + "'", str66, "[-1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1289");
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
        org.autotest.Stack stackAr24 = createStack((int) (byte) 1);
        boolean boolean25 = stackAr24.isFull();
        java.lang.String str26 = stackAr24.toString();
        int int27 = stackAr24.size();
        org.autotest.Stack stackAr29 = createStack((int) (byte) 10);
        boolean boolean30 = stackAr29.isEmpty();
        org.autotest.Stack stackAr32 = createStack((int) (byte) 1);
        stackAr29.push((java.lang.Object) (byte) 1);
        org.autotest.Stack stackAr35 = createStack((int) 'a');
        boolean boolean36 = stackAr35.isFull();
        java.lang.Object obj37 = null;
        boolean boolean38 = stackAr35.equals(obj37);
        boolean boolean39 = stackAr35.isFull();
        org.autotest.Stack stackAr41 = createStack((int) (byte) 1);
        int int42 = stackAr41.size();
        int int43 = stackAr41.size();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        int int46 = stackAr45.size();
        boolean boolean47 = stackAr45.isEmpty();
        boolean boolean48 = stackAr45.isFull();
        int int49 = stackAr45.size();
        boolean boolean50 = stackAr45.isFull();
        org.autotest.Stack stackAr52 = createStack((int) 'a');
        boolean boolean54 = stackAr52.equals((java.lang.Object) 1.0d);
        java.lang.String str55 = stackAr52.toString();
        stackAr45.push((java.lang.Object) stackAr52);
        stackAr41.push((java.lang.Object) stackAr52);
        boolean boolean58 = stackAr35.equals((java.lang.Object) stackAr52);
        org.autotest.Stack stackAr60 = createStack((int) (byte) 1);
        boolean boolean61 = stackAr60.isEmpty();
        boolean boolean62 = stackAr60.isFull();
        int int63 = stackAr60.size();
        boolean boolean64 = stackAr60.isFull();
        boolean boolean65 = stackAr35.equals((java.lang.Object) stackAr60);
        boolean boolean66 = stackAr29.equals((java.lang.Object) stackAr35);
        boolean boolean67 = stackAr24.equals((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr69 = createStack((int) 'a');
        boolean boolean70 = stackAr69.isFull();
        java.lang.Object obj71 = null;
        boolean boolean72 = stackAr69.equals(obj71);
        boolean boolean73 = stackAr69.isFull();
        org.autotest.Stack stackAr75 = createStack((int) (byte) 1);
        int int76 = stackAr75.size();
        int int77 = stackAr75.size();
        org.autotest.Stack stackAr79 = createStack((int) (byte) 1);
        int int80 = stackAr79.size();
        boolean boolean81 = stackAr79.isEmpty();
        boolean boolean82 = stackAr79.isFull();
        int int83 = stackAr79.size();
        boolean boolean84 = stackAr79.isFull();
        org.autotest.Stack stackAr86 = createStack((int) 'a');
        boolean boolean88 = stackAr86.equals((java.lang.Object) 1.0d);
        java.lang.String str89 = stackAr86.toString();
        stackAr79.push((java.lang.Object) stackAr86);
        stackAr75.push((java.lang.Object) stackAr86);
        boolean boolean92 = stackAr69.equals((java.lang.Object) stackAr86);
        java.lang.Object obj93 = new java.lang.Object();
        boolean boolean94 = stackAr86.equals(obj93);
        boolean boolean95 = stackAr29.equals((java.lang.Object) stackAr86);
        java.lang.Object obj96 = stackAr29.pop();
        boolean boolean97 = stackAr29.isFull();
        boolean boolean98 = stackAr1.equals((java.lang.Object) boolean97);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "[]" + "'", str89, "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + obj96 + "' != '" + (byte) 1 + "'", obj96, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1290");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1291");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) 'a');
        int int8 = stackAr7.size();
        stackAr1.push((java.lang.Object) int8);
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
        boolean boolean31 = stackAr11.isFull();
        boolean boolean32 = stackAr1.equals((java.lang.Object) stackAr11);
        java.lang.String str33 = stackAr11.toString();
        int int34 = stackAr11.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1292");
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
        org.autotest.Stack stackAr38 = createStack((int) (byte) 1);
        boolean boolean39 = stackAr38.isEmpty();
        org.autotest.Stack stackAr41 = createStack((int) (byte) 1);
        boolean boolean42 = stackAr41.isEmpty();
        int int43 = stackAr41.size();
        boolean boolean44 = stackAr41.isFull();
        org.autotest.Stack stackAr46 = createStack((int) 'a');
        int int47 = stackAr46.size();
        org.autotest.Stack stackAr49 = createStack((int) 'a');
        int int50 = stackAr49.size();
        boolean boolean51 = stackAr49.isFull();
        stackAr46.push((java.lang.Object) stackAr49);
        boolean boolean53 = stackAr46.isEmpty();
        boolean boolean54 = stackAr41.equals((java.lang.Object) boolean53);
        boolean boolean55 = stackAr38.equals((java.lang.Object) boolean54);
        java.lang.Object obj56 = null;
        boolean boolean57 = stackAr38.equals(obj56);
        org.autotest.Stack stackAr59 = createStack((int) (byte) 1);
        int int60 = stackAr59.size();
        boolean boolean61 = stackAr59.isEmpty();
        boolean boolean62 = stackAr59.isFull();
        int int63 = stackAr59.size();
        int int64 = stackAr59.size();
        int int65 = stackAr59.size();
        stackAr59.push((java.lang.Object) (short) 1);
        int int68 = stackAr59.size();
        boolean boolean69 = stackAr59.isEmpty();
        boolean boolean70 = stackAr38.equals((java.lang.Object) boolean69);
        boolean boolean71 = stackAr38.isFull();
        java.lang.String str72 = stackAr38.toString();
        boolean boolean73 = stackAr16.equals((java.lang.Object) stackAr38);
        int int74 = stackAr16.size();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1293");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 1);
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        stackAr1.push((java.lang.Object) (short) 1);
        java.lang.Object obj10 = stackAr1.pop();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1294");
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
        java.lang.Object obj34 = stackAr1.pop();
        java.lang.Object obj35 = stackAr1.pop();
        int int36 = stackAr1.size();
        java.lang.String str37 = stackAr1.toString();
        org.autotest.Stack stackAr39 = createStack((int) '#');
        org.autotest.Stack stackAr41 = createStack((int) (byte) 10);
        java.lang.String str42 = stackAr41.toString();
        java.lang.String str43 = stackAr41.toString();
        org.autotest.Stack stackAr45 = createStack((int) (byte) 1);
        boolean boolean46 = stackAr45.isEmpty();
        int int47 = stackAr45.size();
        boolean boolean48 = stackAr45.isFull();
        java.lang.String str49 = stackAr45.toString();
        boolean boolean50 = stackAr45.isFull();
        stackAr45.push((java.lang.Object) 0.0f);
        stackAr41.push((java.lang.Object) stackAr45);
        boolean boolean54 = stackAr39.equals((java.lang.Object) stackAr45);
        boolean boolean55 = stackAr45.isEmpty();
        boolean boolean56 = stackAr45.isFull();
        boolean boolean57 = stackAr45.isFull();
        org.autotest.Stack stackAr59 = createStack((int) 'a');
        boolean boolean60 = stackAr59.isFull();
        java.lang.Object obj61 = null;
        boolean boolean62 = stackAr59.equals(obj61);
        boolean boolean63 = stackAr59.isFull();
        org.autotest.Stack stackAr65 = createStack((int) (byte) 1);
        int int66 = stackAr65.size();
        int int67 = stackAr65.size();
        boolean boolean68 = stackAr59.equals((java.lang.Object) stackAr65);
        int int69 = stackAr65.size();
        boolean boolean70 = stackAr65.isFull();
        org.autotest.Stack stackAr72 = createStack((int) (byte) 1);
        boolean boolean73 = stackAr72.isEmpty();
        int int74 = stackAr72.size();
        boolean boolean75 = stackAr72.isFull();
        org.autotest.Stack stackAr77 = createStack((int) 'a');
        int int78 = stackAr77.size();
        org.autotest.Stack stackAr80 = createStack((int) 'a');
        int int81 = stackAr80.size();
        boolean boolean82 = stackAr80.isFull();
        stackAr77.push((java.lang.Object) stackAr80);
        boolean boolean84 = stackAr77.isEmpty();
        boolean boolean85 = stackAr72.equals((java.lang.Object) boolean84);
        stackAr65.push((java.lang.Object) stackAr72);
        boolean boolean87 = stackAr45.equals((java.lang.Object) stackAr65);
        stackAr1.push((java.lang.Object) stackAr65);
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[1]" + "'", str37, "[1]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1295");
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
        int int16 = stackAr4.size();
        boolean boolean17 = stackAr4.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1296");
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
        org.autotest.Stack stackAr16 = createStack((int) (byte) 1);
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.isFull();
        int int20 = stackAr16.size();
        int int21 = stackAr16.size();
        int int22 = stackAr16.size();
        boolean boolean23 = stackAr1.equals((java.lang.Object) int22);
        int int24 = stackAr1.size();
        boolean boolean25 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1,[1]]" + "'", str14, "[1,[1]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1297");
        org.autotest.Stack stackAr1 = createStack((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.Stack stackAr4 = createStack((int) 'a');
        boolean boolean6 = stackAr4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = stackAr4.toString();
        stackAr4.push((java.lang.Object) 1L);
        boolean boolean10 = stackAr1.equals((java.lang.Object) 1L);
        org.autotest.Stack stackAr12 = createStack((int) (byte) 1);
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isEmpty();
        boolean boolean15 = stackAr12.isFull();
        int int16 = stackAr12.size();
        boolean boolean17 = stackAr12.isFull();
        java.lang.String str18 = stackAr12.toString();
        boolean boolean19 = stackAr12.isEmpty();
        boolean boolean20 = stackAr1.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        boolean boolean23 = stackAr22.isFull();
        java.lang.Object obj24 = null;
        boolean boolean25 = stackAr22.equals(obj24);
        org.autotest.Stack stackAr27 = createStack((int) (byte) 1);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        boolean boolean30 = stackAr27.isFull();
        int int31 = stackAr27.size();
        java.lang.String str32 = stackAr27.toString();
        stackAr22.push((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr35 = createStack((int) (byte) 1);
        int int36 = stackAr35.size();
        boolean boolean37 = stackAr35.isEmpty();
        boolean boolean38 = stackAr35.isFull();
        int int39 = stackAr35.size();
        int int40 = stackAr35.size();
        int int41 = stackAr35.size();
        stackAr35.push((java.lang.Object) (short) 1);
        java.lang.Object obj44 = stackAr35.pop();
        boolean boolean45 = stackAr27.equals((java.lang.Object) stackAr35);
        boolean boolean46 = stackAr35.isFull();
        boolean boolean47 = stackAr35.isFull();
        stackAr12.push((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 1 + "'", obj44, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1298");
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
        java.lang.Object obj41 = stackAr23.pop();
        java.lang.String str42 = stackAr23.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = stackAr23.pop();
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
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1299");
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
        java.lang.String str31 = stackAr28.toString();
        java.lang.String str32 = stackAr28.toString();
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
        int int48 = stackAr40.size();
        boolean boolean49 = stackAr40.isFull();
        boolean boolean50 = stackAr40.isEmpty();
        stackAr28.push((java.lang.Object) boolean50);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test1300");
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
        org.autotest.Stack stackAr17 = createStack((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 1L);
        int int23 = stackAr17.size();
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
        java.lang.String str49 = stackAr42.toString();
        org.autotest.Stack stackAr51 = createStack((int) (byte) 1);
        boolean boolean52 = stackAr51.isFull();
        java.lang.String str53 = stackAr51.toString();
        org.autotest.Stack stackAr55 = createStack((int) (byte) 10);
        boolean boolean56 = stackAr55.isEmpty();
        org.autotest.Stack stackAr58 = createStack((int) (byte) 1);
        stackAr55.push((java.lang.Object) (byte) 1);
        boolean boolean60 = stackAr51.equals((java.lang.Object) stackAr55);
        org.autotest.Stack stackAr62 = createStack((int) 'a');
        int int63 = stackAr62.size();
        org.autotest.Stack stackAr65 = createStack((int) 'a');
        int int66 = stackAr65.size();
        boolean boolean67 = stackAr65.isFull();
        stackAr62.push((java.lang.Object) stackAr65);
        boolean boolean69 = stackAr55.equals((java.lang.Object) stackAr65);
        java.lang.Object obj70 = stackAr55.top();
        stackAr42.push((java.lang.Object) stackAr55);
        boolean boolean72 = stackAr17.equals((java.lang.Object) stackAr55);
        boolean boolean73 = stackAr1.equals((java.lang.Object) stackAr55);
        org.autotest.Stack stackAr75 = createStack((int) 'a');
        boolean boolean76 = stackAr75.isEmpty();
        boolean boolean77 = stackAr55.equals((java.lang.Object) boolean76);
        int int78 = stackAr55.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 1 + "'", obj70, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }
}

