package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.BorrowInfo;
import pers.bol.core.mapper.BorrowInfoMapper;
import pers.bol.core.service.IBorrowInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款信息表 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class BorrowInfoServiceImpl extends ServiceImpl<BorrowInfoMapper, BorrowInfo> implements IBorrowInfoService {

}
