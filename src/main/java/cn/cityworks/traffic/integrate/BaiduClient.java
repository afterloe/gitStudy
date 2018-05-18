package cn.cityworks.traffic.integrate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

public interface BaiduClient extends Serializable {

    // http://baidu.com/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getIndex();

    @RequestMapping(value = "arcgis/rest/services/USA/MapServer/0", method = RequestMethod.GET)
    String MapServer(@RequestParam(name = "f") String f );
}
