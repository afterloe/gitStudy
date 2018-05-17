package cn.cityworks.traffic.routes;

import cn.cityworks.traffic.integrate.BaiduClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * create by afterloe on 2018/5/17
 */
@RestController
@RequestMapping("v1/baidu")
public class Baidu implements Serializable {

    @Autowired
    private BaiduClient baiduClient;

    @RequestMapping
    public Object index() {
        return baiduClient.getIndex();
    }
}
