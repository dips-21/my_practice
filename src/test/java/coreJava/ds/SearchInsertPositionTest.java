package coreJava.ds;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 7};
        assertThat(searchInsertPosition.bSearch(nums, 5), is(2));
        assertThat(searchInsertPosition.bSearch(nums, 4), is(2));
        assertThat(searchInsertPosition.bSearch(nums, 8), is(4));
        //assertThat(searchInsertPosition.searchInsert(nums,8),is(2));
    }

    @Test
    public void bSearch() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 7};
        assertThat(searchInsertPosition.bSearch(nums, 5), is(2));
        assertThat(searchInsertPosition.bSearch(nums, 4), is(2));
        assertThat(searchInsertPosition.bSearch(nums, 8), is(4));

    }

    @Test
    public void bSearch_single_element_found() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {5};
        assertThat(searchInsertPosition.bSearch(nums, 5), is(0));
    }

    @Test
    public void bSearch_single_element_not_found() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {5};
        assertThat(searchInsertPosition.bSearch(nums, 7), is(1));
    }

}