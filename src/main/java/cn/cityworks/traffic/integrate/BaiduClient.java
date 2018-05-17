package cn.cityworks.traffic.integrate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;

public interface BaiduClient extends Serializable {

    // http://baidu.com/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getIndex();
}
