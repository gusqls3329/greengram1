package com.green.growgreen.user;

import com.green.growgreen.ResVo;
import com.green.growgreen.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public ResVo postUser(UserInsDto dto){
        String hashedPw = BCrypt.hashpw(dto.getUpw(), BCrypt.gensalt());
        UserInsDto dto1 = new UserInsDto();
        dto1.setUpw(hashedPw);
        int affectedRows = mapper.insUser(dto);
         dto1.setIuser(dto.getIuser());
         dto1.setNm(dto.getNm());
         dto1.setUid(dto.getUid());
         return new ResVo(dto.getIuser());
    }
}
