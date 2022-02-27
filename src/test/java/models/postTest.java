package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class postTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        post posty = new post("Day 1: Intro");
        assertEquals(true, posty instanceof post);
    }

    @Test
    public void PostInstantiatesWithContent_true() throws Exception {
        post posty = new post("Day 1: Intro");
        assertEquals("Day 1: Intro", posty.getContent());

    }

    @Test
    public void AllPostsContainsAllPosts_true() {
        post post = new post("Day 1: Intro");
        post otherPost = new post ("How to pair successfully");
        assertTrue(post.getAll().contains(post));
        assertTrue(post.getAll().contains(otherPost));
    }

    @After
    public void tearDown() throws Exception {
    }
}