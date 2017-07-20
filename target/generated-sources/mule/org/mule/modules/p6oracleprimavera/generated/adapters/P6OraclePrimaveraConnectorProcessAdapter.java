
package org.mule.modules.p6oracleprimavera.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.p6oracleprimavera.P6OraclePrimaveraConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>P6OraclePrimaveraConnectorProcessAdapter</code> is a wrapper around {@link P6OraclePrimaveraConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T06:40:26+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class P6OraclePrimaveraConnectorProcessAdapter
    extends P6OraclePrimaveraConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<P6OraclePrimaveraConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, P6OraclePrimaveraConnectorCapabilitiesAdapter> getProcessTemplate() {
        final P6OraclePrimaveraConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,P6OraclePrimaveraConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, P6OraclePrimaveraConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, P6OraclePrimaveraConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
