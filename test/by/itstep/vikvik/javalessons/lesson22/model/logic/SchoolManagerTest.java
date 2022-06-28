package by.itstep.vikvik.javalessons.lesson22.model.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SchoolManagerTest {

    private int[][] groups;

    @Before
    public void init() {
        System.out.println("@Before");
        groups = new int[][]{
                {7, 7, 8, 2},
                {9, 8, 9, 10},
                {7, 7, 1},
                {8, 8, 10, 10}
        };
    }

    @After
    public void destroy(){
        System.out.println("@After");
        groups = null;
    }

    @Before
    public void init1() {
        System.out.println("@Before");
    }

    @Before
    public void init2() {
        System.out.println("@Before");
    }

    @Test
    public void testCalculateAvgMarkPositive() {
        System.out.println("testCalculateAvgMarkPositive");
        //int[][] groups = getGroups();

        double expected = 7.4;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);
    }

    @Test
    public void testFindBadStudentGroupsPositive() {
        System.out.println("testFindBadStudentGroupsPositive");

        //int[][] groups = getGroups();

        String expected = "1 3";

        String actual = SchoolManager.findBadStudentGroups(groups);

        assertEquals(expected, actual);
    }

    @Test
    public void testfindGroupsWithoutBadStudentsPositive() {
        System.out.println("testfindGroupsWithoutBadStudentsPositive");

        //int[][] groups = getGroups();

        String expected = "2 4";

        String actual = SchoolManager.findGroupsWithoutBadStudents(groups);

        assertEquals(expected, actual);
    }
}
