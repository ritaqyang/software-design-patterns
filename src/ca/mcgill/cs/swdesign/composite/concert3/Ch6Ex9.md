## Exercise 9

Create a new class `DoubleBill` that represents a sequence of exactly two movies, but that is *not* a Decorator. Make sure your implementation respects the requirement expressed in Exercise 8.

## Exercise 10

Implement a copy constructor for `Concert`, `Movie`, and `DoubleBill`, in this order. Assume all `Show` object need to be copied deeply (which includes making copies of the object stored in fields of any type except primitive types and `String`). Then implement a copy constructor for `IntroducedShow`. Why is the solution problematic?

## Exercise 11

Add support for *polymorphic copying* into the `Show` type hierarchy. Add a `copy()` method to the `Show` interface with the semantics that it does a deep copy of the object as defined for Exercise 10.
