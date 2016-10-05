# CPN Tools Metamodel Plug-in

This plug-in contains the definition and implementation of the CPN Tools metamodel, according to the following specification.

![CPN Tools metamodel](model/cpntools.png)

## Modifications to the default generated code (i.e., @generated not)

### `io.github.abelgomez.cpntools.impl.CompoundColorSetImpl#getSimpleColors()`

Default generated code:

```
/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated not
 */
public EList<SimpleColorSet> getSimpleColors() {
	if (simpleColors == null) {
		simpleColors = new EObjectResolvingEList<SimpleColorSet>(
			SimpleColorSet.class, this, CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS);
	return simpleColors;
}
```

Modified version (due to bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=89325):

```
/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated not
 */
public EList<SimpleColorSet> getSimpleColors() {
	if (simpleColors == null) {
		simpleColors = new EObjectResolvingEList<SimpleColorSet>(
				SimpleColorSet.class, this, CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS)
		{
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean isUnique() {
				return CpntoolsPackage.eINSTANCE.getCompoundColorSet_SimpleColors().isUnique();
			}
		};
	}
	return simpleColors;
}
```

