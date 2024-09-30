package org.autotest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    // Tests de StackTests2

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    // COMPLETAR
    public void testReturnedPop() throws Exception {
        Stack stack = createStack(2);
        stack.push(42);
        assertEquals(42, stack.pop());
    }

    public void testNonZeroHash() throws Exception {
        Stack stack = createStack(2);
        stack.push(42);
        assertNotEquals(0, stack.hashCode());
    }

    public void testEmptyStacksNotEqualsNotEmptyStack() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(42);
        assertFalse(stack1.equals(stack2));
    }

    public void testNotEmptyEqualStacks() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(42);
        stack2.push(42);
        assertTrue(stack1.equals(stack2));
    }

    public void testStackEqualsItself() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        assertTrue(stack.equals(stack));
    }

    public void testDefaultCapacityIs10() throws Exception {
        Stack stack = createStack();
        for (int i = 0; i < 10; i++) {
            assertDoesNotThrow(() -> stack.push(0));
        }
    }

    public void testEmptyStackDoesNotEqualsNull() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(null));
    }

    public void testStackHasCorrectHash() throws Exception {
        Stack stack1 = createStack();
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(new Object[10]);
        result = prime * result + (-1);
        assertEquals(stack1.hashCode(), result);
    }

    public void testStackDoesNotEqualAnInt() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(1));
    }

    public void testCantGoPastCapacity() throws Exception {
        Stack stack = createStack();
        for (int i = 0; i < 10; i++) {
            stack.push(0);
        }

        assertThrows(IllegalStateException.class, () -> stack.push(0));
    }

    public void testCantPopEmptyStack() throws Exception {
        Stack stack = createStack();
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    public void testsDifferentStacksWithSameSizeAreNotEqual() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(42);
        stack2.push(24);
        assertFalse(stack1.equals(stack2));
    }

    public void testCanCreateZeroCapacityStack() throws Exception {
        assertDoesNotThrow(() -> createStack(0));
    }

    public void testCantGetTopOfEmptyStack() throws Exception {
        Stack stack = createStack();
        assertThrows(IllegalStateException.class, () -> stack.top());
    }
}
