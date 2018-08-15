package RentingHouse;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

import com.yc.biz.UserBiz;
import com.yc.dao.BaseDao;

@RunWith(SpringJUnit4ClassRunner.class)   
/**
 * 此处应该注意,不要引入controller的spring扫描xml,会引发jar功能冲突
 */
@ContextConfiguration(locations = {"classpath*:beans.xml","classpath*:beans-dao.xml"})    
public class BaseJunitTest {  
	
	//引入Service,DAO层的方法测试
	@Resource(name="userBizImpl")
	private UserBiz userBiz;

	
	@Test
	public void test(){
		System.out.println(userBiz.getUserById(1));
		System.out.println();
	}
	
	
} 
