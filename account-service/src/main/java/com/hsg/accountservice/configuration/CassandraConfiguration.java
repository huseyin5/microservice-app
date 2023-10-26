package com.hsg.accountservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {
    @Override
    protected String getKeyspaceName() {
        return "keyspace";
    }

    public String[] getEntityBasePackages() {
        return new String[]{"com.hsg.accountservice.entity"};
    }
}