/**
 */
package gov.sandia.dart.workflow.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.sandia.dart.workflow.domain.Port#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.sandia.dart.workflow.domain.DomainPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends NamedObjectWithProperties {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.sandia.dart.workflow.domain.DomainPackage#getPort_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.sandia.dart.workflow.domain.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Port
