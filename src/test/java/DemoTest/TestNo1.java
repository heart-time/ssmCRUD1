package DemoTest;

import com.atguigu.crud.mapper.DeptMapper;
import com.atguigu.crud.mapper.EmpMapper;
import com.atguigu.crud.pojo.Dept;
import com.atguigu.crud.pojo.Emp;
import com.atguigu.crud.pojo.EmpExample;
import com.atguigu.crud.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * @author 欧阳中华
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:Spring.xml"})
public class TestNo1 {
    @Autowired
    DeptMapper deptMapper;
    @Autowired
    EmpMapper empMapper;
    @Autowired
    SqlSession sqlSession;
    @Test
    public   void  demo(){
//     deptMapper.insertSelective(new Dept(null,"测试部"));
//     deptMapper.insertSelective(new Dept(null,"研发部"));
//        System.out.println("插入成功");


//        for (int i = 0; i <1000 ; i++) {
//            //uuid太长，截取前面五位
//            String  uid=UUID.randomUUID().toString().substring(0,5)+i;
//            Emp emp=new Emp(null,uid,"男",uid+"atguigu@123",2);
//            empMapper.insertSelective(emp);
//        }
//        System.out.println("插入成功");
//        Emp emp = empMapper.selectByPrimaryKeyWithDept(3);
//        System.out.println(emp);
        EmpExample empExample=new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("李四");
        List<Emp> emps = empMapper.selectByExampleWithDept(empExample);
        for (Emp emp :emps) {
            System.out.println(emps);
        }

    }
}
