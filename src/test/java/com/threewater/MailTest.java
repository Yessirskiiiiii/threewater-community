package com.threewater;

import com.threewater.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: Yessirskiii
 * @Date: 2022/04/02/20:58
 * @Description:
 */
@SpringBootTest
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @Test
    public void testTextMail() {
        mailClient.sendMail("248751193@qq.com", "TEST", "Welcome.");
    }

}
