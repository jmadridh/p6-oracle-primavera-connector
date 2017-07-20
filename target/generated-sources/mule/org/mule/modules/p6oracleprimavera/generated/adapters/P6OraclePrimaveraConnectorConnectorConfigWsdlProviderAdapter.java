
package org.mule.modules.p6oracleprimavera.generated.adapters;

import com.google.common.base.Optional;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.NotImplementedException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.Disposable;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.devkit.api.ws.authentication.WsdlSecurityStrategy;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.devkit.api.ws.transport.WsdlTransport;
import org.mule.devkit.internal.ws.common.WSResolver;
import org.mule.devkit.internal.ws.common.WsdlAdapter;
import org.mule.devkit.internal.ws.connection.DefaultProcessTemplate;
import org.mule.devkit.internal.ws.metadata.WsdlMetaDataDescriptor;
import org.mule.devkit.internal.ws.model.DefaultWSResolver;
import org.mule.devkit.internal.ws.model.SoapBodyEnricher;
import org.mule.modules.p6oracleprimavera.P6OraclePrimaveraConnector;
import org.mule.modules.p6oracleprimavera.config.ConnectorConfig;
import org.w3c.dom.Document;


/**
 * A <code>P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter</code> is a wrapper around {@link P6OraclePrimaveraConnector } that represents the WSDL generic connector {@link ConnectorConfig }
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T06:40:26+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter implements ProcessAdapter<WsdlAdapter> , Disposable, ConnectorMetaDataEnabled, WsdlAdapter
{

    private WSResolver wsResolver;
    private ConnectorConfig config;
    protected P6OraclePrimaveraConnectorProcessAdapter connector;

    /**
     * Retrieves config
     * 
     */
    public ConnectorConfig getConfig() {
        return this.config;
    }

    /**
     * Sets config
     * 
     * @param value Value to set
     */
    public void setConfig(ConnectorConfig value) {
        this.config = value;
    }

    private synchronized void initializeConnectorAdapter()
        throws Exception
    {
        if (connector == null) {
            connector = new P6OraclePrimaveraConnectorProcessAdapter();
            connector.setConfig(getConfig());
            connector.initialise();
        }
    }

    /**
     * Retrieves connector
     * 
     */
    public P6OraclePrimaveraConnectorProcessAdapter getConnector() {
        if (connector == null) {
            try {
                initializeConnectorAdapter();
            } catch (Exception e) {
                throw new RuntimeException("An error occurred while creating the connector instance", e);
            }
        }
        return this.connector;
    }

    @Override
    public void dispose() {
        if (wsResolver!= null) {
            wsResolver.dispose();
            wsResolver = null;
        }
        if (connector!= null) {
            connector.dispose();
            connector = null;
        }
    }

    @Override
    public List<ServiceDefinition> serviceDefinitions()
        throws Exception
    {
        return getConfig().getServiceDefinitions();
    }

    @Override
    public String endpoint(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return getConfig().getServiceEndpoint(serviceDefinition);
    }

    @Override
    public String wsdlSeparator() {
        return "||";
    }

    @Override
    public List<WsdlSecurityStrategy> security(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return getConfig().getWsdlSecurityResolver(serviceDefinition);
    }

    @Override
    public WsdlTransport transport(ServiceDefinition serviceDefinition) {
        return null;
    }

    @Override
    public Optional<List<Document>> headers(ServiceDefinition serviceDefinition, String operationName)
        throws Exception
    {
        return Optional.fromNullable(null);
    }

    private synchronized void initializeWsResolver()
        throws Exception
    {
        if (wsResolver == null) {
            wsResolver = new DefaultWSResolver(this);
        }
    }

    @Override
    public WSResolver wsResolver()
        throws Exception
    {
        initializeWsResolver();
        return wsResolver;
    }

    @Override
    public Optional<String> singleServiceDefinitionId()
        throws Exception
    {
        return Optional.absent();
    }

    @Override
    public void handleException(Exception e)
        throws Exception
    {
        // No handler found
    }

    @Override
    public List<Class<? extends Exception>> managedExceptions() {
        return null;
    }

    @Override
    public Optional<? extends SoapBodyEnricher> bodyEnricher() {
        return Optional.absent();
    }

    @Override
    public Result<List<MetaDataKey>> getMetaDataKeys() {
        WsdlMetaDataDescriptor wsdlMetaDataResolver = new WsdlMetaDataDescriptor();
        return wsdlMetaDataResolver.getMetaDataKeys(this);
    }

    @Override
    public Result<MetaData> getMetaData(MetaDataKey metaDataKey) {
        throw new NotImplementedException("A Processor is required in order to fetch MetaData");
    }

    public<P >ProcessTemplate<P, WsdlAdapter> getProcessTemplate() {
        return new DefaultProcessTemplate<P, WsdlAdapter>(this);
    }

}
