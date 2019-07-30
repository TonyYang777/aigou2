package cn.itsource.plat.controller;

import cn.itsource.basic.util.Ajaxresult;
import cn.itsource.plat.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class LoginController {
    @ApiOperation("平台登录接口")
//@RequestBody 接收json体形式的请求参数封装到实体类对象中
    @ApiImplicitParams(
            @ApiImplicitParam(name = "登录信息", value = "user")
    )
    @PostMapping("/login")
    public Ajaxresult login(@RequestBody User user){
        System.out.println(user);
        String username = user.getUsername();
        String password = user.getPassword();
        if ("admin".equals(username) && "admin".equals(password)){
            return new Ajaxresult().setMessage("恭喜!!!登录成功").setSuccess(true);
        }
        return new Ajaxresult().setMessage("登录失败").setSuccess(false);
    }


}
