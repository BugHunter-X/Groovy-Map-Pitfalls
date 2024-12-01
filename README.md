# Groovy Map Pitfalls
This repository demonstrates common pitfalls encountered when working with maps in Groovy, specifically:
1. Using safe navigation (?. operator) with non-existent keys.
2. Attempting to modify an immutable map.

## Bug
The `bug.groovy` file showcases these issues. It defines a simple map and attempts to access a non-existent key using the safe navigation operator. 
It then attempts to add a new key-value pair to the map. The safe navigation operator returns null, and modification attempt fails silently, without causing an exception which may make the bug harder to find

## Solution
The `bugSolution.groovy` file provides a corrected version of the code. It demonstrates how to handle non-existent keys safely, check if a key exists before accessing, and illustrates how to create and use mutable maps correctly.