package NinjaCode;

import NinjaCode.stack.StackImpl;
import org.junit.Assert;
import org.junit.Test;

public class StackImplTest {
    @Test
    public void testIsEmpty() {
        final StackImpl stack = new StackImpl(10);
        stack.push(2);
        stack.pop();
        Assert.assertTrue( stack.empty());
    }

    @Test
    public void testIsSizeTwo() {
        final StackImpl stack = new StackImpl(10);
        stack.push(2);
        stack.push(3);
        Assert.assertFalse(stack.empty());
        Assert.assertEquals(10, stack.getSize());
    }

    @Test
    public void testPop() {
        final StackImpl stack = new StackImpl(10);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.pop());
    }

    @Test
    public void testPeek() {
        final StackImpl stack = new StackImpl(10);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.peek());
        Assert.assertEquals(3, stack.peek());
    }
}
