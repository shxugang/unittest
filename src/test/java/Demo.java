import com.god.unittest.handler.report.ExecutionReport;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.FileNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class Demo {

    // 直接调用方法，执行真实的逻辑
    @InjectMocks
    private ExecutionReport executionReport;

    // mock 对象可以用于初始化mock方法使用, 执行 thenXXX 后面的逻辑，比如返回或者抛异常等
    @Mock
    private ExecutionReport report;

    @Before
    public void setup() throws Exception {
        when(report.say("/aa.txt")).thenThrow(new FileNotFoundException("文件不存在"));
    }

    @Test
    public void testSay() throws Exception{
        try {
            executionReport.say("/aa.log");
        } catch (Exception e) {
            System.err.println("异常 " + e.getMessage());
        }
        try {
            // 调用的方法需要签名，参数，等都和setup方法里的定义绝对一致
            report.say("/aa.txt");
        } catch (Exception e) {
            System.err.println("异常2 " + e.getMessage());
        }
    }
}
