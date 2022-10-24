package org.example.back.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeatOnce() {
        Assert.assertEquals(StringUtil.repeat("Hole jeune",1),"Hole jeune");
    }

    @Test
    public void testRepeatTwo() {
        Assert.assertEquals(StringUtil.repeat("Hole jeune",3),"Hole jeune");
    }

    @Test
    public void testRepeatZero() {
        Assert.assertEquals(StringUtil.repeat("Hole jeune",0),"Hole jeune");
    }

}