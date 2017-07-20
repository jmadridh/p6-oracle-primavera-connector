
package org.mule.modules.p6oracleprimavera.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.p6oracleprimavera.P6OraclePrimaveraConnector;


/**
 * A <code>P6OraclePrimaveraConnectorCapabilitiesAdapter</code> is a wrapper around {@link P6OraclePrimaveraConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T07:06:23+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class P6OraclePrimaveraConnectorCapabilitiesAdapter
    extends P6OraclePrimaveraConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
