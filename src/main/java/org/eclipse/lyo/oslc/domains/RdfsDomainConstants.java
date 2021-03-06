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

package org.eclipse.lyo.oslc.domains;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.oasis.oslcop.sysml.resources.RdfsVocabularyConstants;

// Start of user code imports
// End of user code

public interface RdfsDomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String RDFS_DOMAIN = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE = "http://www.w3.org/2000/01/rdf-schema#";
    public static String RDFS_NAMSPACE_PREFIX = "rdfs";

    public static String CLASS_PATH = "class";
    public static String CLASS_NAMESPACE = RdfsVocabularyConstants.RDFS_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String CLASS_LOCALNAME = "Class"; //localName of the rdfs:class the resource describes
    public static String CLASS_TYPE = CLASS_NAMESPACE + CLASS_LOCALNAME; //fullname of the rdfs:class the resource describes
}
