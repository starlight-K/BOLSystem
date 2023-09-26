package pers.bol.core.service.impl;

import pers.bol.core.pojo.entity.UserBind;
import pers.bol.core.mapper.UserBindMapper;
import pers.bol.core.service.IUserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author zhg
 * @since 2023-09-26
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements IUserBindService {

}
