package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestVariant1 {

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n, int[] expected) {
        assertEquals(new Variant1().arrayTask(n), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] {
                { 5, new int[] { 1, 3, 5, 7, 9 } },
                { 3, new int[] { 1, 3, 5 } }
        };
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int a, boolean expected) {
        assertEquals(new Variant1().booleanTask(a), expected);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] {
                { 5, true },
                { -1, false },
                { 0, false }
        };
    }

    @Test(dataProvider = "switchProvider")
    public void switchTest(int number, Variant1.DAY_OF_WEEK expected) {
        assertEquals(new Variant1().switchTask(number), expected);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] {
                { 1, Variant1.DAY_OF_WEEK.MONDAY },
                { 7, Variant1.DAY_OF_WEEK.SUNDAY }
        };
    }

    @Test(dataProvider = "forProvider")
    public void forTest(int k, int n, int[] expected) {
        assertEquals(new Variant1().forTask(k, n), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {
                { 3, 4, new int[] { 3, 3, 3, 3 } },
                { 1, 2, new int[] { 1, 1 } }
        };
    }

    @Test(dataProvider = "ifProvider")
    public void ifTest(int param, int expected) {
        assertEquals(new Variant1().ifTask(param), expected);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] {
                { 3, 4 },
                { -5, -5 },
                { 0, 0 }
        };
    }

    @Test(dataProvider = "integerProvider")
    public void integerTest(int l, int expected) {
        assertEquals(new Variant1().integerNumbersTask(l), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] {
                { 150, 1 },
                { 99, 0 },
                { 200, 2 }
        };
    }

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int m, int n, int[][] expected) {
        assertEquals(new Variant1().twoDimensionArrayTask(m, n), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {
                { 2, 3, new int[][] { { 10, 10, 10 }, { 20, 20, 20 } } },
                { 3, 2, new int[][] { { 10, 10 }, { 20, 20 }, { 30, 30 } } }
        };
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b, int expected) {
        assertEquals(new Variant1().whileTask(a, b), expected);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] {
                { 10, 3, 1 },
                { 25, 7, 4 }
        };
    }
}
