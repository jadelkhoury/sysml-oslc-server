package org.oasis.oslcop.sysml.resources;

import java.net.URISyntaxException;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.oasis.oslcop.sysml.resources.SysmlDomainConstants;
// Start of user code imports
import com.google.gson.JsonElement;
import org.oasis.oslcop.sysml.ServiceProviderInfo;
import javax.servlet.http.HttpServletRequest;

@OslcNamespace("http://omg.org/ns/sysml#")
@OslcName("Subsetting")
@OslcResourceShape(title = "Element Resource Shape", describes = "http://omg.org/ns/sysml#Subsetting")
public class Subsetting
    extends Element
{

    public Subsetting() {
    }
    
    public Subsetting(final HttpServletRequest httpServletRequest, final ServiceProviderInfo info, final String id, JsonElement elementE) throws URISyntaxException {
		super();
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.ELEMENT_PATH,
        Subsetting.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Element Resource} - update Element.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        // Provide a more useful string representation
        result = getTitle();
        if (result == null) result = getIdentifier();
        result += "::"+getType();
        // End of user code
    
        return result;
    }
    
    
}
