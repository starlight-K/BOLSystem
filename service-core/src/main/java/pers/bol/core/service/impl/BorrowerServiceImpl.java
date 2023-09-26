package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.Borrower;
import pers.bol.core.mapper.BorrowerMapper;
import pers.bol.core.service.IBorrowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款人 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class BorrowerServiceImpl extends ServiceImpl<BorrowerMapper, Borrower> implements IBorrowerService {

}
