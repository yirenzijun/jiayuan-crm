package com.jiayuan.crm.basetestjiayuancloud;

import com.jiayuan.crm.basetestjiayuancloud.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTestJiayuanCloudApplicationTests {

    //模拟调用controller的借口发起请求
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{
        mvc=MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void contextLoads() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello world"));
    }

}
