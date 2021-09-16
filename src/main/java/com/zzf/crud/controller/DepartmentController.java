package com.zzf.crud.controller;

import com.zzf.crud.bean.Department;
import com.zzf.crud.bean.Msg;
import com.zzf.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zzf
 * @create 2021-09-14 0:39
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list =  departmentService.getDepts();
        return Msg.success().add("depts",list);
    }
}
