package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.LendItem;
import pers.bol.core.mapper.LendItemMapper;
import pers.bol.core.service.ILendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements ILendItemService {

}
