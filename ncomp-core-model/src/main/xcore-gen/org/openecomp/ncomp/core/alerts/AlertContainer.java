
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
package org.openecomp.ncomp.core.alerts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.AlertContainer#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.AlertContainer#getAlertingTemplate <em>Alerting Template</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlertContainer()
 * @model abstract="true"
 * @generated
 */
public interface AlertContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Alerts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.alerts.Alert}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alerts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerts</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlertContainer_Alerts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alert> getAlerts();

	/**
	 * Returns the value of the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alerting Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerting Template</em>' reference.
	 * @see #setAlertingTemplate(AlertingTemplate)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlertContainer_AlertingTemplate()
	 * @model
	 * @generated
	 */
	AlertingTemplate getAlertingTemplate();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.AlertContainer#getAlertingTemplate <em>Alerting Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alerting Template</em>' reference.
	 * @see #getAlertingTemplate()
	 * @generated
	 */
	void setAlertingTemplate(AlertingTemplate value);

} // AlertContainer
