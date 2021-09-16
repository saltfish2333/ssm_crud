package com.zzf.crud.test;

import com.zzf.crud.bean.Department;
import com.zzf.crud.bean.Employee;
import com.zzf.crud.dao.DepartmentMapper;
import com.zzf.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;
import java.util.UUID;

/**
 * @author zzf
 * @create 2021-09-13 13:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    SqlSession sqlSession;
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void testCRUD() {
        System.out.println(employeeMapper);
        /*departmentMapper.insertSelective(new Department(null, "开发部"));
        departmentMapper.insertSelective(new Department(null,"测试部"));*/
        /*employeeMapper.insertSelective(new Employee(null,"邢道荣","M","xingdaorong@163.com",1));
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0;i< 1000;i++){
            String uuid = UUID.randomUUID().toString().substring(0, 5)+i;
            mapper.insertSelective(new Employee(null,uuid,"M",uuid+"@qq.com",2));
        }
        System.out.println("批量插入完成");*/
        Employee employee = employeeMapper.selectByPrimaryKeyWithDept(1);
        System.out.println(employee.getEmpName());
    }
}
