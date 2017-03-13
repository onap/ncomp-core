
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
package org.openecomp.ncomp.core.function;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionUpdateRule#getMatches <em>Matches</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionUpdateRule#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionUpdateRule()
 * @model
 * @generated
 */
public interface FunctionUpdateRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.function.FunctionMatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionUpdateRule_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionMatch> getMatches();

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.function.FunctionUpdate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionUpdateRule_Updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionUpdate> getUpdates();

} // FunctionUpdateRule
