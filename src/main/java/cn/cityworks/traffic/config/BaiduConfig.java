package cn.cityworks.traffic.config;

import cn.cityworks.traffic.integrate.BaiduClient;
import cn.cityworks.traffic.integrate.fallback.BaiduClientFallback;
import feign.Contract;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.hystrix.HystrixFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.Serializable;

/**
 * create by afterloe on 2018/5/17
 */
@Configuration
@Import(FeignClientsConfiguration.class)
public class BaiduConfig implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaiduClient.class);

    @Value("${extends.baidu.url:http://baidu.com}")
    private String url;

    @Bean
    @Autowired
    public BaiduClient buildBaiduClient(Decoder decoder, Encoder encoder, Contract contract, BaiduClientFallback fallback) {
        LOGGER.info("find url is {}", url);
        return HystrixFeign.builder()
                .contract(contract)
                .encoder(encoder)
                .decoder(decoder)
                .target(BaiduClient.class, url, fallback);
    }
}
