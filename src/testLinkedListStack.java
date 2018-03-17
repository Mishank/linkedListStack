import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testLinkedListStack {

    List<Integer> testData;

    @Before
    public void init() {
        testData = Arrays.asList(600, 1200, 1500, 2100);
    }

    @Test
    public void testPushPop() {
        linkedListStack<Integer> stack = new linkedListStack<>();
        stack.push(13);
        stack.push(18);
        assertEquals("18,13,", stack.toString());
        assertEquals(18, (int) stack.pop());
        assertEquals("13,", stack.toString());
    }

    @Test
    public void testPopIsEmpty() {
        linkedListStack<Integer> stack = new linkedListStack<>();
        assertTrue(stack.isEmpty());
        for (Integer value : testData) {
            stack.push(value);
        }
        assertFalse(stack.isEmpty());
        for (int i = testData.size(); i > 0; --i) {
            assertEquals(testData.get(i - 1), stack.pop());
        }
    }

    @Test
    public void testPushIsEmpty() {
        linkedListStack<Integer> stack = new linkedListStack<>();
        assertTrue(stack.isEmpty());
        for (Integer value : testData) {
            stack.push(value);
        }
        assertFalse(stack.isEmpty());
    }
}