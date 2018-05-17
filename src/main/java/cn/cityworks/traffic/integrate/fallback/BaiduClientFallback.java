package cn.cityworks.traffic.integrate.fallback;

import cn.cityworks.traffic.integrate.BaiduClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * create by afterloe on 2018/5/17
 */
@Component
public class BaiduClientFallback implements FallbackFactory<BaiduClient> {

    private static Logger LOGGER = LoggerFactory.getLogger(BaiduClient.class);
    private BaiduClient fallback;

    @Override
    public BaiduClient create(Throwable cause) {
        LOGGER.error(cause.getLocalizedMessage());
        return fall();
    }

    private BaiduClient fall() {
        return fallback == null? fallback = () -> {
            LOGGER.error("invoke getIndex() failed.");
            return "no such network";
        } : fallback;
    }
}
