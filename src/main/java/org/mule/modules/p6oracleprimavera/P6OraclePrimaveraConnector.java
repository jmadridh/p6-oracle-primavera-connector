package org.mule.modules.p6oracleprimavera;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.p6oracleprimavera.config.ConnectorConfig;

@Connector(name="p6-oracle-primavera", friendlyName="P6OraclePrimavera", minMuleVersion = "3.7")
public class P6OraclePrimaveraConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}