package pers.bol.core.controller.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import pers.bol.common.result.R;
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
@Api(tags = "积分等级管理")
@RequestMapping("/admin/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IIntegralGradeService iIntegralGradeService;

    @GetMapping("/list")
    public R listAll() {
        List<IntegralGrade> list = iIntegralGradeService.list();
        return R.ok().data("list",list).message("获取数据列表成功").code(2000);
    }

    @DeleteMapping("/remove/{id}")
    public R removeById(@ApiParam(value = "数据id",required = true,example = "2") @PathVariable Long id) {
        boolean b = iIntegralGradeService.removeById(id);
        return b  ? R.ok().message("删除成功"):R.error().message("删除失败");
    }
}

