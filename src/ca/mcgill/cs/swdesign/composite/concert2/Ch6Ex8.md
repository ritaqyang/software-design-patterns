## Exercise 8

To add a method `iterator()` to the interface of `Show` our best bet is to declare `Show` to extend `Iterable<Show>` so that we also benefit from the subtyping relationship this introduces:

```java
public interface Show extends Iterable<Show>
```

The advantage of this solution is that client code can be more polymorphic:

```java
Show show = ...;
for( Show subshow : show ) 
{ /* ... */ } // Not executed if an empty iterator is returned.
```

The disadvantage of this approach is that an implementation of `iterator()` must also be supplied for classes that have nothing to unpack. However, with Java 8 it is a relatively minor concern because we can declare a default method that returns an empty iterator in the `Show` interface:

```java
@Override
default Iterator<Show> iterator()
{
   return Collections.emptyIterator();
}
```

