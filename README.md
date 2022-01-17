<div align="center">
  <h1> Iterator  </h1>
</div>

# Code

Simple project representing the Iterator design pattern. For this one, i made three classes representing a functioning restaurant. 

# Definition

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

![image](https://user-images.githubusercontent.com/40416044/149768939-7af7e7ed-ef6e-4d33-95f1-263e0361638e.png)

# What problems can the Iterator design pattern solve? 

- The elements of an aggregate object should be accessed and traversed without exposing its representation (data structures).
- New traversal operations should be defined for an aggregate object without changing its interface.

Defining access and traversal operations in the aggregate interface is inflexible because it commits the aggregate to particular access and traversal operations and makes it impossible to add new operations later without having to change the aggregate interface.

Source: <a href="https://en.wikipedia.org/wiki/Iterator_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/iterator"> Refactoring Guru </a>
