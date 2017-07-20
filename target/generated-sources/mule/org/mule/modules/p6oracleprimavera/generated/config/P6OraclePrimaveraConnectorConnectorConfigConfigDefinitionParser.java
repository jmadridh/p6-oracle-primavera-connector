
package org.mule.modules.p6oracleprimavera.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.devkit.internal.lic.AbstractEEDefinitionParser;
import org.mule.modules.p6oracleprimavera.config.ConnectorConfig;
import org.mule.modules.p6oracleprimavera.generated.adapters.P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T07:06:23+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class P6OraclePrimaveraConnectorConnectorConfigConfigDefinitionParser
    extends AbstractEEDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(P6OraclePrimaveraConnectorConnectorConfigConfigDefinitionParser.class);

    public String moduleName() {
        return "P6OraclePrimavera";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter.class);
        setDestroyMethodIfNeeded(builder, P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter.class);
        BeanDefinitionBuilder wsdlProviderStrategyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ConnectorConfig.class.getName());
        if (hasAttribute(element, "requesterConfig-ref")) {
            wsdlProviderStrategyBuilder.addPropertyValue("requesterConfig", new RuntimeBeanReference(element.getAttribute("requesterConfig-ref")));
        }
        parseProperty(wsdlProviderStrategyBuilder, element, "username", "username");
        parseProperty(wsdlProviderStrategyBuilder, element, "password", "password");
        builder.addPropertyValue("config", wsdlProviderStrategyBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(P6OraclePrimaveraConnectorConnectorConfigWsdlProviderAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config] within the connector [p6-oracle-primavera] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config] within the connector [p6-oracle-primavera] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
