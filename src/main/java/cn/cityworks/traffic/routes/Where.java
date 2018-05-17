package cn.cityworks.traffic.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * create by afterloe on 2018/5/17
 */
@RestController
@RequestMapping("v1/where")
public class Where implements Serializable {

    @RequestMapping(method = RequestMethod.GET)
    public Object index(@RequestParam(name = "carNo",
            required = false, defaultValue = "没有车辆") String carNo) {
        Map res = new HashMap();
        res.put("code", 200);
        res.put("data", carNo);
        res.put("msg", null);
        return res;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Object upload() {
        Map res = new HashMap();
        res.put("code", 200);
        res.put("data", "上传成功");
        res.put("msg", null);
        return res;
    }
}
