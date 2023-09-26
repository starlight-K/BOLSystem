package pers.bol.core.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import pers.bol.core.pojo.entity.IntegralGrade;
import pers.bol.core.service.IIntegralGradeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@RestController
@RequestMapping("/web")
public class IntegralGradeController {

    @Resource
    IIntegralGradeService iIntegralGradeService;


    @GetMapping("test")
    public List<IntegralGrade> test() {
        return iIntegralGradeService.list();
    }
}

