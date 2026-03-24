import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@Autowired
private MockMvc mockMvc;

@Test
@DisplayName("GET /test 요청 시 Hello World반환")
void getTestAPI() throws Exception {

    mockMvc.perform(get("/test"))
            .andExpect(status().isOk())
            .andExpect(content()string("Hello World"))
            .andDo(print());
}
