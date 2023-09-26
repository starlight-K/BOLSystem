package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.LendReturn;
import pers.bol.core.mapper.LendReturnMapper;
import pers.bol.core.service.ILendReturnService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 还款记录表 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class LendReturnServiceImpl extends ServiceImpl<LendReturnMapper, LendReturn> implements ILendReturnService {

}
