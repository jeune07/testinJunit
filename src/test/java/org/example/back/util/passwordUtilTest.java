package org.example.back.util;

import org.junit.Test;
import static org.example.back.util.passwordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class passwordUtilTest {

    @Test
    public void weak_when_has_less_8_letters(){
       assertEquals(WEAK, passwordUtil.assessPassword("123456"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, passwordUtil.assessPassword("jjjjsss"));
    }
    @Test
    public void weak_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, passwordUtil.assessPassword("123456kssl"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_simbols(){
        assertEquals(STRONG,passwordUtil.assessPassword("1234jks!"));
    }



    }