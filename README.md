# Petri net modeling of the Publish-Subscribe paradigm

This repository contains the plugins to transform services following the publish-subscribe paradigm into colored Petri nets. Models are created using Papyrus UML2. Such models are later  annotated with the provided *publish-subscribe* profile.

This repository contains the following artifacts:

## Plug-ins

### [io.github.abelgomez.cpntools](io.github.abelgomez.cpntools/README.md)

EMF [metamodel](io.github.abelgomez.cpntools/model/cpntools.pdf) for the [CPN Tools](http://cpntools.org/) tool. The metamodel resembles the structure of the normative XML used by CPN Tools to persist Petri nets.

### [io.github.abelgomez.cpntools.io](io.github.abelgomez.cpntools.io)

Plug-in containing the classes to serialize EMF-compatible Petri nets to the normative CPN Tools XML format.

### io.github.abelgomez.cpntools.io.test

Test plug-in containing some sample code demonstrating how the serialization is invoked.

### io.github.abelgomez.ps.example

Simple plug-in containing some example models.

### io.github.abelgomez.ps.profile

Plug-in containing the profile to annotate UML models of services following the publish-subscribe pattern.

### io.github.abelgomez.ps.transformer

M2M transformation from the UML2 metamodel (+ publish-subscribe annotations) to the CPN Tools metamodel.

### io.github.abelgomez.ps.transformer.test

Test plug-in containing some sample code demonstrating how the transformation is invoked.

### io.github.abelgomez.ps.transformer.ui

Plug-in containing the UI contributions, i.e., preference pages, pop-up menus and dialogs.

## Features

### io.github.abelgomez.cpntools.feature

Feature for the CPN Tools metamodels and I/O utilities.

### io.github.abelgomez.ps.feature

Feature for the Publish-Subscribe profile and associated transformations.

### io.github.abelgomez.ps.ui.feature

Feature for the UI contributions.

### io.github.abelgomez.ps.sdk.feature

Feature for the SDK. Includes all the previous features, together with QVTo SDK and Papyrus SDK.
