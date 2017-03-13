
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
package org.openecomp.ncomp.component;

import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drools Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.DroolsRule#getNumberOfFires <em>Number Of Fires</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.component.ComponentPackage#getDroolsRule()
 * @model
 * @generated
 */
public interface DroolsRule extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Number Of Fires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Fires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Fires</em>' attribute.
	 * @see #setNumberOfFires(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getDroolsRule_NumberOfFires()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfFires();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.DroolsRule#getNumberOfFires <em>Number Of Fires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Fires</em>' attribute.
	 * @see #getNumberOfFires()
	 * @generated
	 */
	void setNumberOfFires(IncreasingULongMetricAttribute value);

} // DroolsRule
