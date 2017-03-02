# Notes

* 	OCL constraints evaluation fails when applied to static UML profiles, see [bug 482143](https://bugs.eclipse.org/bugs/show_bug.cgi?id=482143). An example of this is the `Publish-Subscribe::Resource::ownerIsService` constraint. 

	As a consequence of this, the *Invariant Constrains* and *Validation Delegates* are set to *Ignore* in the wizard to synchronize the `*.genmodel` and `*.ecore` files.