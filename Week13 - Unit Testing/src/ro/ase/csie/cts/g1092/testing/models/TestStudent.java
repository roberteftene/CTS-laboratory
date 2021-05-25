package ro.ase.csie.cts.g1092.testing.models;

import org.junit.*;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
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

}