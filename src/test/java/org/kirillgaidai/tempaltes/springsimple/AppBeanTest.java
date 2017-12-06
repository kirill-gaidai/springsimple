package org.kirillgaidai.templates.springsimple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppBeanTest {

    @Test
    public void testGetMessage() throws Exception {
        AppBean appBean = new AppBean();
        assertEquals("Hello, World!", appBean.getMessage());
    }

}
