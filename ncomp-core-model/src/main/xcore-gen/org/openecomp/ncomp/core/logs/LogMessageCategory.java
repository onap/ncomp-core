
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.core.logs;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageCategory#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageCategory()
 * @model
 * @generated
 */
public interface LogMessageCategory extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.logs.LogMessageStats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageCategory_Stats()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogMessageStats> getStats();

} // LogMessageCategory
