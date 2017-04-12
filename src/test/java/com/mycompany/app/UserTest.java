package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserTest.class );
    }

    /**
     * Rigourous Test :-)
     */


    public void testAppIsTheSame(){
        User user = new User();
        User anotherUser = new User();
        assertEquals(user.getClass(), anotherUser.getClass());
    }

    public void testShouldKnowTwoUsersAreNotTheSameIfTheyHaveDifferentFirstNames(){
        User user = new User("firstName", "lastName");
        User anotherUser = new User("anotherFirstName", "lastName");
        assertThat(user, is(not(equalTo(anotherUser))));
    }
}

