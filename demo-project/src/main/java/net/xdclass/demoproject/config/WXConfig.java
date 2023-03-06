package net.xdclass.demoproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

@Configuration
@PropertySource(value = "classpath:pay.properties")
public class WXConfig implements Serializable {

    @Value("${wxpay.appid}")
    private String payAppid;

    @Value("${wxpay.secret}")
    private String paySecret;

    @Value("${wxpay.mechid}")
    private String payMechId;

    public String getPayAppid() {
        return payAppid;
    }

    public void setPayAppid(String payAppid) {
        this.payAppid = payAppid;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getPayMechId() {
        return payMechId;
    }

    public void setPayMechId(String payMechId) {
        this.payMechId = payMechId;
    }
}
