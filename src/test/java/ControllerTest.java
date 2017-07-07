import com.muyundefeng.config.MyAppConfig;
import com.muyundefeng.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by lisheng on 17-7-7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyAppConfig.class)
public class ControllerTest {

    @Test
    public void testHomeContoller() {
        HomeController controller = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        //模拟request请求
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/home?name=tom")).andExpect(MockMvcResultMatchers.content().string(10+""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
