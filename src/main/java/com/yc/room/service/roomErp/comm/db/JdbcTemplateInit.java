package com.yc.room.service.roomErp.comm.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * xing.yang
 */
@Component
public class JdbcTemplateInit {

    @Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(@Qualifier("baseDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
