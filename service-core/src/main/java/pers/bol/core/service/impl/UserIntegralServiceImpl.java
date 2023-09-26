package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.UserIntegral;
import pers.bol.core.mapper.UserIntegralMapper;
import pers.bol.core.service.IUserIntegralService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户积分记录表 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class UserIntegralServiceImpl extends ServiceImpl<UserIntegralMapper, UserIntegral> implements IUserIntegralService {

}
