# Modules folder

This `modules` folder contains reorganized copies of the project's example modules. Each module follows a simple layout:

- modules/<ModuleName>/src/*.java

What I created:

- modules/Polymorphism/src/*  - polymorphism examples (Animal, Dog, Cat, Main)
- modules/Method_overloading/src/* - method overloading examples (Calculator, Main)
- modules/Final_examples/src/* - final examples (Animal, Example, Main placeholder)
- modules/Encapsulation/src/* - encapsulation examples (Student, Student1, Encapsulation, Main)
- modules/RootProject/src/* - copies of top-level src files (Title, Main, Final)

Notes:
- I moved the original Java source files into this `modules/` layout and removed the original `src` / module folders. The originals now live under:
  - `modules/RootProject/src/` (top-level sources)
  - `modules/Polymorphism/src/`
  - `modules/Method_overloading/src/`
  - `modules/Final_examples/src/`
  - `modules/Encapsulation/src/`
  
  The project's `title.iml` was updated to add these new source roots. You may need to reload the project in IntelliJ (File > Invalidate Caches / Restart or right-click the project and select "Reload from Disk") for the IDE to pick up the changes.
- Many classes are in the default package (no package declaration). If you plan to build these modules with a build tool (Maven/Gradle) or compile them together, you should add package declarations and update imports accordingly.
- If you want me to further reorganize (convert each module to Maven/Gradle submodules, add package declarations, or remove leftover .iml files), tell me which option to take and I will proceed.


