package com.example.demo.configProperties;/**
 * Created by Administrator on 2018-05-22.
 */

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xuzhiyong
 * @createDate 2018-05-22-13:46
 */
@ConfigurationProperties(prefix = "app")
@Data
@Accessors(chain = true)
public class AppProperties {
    private String appname;
    private String appcopyright;
    private String appyear;
}
