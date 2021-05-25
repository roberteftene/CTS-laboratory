package ro.ase.csie.cts.g1092.testing.models;

import org.junit.*;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    //Test fixture
    static List<Integer> grades = new ArrayList<>();
    static Student student = null;
    static String initialName;
    static int initalAge;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "John";
        initalAge = 21;
    }


    @Before
    public void setUp() throws Exception {
        student = new Student(initialName,initalAge,grades);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testSetNameRightValues() throws WrongNameException {
        String newName = " Alice";
        student.setName(newName);

        Assert.assertEquals("Testing with proper name",newName,student.getName());
    }

    @Test
    public void testSetAgeRightValues() {
        int newAge  = initalAge + 1;
        try {
            student.setAge(newAge);
            Assert.assertEquals("Testing for proper age value",newAge,student.getAge());
        } catch (WrongAgeException e) {
            Assert.fail("We got an exception when that was not expected");
        }

    }

    @Test
    public void testSetNameErrorCondition() {
        String newName = "Io";
        try {
            student.setName(newName);
            Assert.fail("We didn't got the expected exception");
        } catch (WrongNameException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(expected = WrongAgeException.class)
    public void testSetAgeErrorCondition() throws WrongAgeException {
        int newAge = -4;
        student.setAge(newAge);
    }

    @Test
    public void testGetMeanGradeOrderingAscending() throws WrongGradesException {
        List<Integer> orderGrades = new ArrayList<>();
        orderGrades.add(7);
        orderGrades.add(8);
        orderGrades.add(9);

        student.setGrades(orderGrades);
        int expectedGrade = 7;
        int minGrade = student.getMinGrade();

        Assert.assertEquals("Testing with an ordered array of grades",expectedGrade,minGrade);
    }

    @Test
    public void testGetMinGradeCardinalityZero() throws WrongGradesException {
        List<Integer> emptyGrades = new ArrayList<>();
        student.setGrades(emptyGrades);
        int expectValue = 0;
        int minGrade = student.getMinGrade();

        Assert.assertEquals("Testing with zero grades",expectValue,minGrade);
    }

    @Test
    public void testGetMinGradeCardinalityOne() throws WrongGradesException {
        int singleGrade = 9;
        List<Integer> oneGrades = new ArrayList<>();
        oneGrades.add(singleGrade);
        student.setGrades(oneGrades);
        int expectValue = singleGrade;
        int minGrade = student.getMinGrade();

        Assert.assertEquals("Testing with zero grades",expectValue,minGrade);
    }

    @Test
    public void testSetNameInverseRelation() throws WrongNameException {
        String newName = "Alice";
        student.setName(newName);
        Assert.assertNotEquals(initialName,student.getName());
    }
}