// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 * 
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml.resources;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;


// Start of user code imports
// End of user code

public interface SysmlDomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String SYSML_DOMAIN = "http://oasis.oslc-op/ns/sysml#";
    public static String SYSML_NAMSPACE = "http://oasis.oslc-op/ns/sysml#";
    public static String SYSML_NAMSPACE_PREFIX = "sysml";

    public static String ELEMENT_PATH = "element";
    public static String ELEMENT_NAMESPACE = SYSML_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String ELEMENT_LOCALNAME = "Element"; //localName of the rdfs:class the resource describes
    public static String ELEMENT_TYPE = ELEMENT_NAMESPACE + ELEMENT_LOCALNAME; //fullname of the rdfs:class the resource describes
    public static String RELATIONSHIP_PATH = "relationship";
    public static String RELATIONSHIP_NAMESPACE = SYSML_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String RELATIONSHIP_LOCALNAME = "Relationship"; //localName of the rdfs:class the resource describes
    public static String RELATIONSHIP_TYPE = RELATIONSHIP_NAMESPACE + RELATIONSHIP_LOCALNAME; //fullname of the rdfs:class the resource describes
}
