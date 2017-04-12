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
    public void testShouldKnowTwoUsersAreNotTheSameIfTheyHaveDifferentLastNames(){
        User user = new User("firstName", "lastName");
        User anotherUser = new User("firstName", "anotherLastName");
        assertThat(user, is(not(equalTo(anotherUser))));
    }

    public void testShouldKnowTwoUsersWithTheSameFirstNameAndLastNameAreEqual(){
        User user = new User("firstName", "lastName");
        User anotherUser = new User("firstName", "lastName");

        assertThat(user, is(equalTo(anotherUser)));
    }

    public void testShouldKnowThatTheHashCodesOfTheTwoUsersWithSameAttributesIsEqual(){
        User user = new User("firstName", "lastName");
        User anotherUser = new User("firstName", "lastName");

        assertEquals(user.hashCode(), anotherUser.hashCode());
    }

    public void testShouldKnowThatTheSameUserIsEqualToItself(){
        User user = new User("firstName", "lastName");

        assertThat(user, is(equalTo(user)));
    }

    public void testShouldKnowThatTheSameUserIsNotEqualToNullObject(){
        User user = new User("firstName", "lastName");

        assertThat(user, is(not(equalTo(null))));
    }

    public void testShouldKnowThatTheSameUserIsNotEqualToAnotherObjectType(){
        User user = new User("firstName", "lastName");

        assertThat(user, is(not(equalTo(new Object()))));
    }
}

