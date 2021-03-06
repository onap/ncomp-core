
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Instance Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEName <em>EName</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchInstanceOf()
 * @model
 * @generated
 */
public interface FunctionMatchInstanceOf extends FunctionMatch {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' attribute.
	 * @see #setEPackage(String)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchInstanceOf_EPackage()
	 * @model unique="false"
	 * @generated
	 */
	String getEPackage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEPackage <em>EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' attribute.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(String value);

	/**
	 * Returns the value of the '<em><b>EName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EName</em>' attribute.
	 * @see #setEName(String)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchInstanceOf_EName()
	 * @model unique="false"
	 * @generated
	 */
	String getEName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEName <em>EName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EName</em>' attribute.
	 * @see #getEName()
	 * @generated
	 */
	void setEName(String value);

} // FunctionMatchInstanceOf
