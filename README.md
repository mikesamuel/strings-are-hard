# To reproduce

https://youtrack.jetbrains.com/issue/KT-39432

This uses Kotlin multiplatform with *linuxX64* so will probably only build if you
are on that kind of machine or are set up to cross-compile.

Clone this repo into newly created subdirectory, `strings-are-hard`.

```sh
cd strings-are-hard
gradle wrapper
gradle check
```
