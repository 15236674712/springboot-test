package com.baizhi.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mysql")
public class JDBCProp {

    private String DriverClassName;
    private String url;
    private String username;
    private String password;

}
