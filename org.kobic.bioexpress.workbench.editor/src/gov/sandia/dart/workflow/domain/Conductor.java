/**
 */
package gov.sandia.dart.workflow.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.sandia.dart.workflow.domain.Conductor#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see gov.sandia.dart.workflow.domain.DomainPackage#getConductor()
 * @model
 * @generated
 */
public interface Conductor extends NamedObjectWithProperties {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gov.sandia.dart.workflow.domain.WFNode#getConductors <em>Conductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(WFNode)
	 * @see gov.sandia.dart.workflow.domain.DomainPackage#getConductor_Node()
	 * @see gov.sandia.dart.workflow.domain.WFNode#getConductors
	 * @model opposite="conductors"
	 * @generated
	 */
	WFNode getNode();

	/**
	 * Sets the value of the '{@link gov.sandia.dart.workflow.domain.Conductor#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(WFNode value);

} // Conductor
