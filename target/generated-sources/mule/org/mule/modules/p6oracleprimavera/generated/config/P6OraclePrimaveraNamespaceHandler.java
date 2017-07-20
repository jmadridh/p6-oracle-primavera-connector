
package org.mule.modules.p6oracleprimavera.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.devkit.internal.ws.model.beans.InvokeDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/p6-oracle-primavera</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T07:06:23+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class P6OraclePrimaveraNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(P6OraclePrimaveraNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [p6-oracle-primavera] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [p6-oracle-primavera] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new P6OraclePrimaveraConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("invoke", new InvokeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("invoke", "@Processor", ex);
        }
    }

}
