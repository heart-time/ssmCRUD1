//package DemoTest;
//
//import com.atguigu.crud.utils.GetSqlSession;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//
//import java.util.List;
//
///**
// * @author 欧阳中华
// * @version 1.0
// */
//public class Test1 {
//    @Test
//    public void Test23(){
//        SqlSession sqlSession = GetSqlSession.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        EmpExample empExample=new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三");
//        List<Emp> emps = mapper.selectByExample(empExample);
//        for (Emp emp :emps) {
//            System.out.println(emp);
//        }
//
//    }
//}
